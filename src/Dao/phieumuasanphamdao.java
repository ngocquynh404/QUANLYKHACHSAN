package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.phieumuasanpham;
import Util.JDBCUtils;

public class phieumuasanphamdao {
	private final String INSERT_QUERY = "INSERT INTO phieumuasanpham (MaPMSP, NgayLapPhieu, MaKH, GhiChu) VALUES (?, ?, ?, ?)";
    private final String SELECT_BY_ID_QUERY = "SELECT * FROM phieumuasanpham WHERE MaPMSP = ?";
    private final String UPDATE_QUERY = "UPDATE phieumuasanpham SET NgayLapPhieu = ?, MaKH = ?, GhiChu = ? WHERE MaPMSP = ?";
    private final String DELETE_QUERY = "DELETE FROM phieumuasanpham WHERE MaPMSP = ?";
    private final String SELECT_ALL_QUERY = "SELECT * FROM phieumuasanpham";

    public boolean themPhieuMuaSanPham(phieumuasanpham phieuMuaSanPham) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY)) {
            preparedStatement.setString(1, phieuMuaSanPham.getMaPMSP());
            preparedStatement.setDate(2, new java.sql.Date(phieuMuaSanPham.getNgayLapPhieu().getTime()));
            preparedStatement.setString(3, phieuMuaSanPham.getMaKH());
            preparedStatement.setString(4, phieuMuaSanPham.getGhiChu());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public boolean xoaPhieuMuaSanPham(String maPMSP) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_QUERY)) {
            preparedStatement.setString(1, maPMSP);

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public boolean capNhatPhieuMuaSanPham(phieumuasanpham phieuMuaSanPham) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_QUERY)) {
            preparedStatement.setDate(1, new java.sql.Date(phieuMuaSanPham.getNgayLapPhieu().getTime()));
            preparedStatement.setString(2, phieuMuaSanPham.getMaKH());
            preparedStatement.setString(3, phieuMuaSanPham.getGhiChu());
            preparedStatement.setString(4, phieuMuaSanPham.getMaPMSP());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }
    public phieumuasanpham layPhieuMuaSanPhamTheoID(String maPMSP) {
        phieumuasanpham phieuMuaSanPham = null;
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID_QUERY)) {
            preparedStatement.setString(1, maPMSP);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                phieuMuaSanPham = new phieumuasanpham();
                phieuMuaSanPham.setMaPMSP(resultSet.getString("MaPMSP"));
                phieuMuaSanPham.setNgayLapPhieu(resultSet.getDate("NgayLapPhieu"));
                phieuMuaSanPham.setMaKH(resultSet.getString("MaKH"));
                phieuMuaSanPham.setGhiChu(resultSet.getString("GhiChu"));
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return phieuMuaSanPham;
    }

    public List<phieumuasanpham> layTatCaPhieuMuaSanPham() {
        List<phieumuasanpham> danhSachPhieuMuaSanPham = new ArrayList<>();
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_QUERY)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                phieumuasanpham phieuMuaSanPham = new phieumuasanpham();
                phieuMuaSanPham.setMaPMSP(resultSet.getString("MaPMSP"));
                phieuMuaSanPham.setNgayLapPhieu(resultSet.getDate("NgayLapPhieu"));
                phieuMuaSanPham.setMaKH(resultSet.getString("MaKH"));
                phieuMuaSanPham.setGhiChu(resultSet.getString("GhiChu"));

                danhSachPhieuMuaSanPham.add(phieuMuaSanPham);
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return danhSachPhieuMuaSanPham;
    }
    
}
