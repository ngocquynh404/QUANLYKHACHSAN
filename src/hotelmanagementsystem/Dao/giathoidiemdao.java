package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.giathoidiem;
import Util.JDBCUtils;

public class giathoidiemdao {
	 private final String INSERT_QUERY = "INSERT INTO giathoidiem (MaGiaThoiDiem, NgayApDung, NgayKetThuc, MoTa) VALUES (?, ?, ?, ?)";
	    private final String SELECT_BY_ID_QUERY = "SELECT * FROM giathoidiem WHERE MaGiaThoiDiem = ?";
	    private final String UPDATE_QUERY = "UPDATE giathoidiem SET NgayApDung = ?, NgayKetThuc = ?, MoTa = ? WHERE MaGiaThoiDiem = ?";
	    private final String DELETE_QUERY = "DELETE FROM giathoidiem WHERE MaGiaThoiDiem = ?";
	    private final String SELECT_ALL_QUERY = "SELECT * FROM giathoidiem";

	    public boolean themGiaThoiDiem(giathoidiem giaThoiDiem) {
	        try (Connection connection = JDBCUtils.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY)) {
	            preparedStatement.setString(1, giaThoiDiem.getMaGiaThoiDiem());
	            preparedStatement.setDate(2, new java.sql.Date(giaThoiDiem.getNgayApDung().getTime()));
	            preparedStatement.setDate(3, new java.sql.Date(giaThoiDiem.getNgayKetThuc().getTime()));
	            preparedStatement.setString(4, giaThoiDiem.getMoTa());

	            int rowsAffected = preparedStatement.executeUpdate();

	            return rowsAffected > 0;
	        } catch (SQLException e) {
	            JDBCUtils.printSQLException(e);
	            return false;
	        }
	    }

	    public boolean xoaGiaThoiDiem(String maGiaThoiDiem) {
	        try (Connection connection = JDBCUtils.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_QUERY)) {
	            preparedStatement.setString(1, maGiaThoiDiem);

	            int rowsAffected = preparedStatement.executeUpdate();

	            return rowsAffected > 0;
	        } catch (SQLException e) {
	            JDBCUtils.printSQLException(e);
	            return false;
	        }
	    }

	    public boolean capNhatGiaThoiDiem(giathoidiem giaThoiDiem) {
	        try (Connection connection = JDBCUtils.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_QUERY)) {
	            preparedStatement.setDate(1, new java.sql.Date(giaThoiDiem.getNgayApDung().getTime()));
	            preparedStatement.setDate(2, new java.sql.Date(giaThoiDiem.getNgayKetThuc().getTime()));
	            preparedStatement.setString(3, giaThoiDiem.getMoTa());
	            preparedStatement.setString(4, giaThoiDiem.getMaGiaThoiDiem());

	            int rowsAffected = preparedStatement.executeUpdate();

	            return rowsAffected > 0;
	        } catch (SQLException e) {
	            JDBCUtils.printSQLException(e);
	            return false;
	        }
	    }

	    public giathoidiem layGiaThoiDiemTheoID(String maGiaThoiDiem) {
	        giathoidiem giaThoiDiem = null;
	        try (Connection connection = JDBCUtils.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID_QUERY)) {
	            preparedStatement.setString(1, maGiaThoiDiem);
	            ResultSet resultSet = preparedStatement.executeQuery();

	            if (resultSet.next()) {
	                giaThoiDiem = new giathoidiem();
	                giaThoiDiem.setMaGiaThoiDiem(resultSet.getString("MaGiaThoiDiem"));
	                giaThoiDiem.setNgayApDung(resultSet.getDate("NgayApDung"));
	                giaThoiDiem.setNgayKetThuc(resultSet.getDate("NgayKetThuc"));
	                giaThoiDiem.setMoTa(resultSet.getString("MoTa"));
	            }
	        } catch (SQLException e) {
	            JDBCUtils.printSQLException(e);
	        }
	        return giaThoiDiem;
	    }

	    public List<giathoidiem> layTatCaGiaThoiDiem() {
	        List<giathoidiem> danhSachGiaThoiDiem = new ArrayList<>();
	        try (Connection connection = JDBCUtils.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_QUERY)) {
	            ResultSet resultSet = preparedStatement.executeQuery();

	            while (resultSet.next()) {
	                giathoidiem giaThoiDiem = new giathoidiem();
	                giaThoiDiem.setMaGiaThoiDiem(resultSet.getString("MaGiaThoiDiem"));
	                giaThoiDiem.setNgayApDung(resultSet.getDate("NgayApDung"));
	                giaThoiDiem.setNgayKetThuc(resultSet.getDate("NgayKetThuc"));
	                giaThoiDiem.setMoTa(resultSet.getString("MoTa"));
	                danhSachGiaThoiDiem.add(giaThoiDiem);
	            }
	        } catch (SQLException e) {
	            JDBCUtils.printSQLException(e);
	        }
	        return danhSachGiaThoiDiem;
	    }
}
