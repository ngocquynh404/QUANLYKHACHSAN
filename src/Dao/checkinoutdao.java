package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.checkinout;
import Util.JDBCUtils;

public class checkinoutdao {
	private final String INSERT_QUERY = "INSERT INTO checkinout (MaCTPDP, ThoiGianCheckin, ThoiGianCheckout) VALUES (?, ?, ?)";
    private final String SELECT_BY_ID_QUERY = "SELECT * FROM checkinout WHERE MaCTPDP = ?";
    private final String UPDATE_QUERY = "UPDATE checkinout SET ThoiGianCheckin = ?, ThoiGianCheckout = ? WHERE MaCTPDP = ?";
    private final String DELETE_QUERY = "DELETE FROM checkinout WHERE MaCTPDP = ?";
    private final String SELECT_ALL_QUERY = "SELECT * FROM checkinout";

    public boolean themCheckInOut(checkinout checkInOut) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY)) {
            preparedStatement.setString(1, checkInOut.getMaCTPDP());
            preparedStatement.setDate(2, new java.sql.Date(checkInOut.getThoiGianCheckin().getTime()));
            preparedStatement.setDate(3, new java.sql.Date(checkInOut.getThoiGianCheckout().getTime()));

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public boolean xoaCheckInOut(String maCTPDP) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_QUERY)) {
            preparedStatement.setString(1, maCTPDP);

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public boolean capNhatCheckInOut(checkinout checkInOut) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_QUERY)) {
            preparedStatement.setDate(1, new java.sql.Date(checkInOut.getThoiGianCheckin().getTime()));
            preparedStatement.setDate(2, new java.sql.Date(checkInOut.getThoiGianCheckout().getTime()));
            preparedStatement.setString(3, checkInOut.getMaCTPDP());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public checkinout layCheckInOutTheoID(String maCTPDP) {
        checkinout checkInOut = null;
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID_QUERY)) {
            preparedStatement.setString(1, maCTPDP);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                checkInOut = new checkinout();
                checkInOut.setMaCTPDP(resultSet.getString("MaCTPDP"));
                checkInOut.setThoiGianCheckin(resultSet.getDate("ThoiGianCheckin"));
                checkInOut.setThoiGianCheckout(resultSet.getDate("ThoiGianCheckout"));
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return checkInOut;
    }

    public List<checkinout> layTatCaCheckInOut() {
        List<checkinout> danhSachCheckInOut = new ArrayList<>();
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_QUERY)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                checkinout checkInOut = new checkinout();
                checkInOut.setMaCTPDP(resultSet.getString("MaCTPDP"));
                checkInOut.setThoiGianCheckin(resultSet.getDate("ThoiGianCheckin"));
                checkInOut.setThoiGianCheckout(resultSet.getDate("ThoiGianCheckout"));
                danhSachCheckInOut.add(checkInOut);
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return danhSachCheckInOut;
    }
}
