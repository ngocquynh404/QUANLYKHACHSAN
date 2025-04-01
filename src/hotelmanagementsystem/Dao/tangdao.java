package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.tang;
import Util.JDBCUtils;

public class tangdao {
	private final String INSERT_QUERY = "INSERT INTO tang (MaTang, TenTang, TrangThai) VALUES (?, ?, ?)";
    private final String SELECT_BY_ID_QUERY = "SELECT * FROM tang WHERE MaTang = ?";
    private final String UPDATE_QUERY = "UPDATE tang SET TenTang = ?, TrangThai = ? WHERE MaTang = ?";
    private final String DELETE_QUERY = "DELETE FROM tang WHERE MaTang = ?";
    private final String SELECT_ALL_QUERY = "SELECT * FROM tang";

    public boolean themTang(tang tang) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY)) {
            preparedStatement.setString(1, tang.getMaTang());
            preparedStatement.setString(2, tang.getTenTang());
            preparedStatement.setString(3, tang.getTrangThai());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public boolean xoaTang(String maTang) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_QUERY)) {
            preparedStatement.setString(1, maTang);

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public boolean capNhatTang(tang tang) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_QUERY)) {
            preparedStatement.setString(1, tang.getTenTang());
            preparedStatement.setString(2, tang.getTrangThai());
            preparedStatement.setString(3, tang.getMaTang());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public tang layTangTheoID(String maTang) {
        tang tang = null;
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID_QUERY)) {
            preparedStatement.setString(1, maTang);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                tang = new tang();
                tang.setMaTang(resultSet.getString("MaTang"));
                tang.setTenTang(resultSet.getString("TenTang"));
                tang.setTrangThai(resultSet.getString("TrangThai"));
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return tang;
    }

    public List<tang> layTatCaTang() {
        List<tang> danhSachTang = new ArrayList<>();
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_QUERY)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                tang tang = new tang();
                tang.setMaTang(resultSet.getString("MaTang"));
                tang.setTenTang(resultSet.getString("TenTang"));
                tang.setTrangThai(resultSet.getString("TrangThai"));
                danhSachTang.add(tang);
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return danhSachTang;
    }
}
