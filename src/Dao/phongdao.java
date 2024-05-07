package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.phong;
import Util.JDBCUtils;

public class phongdao {
	 	private final String INSERT_QUERY = "INSERT INTO phong (MaPhong, MaLoaiPhong, MaTang, TrangThai) VALUES (?, ?, ?, ?)";
	    private final String SELECT_BY_ID_QUERY = "SELECT * FROM phong WHERE MaPhong = ?";
	    private final String UPDATE_QUERY = "UPDATE phong SET MaLoaiPhong = ?, MaTang = ?, TrangThai = ? WHERE MaPhong = ?";
	    private final String DELETE_QUERY = "DELETE FROM phong WHERE MaPhong = ?";
	    private final String SELECT_ALL_QUERY = "SELECT * FROM phong";

	    public boolean themPhong(phong phong) {
	        try (Connection connection = JDBCUtils.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY)) {
	            preparedStatement.setString(1, phong.getMaPhong());
	            preparedStatement.setString(2, phong.getMaLoaiPhong());
	            preparedStatement.setString(3, phong.getMaTang());
	            preparedStatement.setString(4, phong.getTrangThai());

	            int rowsAffected = preparedStatement.executeUpdate();

	            return rowsAffected > 0;
	        } catch (SQLException e) {
	            JDBCUtils.printSQLException(e);
	            return false;
	        }
	    }

	    public boolean xoaPhong(String maPhong) {
	        try (Connection connection = JDBCUtils.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_QUERY)) {
	            preparedStatement.setString(1, maPhong);

	            int rowsAffected = preparedStatement.executeUpdate();

	            return rowsAffected > 0;
	        } catch (SQLException e) {
	            JDBCUtils.printSQLException(e);
	            return false;
	        }
	    }

	    public boolean capNhatPhong(phong phong) {
	        try (Connection connection = JDBCUtils.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_QUERY)) {
	            preparedStatement.setString(1, phong.getMaLoaiPhong());
	            preparedStatement.setString(2, phong.getMaTang());
	            preparedStatement.setString(3, phong.getTrangThai());
	            preparedStatement.setString(4, phong.getMaPhong());

	            int rowsAffected = preparedStatement.executeUpdate();

	            return rowsAffected > 0;
	        } catch (SQLException e) {
	            JDBCUtils.printSQLException(e);
	            return false;
	        }
	    }

	    public phong layPhongTheoID(String maPhong) {
	        phong phong = null;
	        try (Connection connection = JDBCUtils.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID_QUERY)) {
	            preparedStatement.setString(1, maPhong);
	            ResultSet resultSet = preparedStatement.executeQuery();

	            if (resultSet.next()) {
	                phong = new phong();
	                phong.setMaPhong(resultSet.getString("MaPhong"));
	                phong.setMaLoaiPhong(resultSet.getString("MaLoaiPhong"));
	                phong.setMaTang(resultSet.getString("MaTang"));
	                phong.setTrangThai(resultSet.getString("TrangThai"));
	            }
	        } catch (SQLException e) {
	            JDBCUtils.printSQLException(e);
	        }
	        return phong;
	    }

	    public List<phong> layTatCaPhong() {
	        List<phong> danhSachPhong = new ArrayList<>();
	        try (Connection connection = JDBCUtils.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_QUERY)) {
	            ResultSet resultSet = preparedStatement.executeQuery();

	            while (resultSet.next()) {
	                phong phong = new phong();
	                phong.setMaPhong(resultSet.getString("MaPhong"));
	                phong.setMaLoaiPhong(resultSet.getString("MaLoaiPhong"));
	                phong.setMaTang(resultSet.getString("MaTang"));
	                phong.setTrangThai(resultSet.getString("TrangThai"));
	                danhSachPhong.add(phong);
	            }
	        } catch (SQLException e) {
	            JDBCUtils.printSQLException(e);
	        }
	        return danhSachPhong;
	    }
}
