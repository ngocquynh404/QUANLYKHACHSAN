package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.phieudichvu;
import Util.JDBCUtils;

public class phieudichvudao {
	private final String INSERT_QUERY = "INSERT INTO phieudichvu (MaPDV, NgayLapPhieu, MaKH, GhiChu) VALUES (?, ?, ?, ?)";
    private final String SELECT_BY_ID_QUERY = "SELECT * FROM phieudichvu WHERE MaPDV = ?";
    private final String UPDATE_QUERY = "UPDATE phieudichvu SET NgayLapPhieu = ?, MaKH = ?, GhiChu = ? WHERE MaPDV = ?";
    private final String DELETE_QUERY = "DELETE FROM phieudichvu WHERE MaPDV = ?";
    private final String SELECT_ALL_QUERY = "SELECT * FROM phieudichvu";

    public boolean themPhieuDichVu(phieudichvu phieuDichVu) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY)) {
            preparedStatement.setString(1, phieuDichVu.getMaPDV());
            preparedStatement.setDate(2, new java.sql.Date(phieuDichVu.getNgayLapPhieu().getTime()));
            preparedStatement.setString(3, phieuDichVu.getMaKH());
            preparedStatement.setString(4, phieuDichVu.getGhiChu());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public boolean xoaPhieuDichVu(String maPDV) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_QUERY)) {
            preparedStatement.setString(1, maPDV);

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public boolean capNhatPhieuDichVu(phieudichvu phieuDichVu) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_QUERY)) {
            preparedStatement.setDate(1, new java.sql.Date(phieuDichVu.getNgayLapPhieu().getTime()));
            preparedStatement.setString(2, phieuDichVu.getMaKH());
            preparedStatement.setString(3, phieuDichVu.getGhiChu());
            preparedStatement.setString(4, phieuDichVu.getMaPDV());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public phieudichvu layPhieuDichVuTheoID(String maPDV) {
        phieudichvu phieuDichVu = null;
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID_QUERY)) {
            preparedStatement.setString(1, maPDV);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                phieuDichVu = new phieudichvu();
                phieuDichVu.setMaPDV(resultSet.getString("MaPDV"));
                phieuDichVu.setNgayLapPhieu(resultSet.getDate("NgayLapPhieu"));
                phieuDichVu.setMaKH(resultSet.getString("MaKH"));
                phieuDichVu.setGhiChu(resultSet.getString("GhiChu"));
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return phieuDichVu;
    }

    public List<phieudichvu> layTatCaPhieuDichVu() {
        List<phieudichvu> danhSachPhieuDichVu = new ArrayList<>();
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_QUERY)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                phieudichvu phieuDichVu = new phieudichvu();
                phieuDichVu.setMaPDV(resultSet.getString("MaPDV"));
                phieuDichVu.setNgayLapPhieu(resultSet.getDate("NgayLapPhieu"));
                phieuDichVu.setMaKH(resultSet.getString("MaKH"));
                phieuDichVu.setGhiChu(resultSet.getString("GhiChu"));
                danhSachPhieuDichVu.add(phieuDichVu);
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return danhSachPhieuDichVu;
    }
}
