package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.capbachoivien;
import Util.JDBCUtils;

public class capbachoiviendao {
	private final String INSERT_QUERY = "INSERT INTO capbachoivien (MaCapBac, Hang, SoDiemToiThieu, KhuyenMai) VALUES (?, ?, ?, ?)";
    private final String SELECT_BY_ID_QUERY = "SELECT * FROM capbachoivien WHERE MaCapBac = ?";
    private final String UPDATE_QUERY = "UPDATE capbachoivien SET Hang = ?, SoDiemToiThieu = ?, KhuyenMai = ? WHERE MaCapBac = ?";
    private final String DELETE_QUERY = "DELETE FROM capbachoivien WHERE MaCapBac = ?";
    private final String SELECT_ALL_QUERY = "SELECT * FROM capbachoivien";
    
    public boolean themCapBacHoivien(capbachoivien capBac) {
        try (Connection connection = JDBCUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY)) {
            preparedStatement.setString(1, capBac.getMaCapBac());
            preparedStatement.setString(2, capBac.getHang());
            preparedStatement.setInt(3, capBac.getSoDiemToiThieu());
            preparedStatement.setInt(4, capBac.getKhuyenMai());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }
    
    public boolean xoaCapBacHoivien(String maCapBac) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_QUERY)) {
            preparedStatement.setString(1, maCapBac);

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }
    
    public boolean capNhatCapBacHoivien(capbachoivien capBac) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_QUERY)) {
            preparedStatement.setString(1, capBac.getHang());
            preparedStatement.setInt(2, capBac.getSoDiemToiThieu());
            preparedStatement.setInt(3, capBac.getKhuyenMai());
            preparedStatement.setString(4, capBac.getMaCapBac());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }
    
    public capbachoivien layCapBacHoivienTheoID(String maCapBac) {
        capbachoivien capBac = null;
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID_QUERY)) {
            preparedStatement.setString(1, maCapBac);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                capBac = new capbachoivien();
                capBac.setMaCapBac(resultSet.getString("MaCapBac"));
                capBac.setHang(resultSet.getString("Hang"));
                capBac.setSoDiemToiThieu(resultSet.getInt("SoDiemToiThieu"));
                capBac.setKhuyenMai(resultSet.getInt("KhuyenMai"));
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return capBac;
    }
    
    public List<capbachoivien> layTatCaCapBacHoivien() {
        List<capbachoivien> danhSachCapBac = new ArrayList<>();
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_QUERY)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                capbachoivien capBac = new capbachoivien();
                capBac.setMaCapBac(resultSet.getString("MaCapBac"));
                capBac.setHang(resultSet.getString("Hang"));
                capBac.setSoDiemToiThieu(resultSet.getInt("SoDiemToiThieu"));
                capBac.setKhuyenMai(resultSet.getInt("KhuyenMai"));
                danhSachCapBac.add(capBac);
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return danhSachCapBac;
    }
}
