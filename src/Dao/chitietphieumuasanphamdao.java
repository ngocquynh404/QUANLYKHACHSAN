package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.chitietphieumuasanpham;
import Util.JDBCUtils;

public class chitietphieumuasanphamdao {
	private final String INSERT_QUERY = "INSERT INTO chitietphieumuasanpham (MaCTPMSP, MaPMSP, MaPhong, MaSanPham, SoLuong) VALUES (?, ?, ?, ?, ?)";
    private final String SELECT_BY_ID_QUERY = "SELECT * FROM chitietphieumuasanpham WHERE MaCTPMSP = ?";
    private final String UPDATE_QUERY = "UPDATE chitietphieumuasanpham SET MaPMSP = ?, MaPhong = ?, MaSanPham = ?, SoLuong = ? WHERE MaCTPMSP = ?";
    private final String DELETE_QUERY = "DELETE FROM chitietphieumuasanpham WHERE MaCTPMSP = ?";
    private final String SELECT_ALL_QUERY = "SELECT * FROM chitietphieumuasanpham";

    public boolean themChiTietPhieuMuaSanPham(chitietphieumuasanpham chiTietPhieuMuaSanPham) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY)) {
            preparedStatement.setString(1, chiTietPhieuMuaSanPham.getMaCTPMSP());
            preparedStatement.setString(2, chiTietPhieuMuaSanPham.getMaPMSP());
            preparedStatement.setString(3, chiTietPhieuMuaSanPham.getMaPhong());
            preparedStatement.setString(4, chiTietPhieuMuaSanPham.getMaSanPham());
            preparedStatement.setInt(5, chiTietPhieuMuaSanPham.getSoLuong());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public boolean xoaChiTietPhieuMuaSanPham(String maCTPMSP) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_QUERY)) {
            preparedStatement.setString(1, maCTPMSP);

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public boolean capNhatChiTietPhieuMuaSanPham(chitietphieumuasanpham chiTietPhieuMuaSanPham) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_QUERY)) {
            preparedStatement.setString(1, chiTietPhieuMuaSanPham.getMaPMSP());
            preparedStatement.setString(2, chiTietPhieuMuaSanPham.getMaPhong());
            preparedStatement.setString(3, chiTietPhieuMuaSanPham.getMaSanPham());
            preparedStatement.setInt(4, chiTietPhieuMuaSanPham.getSoLuong());
            preparedStatement.setString(5, chiTietPhieuMuaSanPham.getMaCTPMSP());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public chitietphieumuasanpham layChiTietPhieuMuaSanPhamTheoID(String maCTPMSP) {
        chitietphieumuasanpham chiTietPhieuMuaSanPham = null;
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID_QUERY)) {
            preparedStatement.setString(1, maCTPMSP);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                chiTietPhieuMuaSanPham = new chitietphieumuasanpham();
                chiTietPhieuMuaSanPham.setMaCTPMSP(resultSet.getString("MaCTPMSP"));
                chiTietPhieuMuaSanPham.setMaPMSP(resultSet.getString("MaPMSP"));
                chiTietPhieuMuaSanPham.setMaPhong(resultSet.getString("MaPhong"));
                chiTietPhieuMuaSanPham.setMaSanPham(resultSet.getString("MaSanPham"));
                chiTietPhieuMuaSanPham.setSoLuong(resultSet.getInt("SoLuong"));
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return chiTietPhieuMuaSanPham;
    }

    public List<chitietphieumuasanpham> layTatCaChiTietPhieuMuaSanPham() {
        List<chitietphieumuasanpham> danhSachChiTietPhieuMuaSanPham = new ArrayList<>();
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_QUERY)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                chitietphieumuasanpham chiTietPhieuMuaSanPham = new chitietphieumuasanpham();
                chiTietPhieuMuaSanPham.setMaCTPMSP(resultSet.getString("MaCTPMSP"));
                chiTietPhieuMuaSanPham.setMaPMSP(resultSet.getString("MaPMSP"));
                chiTietPhieuMuaSanPham.setMaPhong(resultSet.getString("MaPhong"));
                chiTietPhieuMuaSanPham.setMaSanPham(resultSet.getString("MaSanPham"));
                chiTietPhieuMuaSanPham.setSoLuong(resultSet.getInt("SoLuong"));

                danhSachChiTietPhieuMuaSanPham.add(chiTietPhieuMuaSanPham);
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return danhSachChiTietPhieuMuaSanPham;
    }
}
