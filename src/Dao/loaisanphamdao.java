package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.loaisanpham;
import Util.JDBCUtils;

public class loaisanphamdao {
	private final String INSERT_QUERY = "INSERT INTO loaisanpham (MaLoaiSP, TenLoaiSanPham) VALUES (?, ?)";
    private final String SELECT_BY_ID_QUERY = "SELECT * FROM loaisanpham WHERE MaLoaiSP = ?";
    private final String UPDATE_QUERY = "UPDATE loaisanpham SET TenLoaiSanPham = ? WHERE MaLoaiSP = ?";
    private final String DELETE_QUERY = "DELETE FROM loaisanpham WHERE MaLoaiSP = ?";
    private final String SELECT_ALL_QUERY = "SELECT * FROM loaisanpham";

    public boolean themLoaiSanPham(loaisanpham loaiSP) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY)) {
            preparedStatement.setString(1, loaiSP.getMaLoaiSP());
            preparedStatement.setString(2, loaiSP.getTenLoaiSanPham());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public boolean xoaLoaiSanPham(String maLoaiSP) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_QUERY)) {
            preparedStatement.setString(1, maLoaiSP);

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public boolean capNhatLoaiSanPham(loaisanpham loaiSP) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_QUERY)) {
            preparedStatement.setString(1, loaiSP.getTenLoaiSanPham());
            preparedStatement.setString(2, loaiSP.getMaLoaiSP());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public loaisanpham layLoaiSanPhamTheoID(String maLoaiSP) {
        loaisanpham loaiSP = null;
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID_QUERY)) {
            preparedStatement.setString(1, maLoaiSP);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                loaiSP = new loaisanpham();
                loaiSP.setMaLoaiSP(resultSet.getString("MaLoaiSP"));
                loaiSP.setTenLoaiSanPham(resultSet.getString("TenLoaiSanPham"));
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return loaiSP;
    }

    public List<loaisanpham> layTatCaLoaiSanPham() {
        List<loaisanpham> danhSachLoaiSP = new ArrayList<>();
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_QUERY)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                loaisanpham loaiSP = new loaisanpham();
                loaiSP.setMaLoaiSP(resultSet.getString("MaLoaiSP"));
                loaiSP.setTenLoaiSanPham(resultSet.getString("TenLoaiSanPham"));

                danhSachLoaiSP.add(loaiSP);
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return danhSachLoaiSP;
    }
}
