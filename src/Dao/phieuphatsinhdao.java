package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.phieuphatsinh;
import Util.JDBCUtils;

public class phieuphatsinhdao {
	private final String INSERT_QUERY = "INSERT INTO phieuphatsinh (MaPPS, MaPhong, LyDoPhatSinh, TongChiPhi, GhiChu) VALUES (?, ?, ?, ?, ?)";
    private final String SELECT_BY_ID_QUERY = "SELECT * FROM phieuphatsinh WHERE MaPPS = ?";
    private final String UPDATE_QUERY = "UPDATE phieuphatsinh SET MaPhong = ?, LyDoPhatSinh = ?, TongChiPhi = ?, GhiChu = ? WHERE MaPPS = ?";
    private final String DELETE_QUERY = "DELETE FROM phieuphatsinh WHERE MaPPS = ?";
    private final String SELECT_ALL_QUERY = "SELECT * FROM phieuphatsinh";

    public boolean themPhieuPhatSinh(phieuphatsinh phieuPhatSinh) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY)) {
            preparedStatement.setString(1, phieuPhatSinh.getMaPPS());
            preparedStatement.setString(2, phieuPhatSinh.getMaPhong());
            preparedStatement.setString(3, phieuPhatSinh.getLyDoPhatSinh());
            preparedStatement.setFloat(4, phieuPhatSinh.getTongChiPhi());
            preparedStatement.setString(5, phieuPhatSinh.getGhiChu());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public boolean xoaPhieuPhatSinh(String maPPS) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_QUERY)) {
            preparedStatement.setString(1, maPPS);

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public boolean capNhatPhieuPhatSinh(phieuphatsinh phieuPhatSinh) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_QUERY)) {
            preparedStatement.setString(1, phieuPhatSinh.getMaPhong());
            preparedStatement.setString(2, phieuPhatSinh.getLyDoPhatSinh());
            preparedStatement.setFloat(3, phieuPhatSinh.getTongChiPhi());
            preparedStatement.setString(4, phieuPhatSinh.getGhiChu());
            preparedStatement.setString(5, phieuPhatSinh.getMaPPS());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public phieuphatsinh layPhieuPhatSinhTheoID(String maPPS) {
        phieuphatsinh phieuPhatSinh = null;
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID_QUERY)) {
            preparedStatement.setString(1, maPPS);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                phieuPhatSinh = new phieuphatsinh();
                phieuPhatSinh.setMaPPS(resultSet.getString("MaPPS"));
                phieuPhatSinh.setMaPhong(resultSet.getString("MaPhong"));
                phieuPhatSinh.setLyDoPhatSinh(resultSet.getString("LyDoPhatSinh"));
                phieuPhatSinh.setTongChiPhi(resultSet.getFloat("TongChiPhi"));
                phieuPhatSinh.setGhiChu(resultSet.getString("GhiChu"));
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return phieuPhatSinh;
    }

    public List<phieuphatsinh> layTatCaPhieuPhatSinh() {
        List<phieuphatsinh> danhSachPhieuPhatSinh = new ArrayList<>();
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_QUERY)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                phieuphatsinh phieuPhatSinh = new phieuphatsinh();
                phieuPhatSinh.setMaPPS(resultSet.getString("MaPPS"));
                phieuPhatSinh.setMaPhong(resultSet.getString("MaPhong"));
                phieuPhatSinh.setLyDoPhatSinh(resultSet.getString("LyDoPhatSinh"));
                phieuPhatSinh.setTongChiPhi(resultSet.getFloat("TongChiPhi"));
                phieuPhatSinh.setGhiChu(resultSet.getString("GhiChu"));
                danhSachPhieuPhatSinh.add(phieuPhatSinh);
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return danhSachPhieuPhatSinh;
    }
}
