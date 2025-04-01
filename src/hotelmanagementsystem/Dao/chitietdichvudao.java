package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.chitietdichvu;
import Util.JDBCUtils;

public class chitietdichvudao {
	private final String INSERT_QUERY = "INSERT INTO chitietdichvu (MaCTPDV, MaPDV, MaPhong, NgaySuDung, MaDichVu, SoLuong) VALUES (?, ?, ?, ?, ?, ?)";
    private final String SELECT_BY_ID_QUERY = "SELECT * FROM chitietdichvu WHERE MaCTPDV = ?";
    private final String UPDATE_QUERY = "UPDATE chitietdichvu SET MaPDV = ?, MaPhong = ?, NgaySuDung = ?, MaDichVu = ?, SoLuong = ? WHERE MaCTPDV = ?";
    private final String DELETE_QUERY = "DELETE FROM chitietdichvu WHERE MaCTPDV = ?";
    private final String SELECT_ALL_QUERY = "SELECT * FROM chitietdichvu";

    public boolean themChiTietDichVu(chitietdichvu chiTietDichVu) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY)) {
            preparedStatement.setString(1, chiTietDichVu.getMaCTPDV());
            preparedStatement.setString(2, chiTietDichVu.getMaPDV());
            preparedStatement.setString(3, chiTietDichVu.getMaPhong());
            preparedStatement.setDate(4, new java.sql.Date(chiTietDichVu.getNgaySuDung().getTime()));
            preparedStatement.setString(5, chiTietDichVu.getMaDichVu());
            preparedStatement.setInt(6, chiTietDichVu.getSoLuong());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public boolean xoaChiTietDichVu(String maCTPDV) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_QUERY)) {
            preparedStatement.setString(1, maCTPDV);

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public boolean capNhatChiTietDichVu(chitietdichvu chiTietDichVu) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_QUERY)) {
            preparedStatement.setString(1, chiTietDichVu.getMaPDV());
            preparedStatement.setString(2, chiTietDichVu.getMaPhong());
            preparedStatement.setDate(3, new java.sql.Date(chiTietDichVu.getNgaySuDung().getTime()));
            preparedStatement.setString(4, chiTietDichVu.getMaDichVu());
            preparedStatement.setInt(5, chiTietDichVu.getSoLuong());
            preparedStatement.setString(6, chiTietDichVu.getMaCTPDV());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public chitietdichvu layChiTietDichVuTheoID(String maCTPDV) {
        chitietdichvu chiTietDichVu = null;
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID_QUERY)) {
            preparedStatement.setString(1, maCTPDV);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                chiTietDichVu = new chitietdichvu();
                chiTietDichVu.setMaCTPDV(resultSet.getString("MaCTPDV"));
                chiTietDichVu.setMaPDV(resultSet.getString("MaPDV"));
                chiTietDichVu.setMaPhong(resultSet.getString("MaPhong"));
                chiTietDichVu.setNgaySuDung(resultSet.getDate("NgaySuDung"));
                chiTietDichVu.setMaDichVu(resultSet.getString("MaDichVu"));
                chiTietDichVu.setSoLuong(resultSet.getInt("SoLuong"));
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return chiTietDichVu;
    }

    public List<chitietdichvu> layTatCaChiTietDichVu() {
        List<chitietdichvu> danhSachChiTietDichVu = new ArrayList<>();
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_QUERY)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                chitietdichvu chiTietDichVu = new chitietdichvu();
                chiTietDichVu.setMaCTPDV(resultSet.getString("MaCTPDV"));
                chiTietDichVu.setMaPDV(resultSet.getString("MaPDV"));
                chiTietDichVu.setMaPhong(resultSet.getString("MaPhong"));
                chiTietDichVu.setNgaySuDung(resultSet.getDate("NgaySuDung"));
                chiTietDichVu.setMaDichVu(resultSet.getString("MaDichVu"));
                chiTietDichVu.setSoLuong(resultSet.getInt("SoLuong"));
                danhSachChiTietDichVu.add(chiTietDichVu);
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return danhSachChiTietDichVu;
    }
}
