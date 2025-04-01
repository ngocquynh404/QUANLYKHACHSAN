package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.giadichvu;
import Util.JDBCUtils;

public class giadichvudao {
	private final String INSERT_QUERY = "INSERT INTO giadichvu (MaGiaDV, MaGiaThoiDiem, MaDichVu, GiaDichVu) VALUES (?, ?, ?, ?)";
    private final String SELECT_BY_ID_QUERY = "SELECT * FROM giadichvu WHERE MaGiaDV = ?";
    private final String UPDATE_QUERY = "UPDATE giadichvu SET MaGiaThoiDiem = ?, MaDichVu = ?, GiaDichVu = ? WHERE MaGiaDV = ?";
    private final String DELETE_QUERY = "DELETE FROM giadichvu WHERE MaGiaDV = ?";
    private final String SELECT_ALL_QUERY = "SELECT * FROM giadichvu";

    public boolean themGiaDichVu(giadichvu giaDichVu) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY)) {
            preparedStatement.setString(1, giaDichVu.getMaGiaDV());
            preparedStatement.setString(2, giaDichVu.getMaGiaThoiDiem());
            preparedStatement.setString(3, giaDichVu.getMaDichVu());
            preparedStatement.setInt(4, giaDichVu.getGiaDichVu());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public boolean xoaGiaDichVu(String maGiaDV) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_QUERY)) {
            preparedStatement.setString(1, maGiaDV);

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public boolean capNhatGiaDichVu(giadichvu giaDichVu) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_QUERY)) {
            preparedStatement.setString(1, giaDichVu.getMaGiaThoiDiem());
            preparedStatement.setString(2, giaDichVu.getMaDichVu());
            preparedStatement.setInt(3, giaDichVu.getGiaDichVu());
            preparedStatement.setString(4, giaDichVu.getMaGiaDV());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public giadichvu layGiaDichVuTheoID(String maGiaDV) {
        giadichvu giaDichVu = null;
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID_QUERY)) {
            preparedStatement.setString(1, maGiaDV);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                giaDichVu = new giadichvu();
                giaDichVu.setMaGiaDV(resultSet.getString("MaGiaDV"));
                giaDichVu.setMaGiaThoiDiem(resultSet.getString("MaGiaThoiDiem"));
                giaDichVu.setMaDichVu(resultSet.getString("MaDichVu"));
                giaDichVu.setGiaDichVu(resultSet.getInt("GiaDichVu"));
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return giaDichVu;
    }

    public List<giadichvu> layTatCaGiaDichVu() {
        List<giadichvu> danhSachGiaDichVu = new ArrayList<>();
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_QUERY)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                giadichvu giaDichVu = new giadichvu();
                giaDichVu.setMaGiaDV(resultSet.getString("MaGiaDV"));
                giaDichVu.setMaGiaThoiDiem(resultSet.getString("MaGiaThoiDiem"));
                giaDichVu.setMaDichVu(resultSet.getString("MaDichVu"));
                giaDichVu.setGiaDichVu(resultSet.getInt("GiaDichVu"));

                danhSachGiaDichVu.add(giaDichVu);
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return danhSachGiaDichVu;
    }
}
