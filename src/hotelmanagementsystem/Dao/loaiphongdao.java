package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.loaiphong;
import Util.JDBCUtils;

public class loaiphongdao {
	private final String INSERT_QUERY = "INSERT INTO loaiphong (MaLoaiPhong, TenLoaiPhong, NguoiLon, TreEm, GhiChu) VALUES (?, ?, ?, ?, ?)";
    private final String SELECT_BY_ID_QUERY = "SELECT * FROM loaiphong WHERE MaLoaiPhong = ?";
    private final String UPDATE_QUERY = "UPDATE loaiphong SET TenLoaiPhong = ?, NguoiLon = ?, TreEm = ?, GhiChu = ? WHERE MaLoaiPhong = ?";
    private final String DELETE_QUERY = "DELETE FROM loaiphong WHERE MaLoaiPhong = ?";
    private final String SELECT_ALL_QUERY = "SELECT * FROM loaiphong";
    public boolean themLoaiPhong(loaiphong loaiPhong) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY)) {
            preparedStatement.setString(1, loaiPhong.getMaLoaiPhong());
            preparedStatement.setString(2, loaiPhong.getTenLoaiPhong());
            preparedStatement.setInt(3, loaiPhong.getNguoiLon());
            preparedStatement.setInt(4, loaiPhong.getTreEm());
            preparedStatement.setString(5, loaiPhong.getGhiChu());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public boolean xoaLoaiPhong(String maLoaiPhong) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_QUERY)) {
            preparedStatement.setString(1, maLoaiPhong);

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public boolean capNhatLoaiPhong(loaiphong loaiPhong) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_QUERY)) {
            preparedStatement.setString(1, loaiPhong.getTenLoaiPhong());
            preparedStatement.setInt(2, loaiPhong.getNguoiLon());
            preparedStatement.setInt(3, loaiPhong.getTreEm());
            preparedStatement.setString(4, loaiPhong.getGhiChu());
            preparedStatement.setString(5, loaiPhong.getMaLoaiPhong());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public loaiphong layLoaiPhongTheoID(String maLoaiPhong) {
        loaiphong loaiPhong = null;
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID_QUERY)) {
            preparedStatement.setString(1, maLoaiPhong);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                loaiPhong = new loaiphong();
                loaiPhong.setMaLoaiPhong(resultSet.getString("MaLoaiPhong"));
                loaiPhong.setTenLoaiPhong(resultSet.getString("TenLoaiPhong"));
                loaiPhong.setNguoiLon(resultSet.getInt("NguoiLon"));
                loaiPhong.setTreEm(resultSet.getInt("TreEm"));
                loaiPhong.setGhiChu(resultSet.getString("GhiChu"));
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return loaiPhong;
    }

    public List<loaiphong> layTatCaLoaiPhong() {
        List<loaiphong> danhSachLoaiPhong = new ArrayList<>();
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_QUERY)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                loaiphong loaiPhong = new loaiphong();
                loaiPhong.setMaLoaiPhong(resultSet.getString("MaLoaiPhong"));
                loaiPhong.setTenLoaiPhong(resultSet.getString("TenLoaiPhong"));
                loaiPhong.setNguoiLon(resultSet.getInt("NguoiLon"));
                loaiPhong.setTreEm(resultSet.getInt("TreEm"));
                loaiPhong.setGhiChu(resultSet.getString("GhiChu"));
                danhSachLoaiPhong.add(loaiPhong);
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return danhSachLoaiPhong;
    }

}
