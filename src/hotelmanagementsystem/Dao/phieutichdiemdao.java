package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.phieutichdiem;
import Util.JDBCUtils;

public class phieutichdiemdao {

	private final String INSERT_QUERY = "INSERT INTO phieutichdiem (MaPTD, NgayLapPhieu, MaHV, MaQD, BienDongDiem, NguyenNhan) VALUES (?, ?, ?, ?, ?, ?)";
    private final String SELECT_BY_ID_QUERY = "SELECT * FROM phieutichdiem WHERE MaPTD = ?";
    private final String UPDATE_QUERY = "UPDATE phieutichdiem SET NgayLapPhieu = ?, MaHV = ?, MaQD = ?, BienDongDiem = ?, NguyenNhan = ? WHERE MaPTD = ?";
    private final String DELETE_QUERY = "DELETE FROM phieutichdiem WHERE MaPTD = ?";
    private final String SELECT_ALL_QUERY = "SELECT * FROM phieutichdiem";

    public boolean themPhieuTichDiem(phieutichdiem phieuTichDiem) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY)) {
            preparedStatement.setString(1, phieuTichDiem.getMaPTD());
            preparedStatement.setDate(2, new java.sql.Date(phieuTichDiem.getNgayLapPhieu().getTime()));
            preparedStatement.setString(3, phieuTichDiem.getMaHV());
            preparedStatement.setString(4, phieuTichDiem.getMaQD());
            preparedStatement.setInt(5, phieuTichDiem.getBienDongDiem());
            preparedStatement.setString(6, phieuTichDiem.getNguyenNhan());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public boolean xoaPhieuTichDiem(String maPTD) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_QUERY)) {
            preparedStatement.setString(1, maPTD);

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public boolean capNhatPhieuTichDiem(phieutichdiem phieuTichDiem) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_QUERY)) {
            preparedStatement.setDate(1, new java.sql.Date(phieuTichDiem.getNgayLapPhieu().getTime()));
            preparedStatement.setString(2, phieuTichDiem.getMaHV());
            preparedStatement.setString(3, phieuTichDiem.getMaQD());
            preparedStatement.setInt(4, phieuTichDiem.getBienDongDiem());
            preparedStatement.setString(5, phieuTichDiem.getNguyenNhan());
            preparedStatement.setString(6, phieuTichDiem.getMaPTD());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public phieutichdiem layPhieuTichDiemTheoID(String maPTD) {
        phieutichdiem phieuTichDiem = null;
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID_QUERY)) {
            preparedStatement.setString(1, maPTD);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                phieuTichDiem = new phieutichdiem();
                phieuTichDiem.setMaPTD(resultSet.getString("MaPTD"));
                phieuTichDiem.setNgayLapPhieu(resultSet.getDate("NgayLapPhieu"));
                phieuTichDiem.setMaHV(resultSet.getString("MaHV"));
                phieuTichDiem.setMaQD(resultSet.getString("MaQD"));
                phieuTichDiem.setBienDongDiem(resultSet.getInt("BienDongDiem"));
                phieuTichDiem.setNguyenNhan(resultSet.getString("NguyenNhan"));
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return phieuTichDiem;
    }

    public List<phieutichdiem> layTatCaPhieuTichDiem() {
        List<phieutichdiem> danhSachPhieuTichDiem = new ArrayList<>();
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_QUERY)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                phieutichdiem phieuTichDiem = new phieutichdiem();
                phieuTichDiem.setMaPTD(resultSet.getString("MaPTD"));
                phieuTichDiem.setNgayLapPhieu(resultSet.getDate("NgayLapPhieu"));
                phieuTichDiem.setMaHV(resultSet.getString("MaHV"));
                phieuTichDiem.setMaQD(resultSet.getString("MaQD"));
                phieuTichDiem.setBienDongDiem(resultSet.getInt("BienDongDiem"));
                phieuTichDiem.setNguyenNhan(resultSet.getString("NguyenNhan"));
                danhSachPhieuTichDiem.add(phieuTichDiem);
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return danhSachPhieuTichDiem;
    }
}
