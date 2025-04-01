package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.thietbi;
import Util.JDBCUtils;

public class thietbidao {
	private final String INSERT_QUERY = "INSERT INTO thietbi (MaThietBi, MaLoaiThietBi, TenThietBi, GiaThietBi, TrangThai) VALUES (?, ?, ?, ?, ?)";
    private final String SELECT_BY_ID_QUERY = "SELECT * FROM thietbi WHERE MaThietBi = ?";
    private final String UPDATE_QUERY = "UPDATE thietbi SET MaLoaiThietBi = ?, TenThietBi = ?, GiaThietBi = ?, TrangThai = ? WHERE MaThietBi = ?";
    private final String DELETE_QUERY = "DELETE FROM thietbi WHERE MaThietBi = ?";
    private final String SELECT_ALL_QUERY = "SELECT * FROM thietbi";

    public boolean themThietBi(thietbi thietBi) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY)) {
            preparedStatement.setString(1, thietBi.getMaThietBi());
            preparedStatement.setString(2, thietBi.getMaLoaiThietBi());
            preparedStatement.setString(3, thietBi.getTenThietBi());
            preparedStatement.setInt(4, thietBi.getGiaThietBi());
            preparedStatement.setString(5, thietBi.getTrangThai());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public boolean xoaThietBi(String maThietBi) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_QUERY)) {
            preparedStatement.setString(1, maThietBi);

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public boolean capNhatThietBi(thietbi thietBi) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_QUERY)) {
            preparedStatement.setString(1, thietBi.getMaLoaiThietBi());
            preparedStatement.setString(2, thietBi.getTenThietBi());
            preparedStatement.setInt(3, thietBi.getGiaThietBi());
            preparedStatement.setString(4, thietBi.getTrangThai());
            preparedStatement.setString(5, thietBi.getMaThietBi());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public thietbi layThietBiTheoID(String maThietBi) {
        thietbi thietBi = null;
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID_QUERY)) {
            preparedStatement.setString(1, maThietBi);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                thietBi = new thietbi();
                thietBi.setMaThietBi(resultSet.getString("MaThietBi"));
                thietBi.setMaLoaiThietBi(resultSet.getString("MaLoaiThietBi"));
                thietBi.setTenThietBi(resultSet.getString("TenThietBi"));
                thietBi.setGiaThietBi(resultSet.getInt("GiaThietBi"));
                thietBi.setTrangThai(resultSet.getString("TrangThai"));
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return thietBi;
    }

    public List<thietbi> layTatCaThietBi() {
        List<thietbi> danhSachThietBi = new ArrayList<>();
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_QUERY)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                thietbi thietBi = new thietbi();
                thietBi.setMaThietBi(resultSet.getString("MaThietBi"));
                thietBi.setMaLoaiThietBi(resultSet.getString("MaLoaiThietBi"));
                thietBi.setTenThietBi(resultSet.getString("TenThietBi"));
                thietBi.setGiaThietBi(resultSet.getInt("GiaThietBi"));
                thietBi.setTrangThai(resultSet.getString("TrangThai"));
                danhSachThietBi.add(thietBi);
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return danhSachThietBi;
    }

}
