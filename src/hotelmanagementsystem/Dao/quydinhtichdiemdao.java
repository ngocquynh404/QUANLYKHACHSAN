package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.quydinhtichdiem;
import Util.JDBCUtils;

public class quydinhtichdiemdao {
	private final String INSERT_QUERY = "INSERT INTO quydinhtichdiem (MaQD, KieuTichDiem, TyLeTichDiem, NguongTien, SoDiemTuongUng) VALUES (?, ?, ?, ?, ?)";
    private final String SELECT_BY_ID_QUERY = "SELECT * FROM quydinhtichdiem WHERE MaQD = ?";
    private final String UPDATE_QUERY = "UPDATE quydinhtichdiem SET KieuTichDiem = ?, TyLeTichDiem = ?, NguongTien = ?, SoDiemTuongUng = ? WHERE MaQD = ?";
    private final String DELETE_QUERY = "DELETE FROM quydinhtichdiem WHERE MaQD = ?";
    private final String SELECT_ALL_QUERY = "SELECT * FROM quydinhtichdiem";

    public boolean themQuydinhtichdiem(quydinhtichdiem quydinhtichdiem) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY)) {
            preparedStatement.setString(1, quydinhtichdiem.getMaQD());
            preparedStatement.setString(2, quydinhtichdiem.getKieuTichDiem());
            preparedStatement.setInt(3, quydinhtichdiem.getTyLeTichDiem());
            preparedStatement.setInt(4, quydinhtichdiem.getNguongTien());
            preparedStatement.setInt(5, quydinhtichdiem.getSoDiemTuongUng());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public boolean xoaQuydinhtichdiem(String maQD) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_QUERY)) {
            preparedStatement.setString(1, maQD);

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public boolean capNhatQuydinhtichdiem(quydinhtichdiem quydinhtichdiem) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_QUERY)) {
            preparedStatement.setString(1, quydinhtichdiem.getKieuTichDiem());
            preparedStatement.setInt(2, quydinhtichdiem.getTyLeTichDiem());
            preparedStatement.setInt(3, quydinhtichdiem.getNguongTien());
            preparedStatement.setInt(4, quydinhtichdiem.getSoDiemTuongUng());
            preparedStatement.setString(5, quydinhtichdiem.getMaQD());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public quydinhtichdiem layQuydinhtichdiemTheoID(String maQD) {
        quydinhtichdiem quydinhtichdiem = null;
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID_QUERY)) {
            preparedStatement.setString(1, maQD);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                quydinhtichdiem = new quydinhtichdiem();
                quydinhtichdiem.setMaQD(resultSet.getString("MaQD"));
                quydinhtichdiem.setKieuTichDiem(resultSet.getString("KieuTichDiem"));
                quydinhtichdiem.setTyLeTichDiem(resultSet.getInt("TyLeTichDiem"));
                quydinhtichdiem.setNguongTien(resultSet.getInt("NguongTien"));
                quydinhtichdiem.setSoDiemTuongUng(resultSet.getInt("SoDiemTuongUng"));
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return quydinhtichdiem;
    }

    public List<quydinhtichdiem> layTatCaQuydinhtichdiem() {
        List<quydinhtichdiem> danhSachQuydinhtichdiem = new ArrayList<>();
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_QUERY)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                quydinhtichdiem quydinhtichdiem = new quydinhtichdiem();
                quydinhtichdiem.setMaQD(resultSet.getString("MaQD"));
                quydinhtichdiem.setKieuTichDiem(resultSet.getString("KieuTichDiem"));
                quydinhtichdiem.setTyLeTichDiem(resultSet.getInt("TyLeTichDiem"));
                quydinhtichdiem.setNguongTien(resultSet.getInt("NguongTien"));
                quydinhtichdiem.setSoDiemTuongUng(resultSet.getInt("SoDiemTuongUng"));
                danhSachQuydinhtichdiem.add(quydinhtichdiem);
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return danhSachQuydinhtichdiem;
    }

}
