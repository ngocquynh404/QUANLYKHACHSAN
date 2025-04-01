package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.hoadon;
import Util.JDBCUtils;

public class hoadondao {
	private final String INSERT_QUERY = "INSERT INTO hoadon (MaHD, NgayLap, MaPDK, TongTien, TrangThai, GhiChu) VALUES (?, ?, ?, ?, ?, ?)";
    private final String SELECT_BY_ID_QUERY = "SELECT * FROM hoadon WHERE MaHD = ?";
    private final String UPDATE_QUERY = "UPDATE hoadon SET NgayLap = ?, MaPDK = ?, TongTien = ?, TrangThai = ?, GhiChu = ? WHERE MaHD = ?";
    private final String DELETE_QUERY = "DELETE FROM hoadon WHERE MaHD = ?";
    private final String SELECT_ALL_QUERY = "SELECT * FROM hoadon";

    public boolean themHoaDon(hoadon hoaDon) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY)) {
            preparedStatement.setString(1, hoaDon.getMaHD());
            preparedStatement.setDate(2, new java.sql.Date(hoaDon.getNgayLap().getTime()));
            preparedStatement.setString(3, hoaDon.getMaPDK());
            preparedStatement.setInt(4, hoaDon.getTongTien());
            preparedStatement.setString(5, hoaDon.getTrangThai());
            preparedStatement.setString(6, hoaDon.getGhiChu());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public boolean xoaHoaDon(String maHD) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_QUERY)) {
            preparedStatement.setString(1, maHD);

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public boolean capNhatHoaDon(hoadon hoaDon) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_QUERY)) {
            preparedStatement.setDate(1, new java.sql.Date(hoaDon.getNgayLap().getTime()));
            preparedStatement.setString(2, hoaDon.getMaPDK());
            preparedStatement.setInt(3, hoaDon.getTongTien());
            preparedStatement.setString(4, hoaDon.getTrangThai());
            preparedStatement.setString(5, hoaDon.getGhiChu());
            preparedStatement.setString(6, hoaDon.getMaHD());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public hoadon layHoaDonTheoID(String maHD) {
        hoadon hoaDon = null;
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID_QUERY)) {
            preparedStatement.setString(1, maHD);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                hoaDon = new hoadon();
                hoaDon.setMaHD(resultSet.getString("MaHD"));
                hoaDon.setNgayLap(resultSet.getDate("NgayLap"));
                hoaDon.setMaPDK(resultSet.getString("MaPDK"));
                hoaDon.setTongTien(resultSet.getInt("TongTien"));
                hoaDon.setTrangThai(resultSet.getString("TrangThai"));
                hoaDon.setGhiChu(resultSet.getString("GhiChu"));
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return hoaDon;
    }

    public List<hoadon> layTatCaHoaDon() {
        List<hoadon> danhSachHoaDon = new ArrayList<>();
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_QUERY)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                hoadon hoaDon = new hoadon();
                hoaDon.setMaHD(resultSet.getString("MaHD"));
                hoaDon.setNgayLap(resultSet.getDate("NgayLap"));
                hoaDon.setMaPDK(resultSet.getString("MaPDK"));
                hoaDon.setTongTien(resultSet.getInt("TongTien"));
                hoaDon.setTrangThai(resultSet.getString("TrangThai"));
                hoaDon.setGhiChu(resultSet.getString("GhiChu"));

                danhSachHoaDon.add(hoaDon);
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return danhSachHoaDon;
    }
}
