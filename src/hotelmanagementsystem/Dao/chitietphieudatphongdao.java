package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.chitietphieudatphong;
import Util.JDBCUtils;

public class chitietphieudatphongdao {
		private final String INSERT_QUERY = "INSERT INTO chitietphieudatphong (MaCTPDP, MaPDP, MaPhong, NguoiLon, TreEm, GhiChu) VALUES (?, ?, ?, ?, ?, ?)";
	    private final String SELECT_BY_ID_QUERY = "SELECT * FROM chitietphieudatphong WHERE MaCTPDP = ?";
	    private final String UPDATE_QUERY = "UPDATE chitietphieudatphong SET MaPDP = ?, MaPhong = ?, NguoiLon = ?, TreEm = ?, GhiChu = ? WHERE MaCTPDP = ?";
	    private final String DELETE_QUERY = "DELETE FROM chitietphieudatphong WHERE MaCTPDP = ?";
	    private final String SELECT_ALL_QUERY = "SELECT * FROM chitietphieudatphong";

	    public boolean themChiTietPhieuDatPhong(chitietphieudatphong chiTietPhieuDatPhong) {
	        try (Connection connection = JDBCUtils.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY)) {
	            preparedStatement.setString(1, chiTietPhieuDatPhong.getMaCTPDP());
	            preparedStatement.setString(2, chiTietPhieuDatPhong.getMaPDP());
	            preparedStatement.setString(3, chiTietPhieuDatPhong.getMaPhong());
	            preparedStatement.setInt(4, chiTietPhieuDatPhong.getNguoiLon());
	            preparedStatement.setInt(5, chiTietPhieuDatPhong.getTreEm());
	            preparedStatement.setString(6, chiTietPhieuDatPhong.getGhiChu());

	            int rowsAffected = preparedStatement.executeUpdate();

	            return rowsAffected > 0;
	        } catch (SQLException e) {
	            JDBCUtils.printSQLException(e);
	            return false;
	        }
	    }

	    public boolean xoaChiTietPhieuDatPhong(String maCTPDP) {
	        try (Connection connection = JDBCUtils.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_QUERY)) {
	            preparedStatement.setString(1, maCTPDP);

	            int rowsAffected = preparedStatement.executeUpdate();

	            return rowsAffected > 0;
	        } catch (SQLException e) {
	            JDBCUtils.printSQLException(e);
	            return false;
	        }
	    }

	    public boolean capNhatChiTietPhieuDatPhong(chitietphieudatphong chiTietPhieuDatPhong) {
	        try (Connection connection = JDBCUtils.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_QUERY)) {
	            preparedStatement.setString(1, chiTietPhieuDatPhong.getMaPDP());
	            preparedStatement.setString(2, chiTietPhieuDatPhong.getMaPhong());
	            preparedStatement.setInt(3, chiTietPhieuDatPhong.getNguoiLon());
	            preparedStatement.setInt(4, chiTietPhieuDatPhong.getTreEm());
	            preparedStatement.setString(5, chiTietPhieuDatPhong.getGhiChu());
	            preparedStatement.setString(6, chiTietPhieuDatPhong.getMaCTPDP());

	            int rowsAffected = preparedStatement.executeUpdate();

	            return rowsAffected > 0;
	        } catch (SQLException e) {
	            JDBCUtils.printSQLException(e);
	            return false;
	        }
	    }

	    public chitietphieudatphong layChiTietPhieuDatPhongTheoID(String maCTPDP) {
	        chitietphieudatphong chiTietPhieuDatPhong = null;
	        try (Connection connection = JDBCUtils.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID_QUERY)) {
	            preparedStatement.setString(1, maCTPDP);
	            ResultSet resultSet = preparedStatement.executeQuery();

	            if (resultSet.next()) {
	                chiTietPhieuDatPhong = new chitietphieudatphong();
	                chiTietPhieuDatPhong.setMaCTPDP(resultSet.getString("MaCTPDP"));
	                chiTietPhieuDatPhong.setMaPDP(resultSet.getString("MaPDP"));
	                chiTietPhieuDatPhong.setMaPhong(resultSet.getString("MaPhong"));
	                chiTietPhieuDatPhong.setNguoiLon(resultSet.getInt("NguoiLon"));
	                chiTietPhieuDatPhong.setTreEm(resultSet.getInt("TreEm"));
	                chiTietPhieuDatPhong.setGhiChu(resultSet.getString("GhiChu"));
	            }
	        } catch (SQLException e) {
	            JDBCUtils.printSQLException(e);
	        }
	        return chiTietPhieuDatPhong;
	    }

	    public List<chitietphieudatphong> layTatCaChiTietPhieuDatPhong() {
	        List<chitietphieudatphong> danhSachChiTietPhieuDatPhong = new ArrayList<>();
	        try (Connection connection = JDBCUtils.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_QUERY)) {
	            ResultSet resultSet = preparedStatement.executeQuery();

	            while (resultSet.next()) {
	                chitietphieudatphong chiTietPhieuDatPhong = new chitietphieudatphong();
	                chiTietPhieuDatPhong.setMaCTPDP(resultSet.getString("MaCTPDP"));
	                chiTietPhieuDatPhong.setMaPDP(resultSet.getString("MaPDP"));
	                chiTietPhieuDatPhong.setMaPhong(resultSet.getString("MaPhong"));
	                chiTietPhieuDatPhong.setNguoiLon(resultSet.getInt("NguoiLon"));
	                chiTietPhieuDatPhong.setTreEm(resultSet.getInt("TreEm"));
	                chiTietPhieuDatPhong.setGhiChu(resultSet.getString("GhiChu"));
	                danhSachChiTietPhieuDatPhong.add(chiTietPhieuDatPhong);
	            }
	        } catch (SQLException e) {
	            JDBCUtils.printSQLException(e);
	        }
	        return danhSachChiTietPhieuDatPhong;
	    }
}
