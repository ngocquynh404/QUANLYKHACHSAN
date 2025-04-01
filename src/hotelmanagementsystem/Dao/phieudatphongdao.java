package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.phieudatphong;
import Util.JDBCUtils;

public class phieudatphongdao {
	private final String INSERT_QUERY = "INSERT INTO phieudatphong (MaPDP, NgayLapPhieu, MaKH, LoaiHinh, SoLuongNguoi, SoLuongPhong, TraTruoc, GhiChu, TrangThai) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private final String SELECT_BY_ID_QUERY = "SELECT * FROM phieudatphong WHERE MaPDP = ?";
    private final String UPDATE_QUERY = "UPDATE phieudatphong SET NgayLapPhieu = ?, MaKH = ?, LoaiHinh = ?, SoLuongNguoi = ?, SoLuongPhong = ?, TraTruoc = ?, GhiChu = ?, TrangThai = ? WHERE MaPDP = ?";
    private final String DELETE_QUERY = "DELETE FROM phieudatphong WHERE MaPDP = ?";
    private final String SELECT_ALL_QUERY = "SELECT * FROM phieudatphong";
    
    public boolean themPhieuDatPhong(phieudatphong phieuDatPhong) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY)) {
            preparedStatement.setString(1, phieuDatPhong.getMaPDP());
            preparedStatement.setDate(2, new java.sql.Date(phieuDatPhong.getNgayLapPhieu().getTime()));
            preparedStatement.setString(3, phieuDatPhong.getMaKH());
            preparedStatement.setString(4, phieuDatPhong.getLoaiHinh());
            preparedStatement.setInt(5, phieuDatPhong.getSoLuongNguoi());
            preparedStatement.setInt(6, phieuDatPhong.getSoLuongPhong());
            preparedStatement.setInt(7, phieuDatPhong.getTraTruoc());
            preparedStatement.setString(8, phieuDatPhong.getGhiChu());
            preparedStatement.setString(9, phieuDatPhong.getTrangThai());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public boolean xoaPhieuDatPhong(String maPDP) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_QUERY)) {
            preparedStatement.setString(1, maPDP);

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public boolean capNhatPhieuDatPhong(phieudatphong phieuDatPhong) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_QUERY)) {
            preparedStatement.setDate(1, new java.sql.Date(phieuDatPhong.getNgayLapPhieu().getTime()));
            preparedStatement.setString(2, phieuDatPhong.getMaKH());
            preparedStatement.setString(3, phieuDatPhong.getLoaiHinh());
            preparedStatement.setInt(4, phieuDatPhong.getSoLuongNguoi());
            preparedStatement.setInt(5, phieuDatPhong.getSoLuongPhong());
            preparedStatement.setInt(6, phieuDatPhong.getTraTruoc());
            preparedStatement.setString(7, phieuDatPhong.getGhiChu());
            preparedStatement.setString(8, phieuDatPhong.getTrangThai());
            preparedStatement.setString(9, phieuDatPhong.getMaPDP());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public phieudatphong layPhieuDatPhongTheoID(String maPDP) {
        phieudatphong phieuDatPhong = null;
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID_QUERY)) {
            preparedStatement.setString(1, maPDP);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                phieuDatPhong = new phieudatphong();
                phieuDatPhong.setMaPDP(resultSet.getString("MaPDP"));
                phieuDatPhong.setNgayLapPhieu(resultSet.getDate("NgayLapPhieu"));
                phieuDatPhong.setMaKH(resultSet.getString("MaKH"));
                phieuDatPhong.setLoaiHinh(resultSet.getString("LoaiHinh"));
                phieuDatPhong.setSoLuongNguoi(resultSet.getInt("SoLuongNguoi"));
                phieuDatPhong.setSoLuongPhong(resultSet.getInt("SoLuongPhong"));
                phieuDatPhong.setTraTruoc(resultSet.getInt("TraTruoc"));
                phieuDatPhong.setGhiChu(resultSet.getString("GhiChu"));
                phieuDatPhong.setTrangThai(resultSet.getString("TrangThai"));
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return phieuDatPhong;
    }

    public List<phieudatphong> layTatCaPhieuDatPhong() {
        List<phieudatphong> danhSachPhieuDatPhong = new ArrayList<>();
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_QUERY)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                phieudatphong phieuDatPhong = new phieudatphong();
                phieuDatPhong.setMaPDP(resultSet.getString("MaPDP"));
                phieuDatPhong.setNgayLapPhieu(resultSet.getDate("NgayLapPhieu"));
                phieuDatPhong.setMaKH(resultSet.getString("MaKH"));
                phieuDatPhong.setLoaiHinh(resultSet.getString("LoaiHinh"));
                phieuDatPhong.setSoLuongNguoi(resultSet.getInt("SoLuongNguoi"));
                phieuDatPhong.setSoLuongPhong(resultSet.getInt("SoLuongPhong"));
                phieuDatPhong.setTraTruoc(resultSet.getInt("TraTruoc"));
                phieuDatPhong.setGhiChu(resultSet.getString("GhiChu"));
                phieuDatPhong.setTrangThai(resultSet.getString("TrangThai"));
                danhSachPhieuDatPhong.add(phieuDatPhong);
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return danhSachPhieuDatPhong;
    }
    
}
