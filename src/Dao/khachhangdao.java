package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.khachhang;
import Util.JDBCUtils;

public class khachhangdao {

	private final String INSERT_QUERY = "INSERT INTO khachhang (MaKH, HovaTen, GioiTinh, SDT, CCCD, QuocTich, NgaySinh, isXoa) VALUES (?, ?, ?, ?, ?, ?, ?, 0)";
    private final String SELECT_BY_ID_QUERY = "SELECT * FROM khachhang WHERE MaKH = ? AND isXoa = 0";
    private final String UPDATE_QUERY = "UPDATE khachhang SET HovaTen = ?, GioiTinh = ?, SDT = ?, CCCD = ?, QuocTich = ?, NgaySinh = ? WHERE MaKH = ?";
    private final String DELETE_QUERY = "UPDATE khachhang SET isXoa = 1 WHERE MaKH = ?";
    private final String SELECT_ALL_QUERY = "SELECT * FROM khachhang WHERE isXoa = 0";
    
    public boolean themKhachHang(khachhang khachHang) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY)) {
            preparedStatement.setString(1, khachHang.getMaKH());
            preparedStatement.setString(2, khachHang.getHoVaTen());
            preparedStatement.setString(3, khachHang.getGioiTinh());
            preparedStatement.setString(4, khachHang.getSdt());
            preparedStatement.setBytes(5, khachHang.getCccd());
            preparedStatement.setString(6, khachHang.getQuocTich());
            preparedStatement.setDate(7,  new java.sql.Date(khachHang.getNgaySinh().getTime()));

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }
    
    public boolean xoaKhachHang(String maKH) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_QUERY)) {
            // Thiết lập tham số cho câu lệnh DELETE
            preparedStatement.setString(1, maKH);

            // Thực thi câu lệnh DELETE và kiểm tra số dòng bị ảnh hưởng
            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }
    public boolean capNhatKhachHang(khachhang khachHang) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_QUERY)) {
            // Thiết lập các tham số cho câu lệnh UPDATE
            preparedStatement.setString(1, khachHang.getHoVaTen());
            preparedStatement.setString(2, khachHang.getGioiTinh());
            preparedStatement.setString(3, khachHang.getSdt());
            preparedStatement.setBytes(4, khachHang.getCccd());
            preparedStatement.setString(5, khachHang.getQuocTich());
            preparedStatement.setDate(6, new java.sql.Date(khachHang.getNgaySinh().getTime()));
            preparedStatement.setString(7, khachHang.getMaKH());

            // Thực thi câu lệnh UPDATE và kiểm tra số dòng bị ảnh hưởng
            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }
    
    public khachhang layKhachHangTheoID(String maKH) {
    	khachhang khachHang = null;
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID_QUERY)) {
            // Thiết lập tham số cho câu lệnh SELECT
            preparedStatement.setString(1, maKH);

            // Thực thi câu lệnh SELECT
            ResultSet resultSet = preparedStatement.executeQuery();

            // Nếu có kết quả, tạo đối tượng KhachHang từ các giá trị của hàng kết quả
            if (resultSet.next()) {
                khachHang = new khachhang();
                khachHang.setMaKH(resultSet.getString("MaKH"));
                khachHang.setHoVaTen(resultSet.getString("HoVaTen"));
                khachHang.setGioiTinh(resultSet.getString("GioiTinh"));
                khachHang.setSdt(resultSet.getString("SDT"));
                khachHang.setCccd(resultSet.getBytes("CCCD"));
                khachHang.setQuocTich(resultSet.getString("QuocTich"));
                khachHang.setNgaySinh(resultSet.getDate("NgaySinh"));
                khachHang.setXoa(resultSet.getBoolean("isXoa"));
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return khachHang;
    }
    public List<khachhang> layDanhSachKhachHang() {
        List<khachhang> danhSachKhachHang = new ArrayList<>();
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_QUERY)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                khachhang khachHang = new khachhang();
                khachHang.setMaKH(resultSet.getString("MaKH"));
                khachHang.setHoVaTen(resultSet.getString("HoVaTen"));
                khachHang.setGioiTinh(resultSet.getString("GioiTinh"));
                khachHang.setSdt(resultSet.getString("SDT"));
                khachHang.setCccd(resultSet.getBytes("CCCD"));
                khachHang.setQuocTich(resultSet.getString("QuocTich"));
                khachHang.setNgaySinh(resultSet.getDate("NgaySinh"));
                khachHang.setXoa(resultSet.getBoolean("isXoa"));
                danhSachKhachHang.add(khachHang);
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return danhSachKhachHang;
    }

}
