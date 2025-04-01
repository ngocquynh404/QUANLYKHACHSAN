package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.dichvu;
import Util.JDBCUtils;

public class dichvudao {
	private final String INSERT_QUERY = "INSERT INTO dichvu (MaDichVu, TenDichVu, MoTa, DonViTinh, TrangThai) VALUES (?, ?, ?, ?, ?)";
    private final String SELECT_BY_ID_QUERY = "SELECT * FROM dichvu WHERE MaDichVu = ?";
    private final String UPDATE_QUERY = "UPDATE dichvu SET TenDichVu = ?, MoTa = ?, DonViTinh = ?, TrangThai = ? WHERE MaDichVu = ?";
    private final String DELETE_QUERY = "DELETE FROM dichvu WHERE MaDichVu = ?";
    private final String SELECT_ALL_QUERY = "SELECT * FROM dichvu";

    public boolean themDichVu(dichvu dichVu) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY)) {
            preparedStatement.setString(1, dichVu.getMaDichVu());
            preparedStatement.setString(2, dichVu.getTenDichVu());
            preparedStatement.setString(3, dichVu.getMoTa());
            preparedStatement.setString(4, dichVu.getDonViTinh());
            preparedStatement.setString(5, dichVu.getTrangThai());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public boolean xoaDichVu(String maDichVu) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_QUERY)) {
            preparedStatement.setString(1, maDichVu);

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public boolean capNhatDichVu(dichvu dichVu) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_QUERY)) {
            preparedStatement.setString(1, dichVu.getTenDichVu());
            preparedStatement.setString(2, dichVu.getMoTa());
            preparedStatement.setString(3, dichVu.getDonViTinh());
            preparedStatement.setString(4, dichVu.getTrangThai());
            preparedStatement.setString(5, dichVu.getMaDichVu());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public dichvu layDichVuTheoID(String maDichVu) {
        dichvu dichVu = null;
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID_QUERY)) {
            preparedStatement.setString(1, maDichVu);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                dichVu = new dichvu();
                dichVu.setMaDichVu(resultSet.getString("MaDichVu"));
                dichVu.setTenDichVu(resultSet.getString("TenDichVu"));
                dichVu.setMoTa(resultSet.getString("MoTa"));
                dichVu.setDonViTinh(resultSet.getString("DonViTinh"));
                dichVu.setTrangThai(resultSet.getString("TrangThai"));
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return dichVu;
    }

    public List<dichvu> layTatCaDichVu() {
        List<dichvu> danhSachDichVu = new ArrayList<>();
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_QUERY)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                dichvu dichVu = new dichvu();
                dichVu.setMaDichVu(resultSet.getString("MaDichVu"));
                dichVu.setTenDichVu(resultSet.getString("TenDichVu"));
                dichVu.setMoTa(resultSet.getString("MoTa"));
                dichVu.setDonViTinh(resultSet.getString("DonViTinh"));
                dichVu.setTrangThai(resultSet.getString("TrangThai"));
                danhSachDichVu.add(dichVu);
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return danhSachDichVu;
    }
}
