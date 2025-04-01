package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.sanpham;
import Util.JDBCUtils;

public class sanphamdao {
	private final String INSERT_QUERY = "INSERT INTO sanpham (MaSP, TenSP, MaLoaiSP, DonViTinh, GiaNhap, GiaBan, TrangThai) VALUES (?, ?, ?, ?, ?, ?, ?)";
    private final String SELECT_BY_ID_QUERY = "SELECT * FROM sanpham WHERE MaSP = ?";
    private final String UPDATE_QUERY = "UPDATE sanpham SET TenSP = ?, MaLoaiSP = ?, DonViTinh = ?, GiaNhap = ?, GiaBan = ?, TrangThai = ? WHERE MaSP = ?";
    private final String DELETE_QUERY = "DELETE FROM sanpham WHERE MaSP = ?";
    private final String SELECT_ALL_QUERY = "SELECT * FROM sanpham";

    public boolean themSanPham(sanpham sp) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY)) {
            preparedStatement.setString(1, sp.getMaSP());
            preparedStatement.setString(2, sp.getTenSP());
            preparedStatement.setString(3, sp.getMaLoaiSP());
            preparedStatement.setString(4, sp.getDonViTinh());
            preparedStatement.setInt(5, sp.getGiaNhap());
            preparedStatement.setInt(6, sp.getGiaBan());
            preparedStatement.setString(7, sp.getTrangThai());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public boolean xoaSanPham(String maSP) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_QUERY)) {
            preparedStatement.setString(1, maSP);

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public boolean capNhatSanPham(sanpham sp) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_QUERY)) {
            preparedStatement.setString(1, sp.getTenSP());
            preparedStatement.setString(2, sp.getMaLoaiSP());
            preparedStatement.setString(3, sp.getDonViTinh());
            preparedStatement.setInt(4, sp.getGiaNhap());
            preparedStatement.setInt(5, sp.getGiaBan());
            preparedStatement.setString(6, sp.getTrangThai());
            preparedStatement.setString(7, sp.getMaSP());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public sanpham laySanPhamTheoID(String maSP) {
        sanpham sp = null;
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID_QUERY)) {
            preparedStatement.setString(1, maSP);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                sp = new sanpham();
                sp.setMaSP(resultSet.getString("MaSP"));
                sp.setTenSP(resultSet.getString("TenSP"));
                sp.setMaLoaiSP(resultSet.getString("MaLoaiSP"));
                sp.setDonViTinh(resultSet.getString("DonViTinh"));
                sp.setGiaNhap(resultSet.getInt("GiaNhap"));
                sp.setGiaBan(resultSet.getInt("GiaBan"));
                sp.setTrangThai(resultSet.getString("TrangThai"));
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return sp;
    }

    public List<sanpham> layTatCaSanPham() {
        List<sanpham> danhSachSP = new ArrayList<>();
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_QUERY)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                sanpham sp = new sanpham();
                sp.setMaSP(resultSet.getString("MaSP"));
                sp.setTenSP(resultSet.getString("TenSP"));
                sp.setMaLoaiSP(resultSet.getString("MaLoaiSP"));
                sp.setDonViTinh(resultSet.getString("DonViTinh"));
                sp.setGiaNhap(resultSet.getInt("GiaNhap"));
                sp.setGiaBan(resultSet.getInt("GiaBan"));
                sp.setTrangThai(resultSet.getString("TrangThai"));

                danhSachSP.add(sp);
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return danhSachSP;
    }
}
