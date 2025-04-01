package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.phuthuthemnguoi;
import Util.JDBCUtils;

public class phuthuthemnguoidao {
	private final String INSERT_QUERY = "INSERT INTO phuthuthemnguoi (MaPTThemNguoi, MaGiaThoiDiem, MaLoaiPhong, NguoiLon, TreEm) VALUES (?, ?, ?, ?, ?)";
    private final String SELECT_BY_ID_QUERY = "SELECT * FROM phuthuthemnguoi WHERE MaPTThemNguoi = ?";
    private final String UPDATE_QUERY = "UPDATE phuthuthemnguoi SET MaGiaThoiDiem = ?, MaLoaiPhong = ?, NguoiLon = ?, TreEm = ? WHERE MaPTThemNguoi = ?";
    private final String DELETE_QUERY = "DELETE FROM phuthuthemnguoi WHERE MaPTThemNguoi = ?";
    private final String SELECT_ALL_QUERY = "SELECT * FROM phuthuthemnguoi";

    public boolean themPhuThuThemNguoi(phuthuthemnguoi phuThuThemNguoi) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY)) {
            preparedStatement.setString(1, phuThuThemNguoi.getMaPTThemNguoi());
            preparedStatement.setString(2, phuThuThemNguoi.getMaGiaThoiDiem());
            preparedStatement.setString(3, phuThuThemNguoi.getMaLoaiPhong());
            preparedStatement.setInt(4, phuThuThemNguoi.getNguoiLon());
            preparedStatement.setInt(5, phuThuThemNguoi.getTreEm());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public boolean xoaPhuThuThemNguoi(String maPTThemNguoi) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_QUERY)) {
            preparedStatement.setString(1, maPTThemNguoi);

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public boolean capNhatPhuThuThemNguoi(phuthuthemnguoi phuThuThemNguoi) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_QUERY)) {
            preparedStatement.setString(1, phuThuThemNguoi.getMaGiaThoiDiem());
            preparedStatement.setString(2, phuThuThemNguoi.getMaLoaiPhong());
            preparedStatement.setInt(3, phuThuThemNguoi.getNguoiLon());
            preparedStatement.setInt(4, phuThuThemNguoi.getTreEm());
            preparedStatement.setString(5, phuThuThemNguoi.getMaPTThemNguoi());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public phuthuthemnguoi layPhuThuThemNguoiTheoID(String maPTThemNguoi) {
        phuthuthemnguoi phuThuThemNguoi = null;
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID_QUERY)) {
            preparedStatement.setString(1, maPTThemNguoi);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                phuThuThemNguoi = new phuthuthemnguoi();
                phuThuThemNguoi.setMaPTThemNguoi(resultSet.getString("MaPTThemNguoi"));
                phuThuThemNguoi.setMaGiaThoiDiem(resultSet.getString("MaGiaThoiDiem"));
                phuThuThemNguoi.setMaLoaiPhong(resultSet.getString("MaLoaiPhong"));
                phuThuThemNguoi.setNguoiLon(resultSet.getInt("NguoiLon"));
                phuThuThemNguoi.setTreEm(resultSet.getInt("TreEm"));
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return phuThuThemNguoi;
    }

    public List<phuthuthemnguoi> layTatCaPhuThuThemNguoi() {
        List<phuthuthemnguoi> danhSachPhuThuThemNguoi = new ArrayList<>();
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_QUERY)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                phuthuthemnguoi phuThuThemNguoi = new phuthuthemnguoi();
                phuThuThemNguoi.setMaPTThemNguoi(resultSet.getString("MaPTThemNguoi"));
                phuThuThemNguoi.setMaGiaThoiDiem(resultSet.getString("MaGiaThoiDiem"));
                phuThuThemNguoi.setMaLoaiPhong(resultSet.getString("MaLoaiPhong"));
                phuThuThemNguoi.setNguoiLon(resultSet.getInt("NguoiLon"));
                phuThuThemNguoi.setTreEm(resultSet.getInt("TreEm"));

                danhSachPhuThuThemNguoi.add(phuThuThemNguoi);
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return danhSachPhuThuThemNguoi;
    }
}
