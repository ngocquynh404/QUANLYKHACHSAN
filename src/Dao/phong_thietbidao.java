package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.phong_thietbi;
import Util.JDBCUtils;

public class phong_thietbidao {
	private final String INSERT_QUERY = "INSERT INTO phong_thietbi (MaPhong, MaThietBi) VALUES (?, ?)";
    private final String SELECT_BY_ID_QUERY = "SELECT * FROM phong_thietbi WHERE MaPhong = ?";
    private final String DELETE_QUERY = "DELETE FROM phong_thietbi WHERE MaPhong = ?";
    private final String SELECT_ALL_QUERY = "SELECT * FROM phong_thietbi";

    public boolean themPhongThietBi(phong_thietbi phongThietBi) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY)) {
            preparedStatement.setString(1, phongThietBi.getMaPhong());
            preparedStatement.setString(2, phongThietBi.getMaThietBi());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public boolean xoaPhongThietBi(String maPhong) {
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

    public List<phong_thietbi> layThietBiCuaPhong(String maPhong) {
        List<phong_thietbi> danhSachThietBi = new ArrayList<>();
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID_QUERY)) {
            preparedStatement.setString(1, maPhong);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                phong_thietbi phongThietBi = new phong_thietbi();
                phongThietBi.setMaPhong(resultSet.getString("MaPhong"));
                phongThietBi.setMaThietBi(resultSet.getString("MaThietBi"));

                danhSachThietBi.add(phongThietBi);
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return danhSachThietBi;
    }

    public List<phong_thietbi> layTatCaPhongThietBi() {
        List<phong_thietbi> danhSachPhongThietBi = new ArrayList<>();
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_QUERY)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                phong_thietbi phongThietBi = new phong_thietbi();
                phongThietBi.setMaPhong(resultSet.getString("MaPhong"));
                phongThietBi.setMaThietBi(resultSet.getString("MaThietBi"));

                danhSachPhongThietBi.add(phongThietBi);
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return danhSachPhongThietBi;
    }
}
