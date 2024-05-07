package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.hoivien;
import Util.JDBCUtils;

public class hoiviendao {
	private final String INSERT_QUERY = "INSERT INTO hoivien (MaHV, MaKH, TongDiem, MaCapBac, isXoa) VALUES (?, ?, ?, ?, 0)";
    private final String SELECT_BY_ID_QUERY = "SELECT * FROM hoivien WHERE MaHV = ? AND isXoa = 0";
    private final String UPDATE_QUERY = "UPDATE hoivien SET MaKH = ?, TongDiem = ?, MaCapBac = ? WHERE MaHV = ?";
    private final String DELETE_QUERY = "UPDATE hoivien SET isXoa = 1 WHERE MaHV = ?";
    private final String SELECT_ALL_QUERY = "SELECT * FROM hoivien WHERE isXoa = 0";
    
    
    public boolean themHoivien(hoivien hoivien) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY)) {
            preparedStatement.setString(1, hoivien.getMaHV());
            preparedStatement.setString(2, hoivien.getMaKH());
            preparedStatement.setInt(3, hoivien.getTongDiem());
            preparedStatement.setString(4, hoivien.getMaCapBac());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }
    
    public boolean xoaHoivien(String maHV) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_QUERY)) {
            preparedStatement.setString(1, maHV);

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public boolean capNhatHoivien(hoivien hoivien) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_QUERY)) {
            preparedStatement.setString(1, hoivien.getMaKH());
            preparedStatement.setInt(2, hoivien.getTongDiem());
            preparedStatement.setString(3, hoivien.getMaCapBac());
            preparedStatement.setString(4, hoivien.getMaHV());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }
    public hoivien layHoivienTheoID(String maHV) {
        hoivien hoivien = null;
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID_QUERY)) {
            preparedStatement.setString(1, maHV);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                hoivien = new hoivien();
                hoivien.setMaHV(resultSet.getString("MaHV"));
                hoivien.setMaKH(resultSet.getString("MaKH"));
                hoivien.setTongDiem(resultSet.getInt("TongDiem"));
                hoivien.setMaCapBac(resultSet.getString("MaCapBac"));
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return hoivien;
    }
    
    public List<hoivien> layTatCaHoivien() {
        List<hoivien> danhSachHoivien = new ArrayList<>();
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_QUERY)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                hoivien hoivien = new hoivien();
                hoivien.setMaHV(resultSet.getString("MaHV"));
                hoivien.setMaKH(resultSet.getString("MaKH"));
                hoivien.setTongDiem(resultSet.getInt("TongDiem"));
                hoivien.setMaCapBac(resultSet.getString("MaCapBac"));
                danhSachHoivien.add(hoivien);
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return danhSachHoivien;
    }
}
