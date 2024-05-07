package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.giaphong;
import Util.JDBCUtils;

public class giaphongdao {
	private final String INSERT_QUERY = "INSERT INTO giaphong (MaGiaPhong, MaGiaThoiDiem, MaLoaiPhong, GiaNgay, GiaQuaDem, GiaTheoGio, GiaTuan, GiaThang) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    private final String SELECT_BY_ID_QUERY = "SELECT * FROM giaphong WHERE MaGiaPhong = ?";
    private final String UPDATE_QUERY = "UPDATE giaphong SET MaGiaThoiDiem = ?, MaLoaiPhong = ?, GiaNgay = ?, GiaQuaDem = ?, GiaTheoGio = ?, GiaTuan = ?, GiaThang = ? WHERE MaGiaPhong = ?";
    private final String DELETE_QUERY = "DELETE FROM giaphong WHERE MaGiaPhong = ?";
    private final String SELECT_ALL_QUERY = "SELECT * FROM giaphong";

    public boolean themGiaPhong(giaphong giaPhong) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY)) {
            preparedStatement.setString(1, giaPhong.getMaGiaPhong());
            preparedStatement.setString(2, giaPhong.getMaGiaThoiDiem());
            preparedStatement.setString(3, giaPhong.getMaLoaiPhong());
            preparedStatement.setInt(4, giaPhong.getGiaNgay());
            preparedStatement.setInt(5, giaPhong.getGiaQuaDem());
            preparedStatement.setInt(6, giaPhong.getGiaTheoGio());
            preparedStatement.setInt(7, giaPhong.getGiaTuan());
            preparedStatement.setInt(8, giaPhong.getGiaThang());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public boolean xoaGiaPhong(String maGiaPhong) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_QUERY)) {
            preparedStatement.setString(1, maGiaPhong);

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public boolean capNhatGiaPhong(giaphong giaPhong) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_QUERY)) {
            preparedStatement.setString(1, giaPhong.getMaGiaThoiDiem());
            preparedStatement.setString(2, giaPhong.getMaLoaiPhong());
            preparedStatement.setInt(3, giaPhong.getGiaNgay());
            preparedStatement.setInt(4, giaPhong.getGiaQuaDem());
            preparedStatement.setInt(5, giaPhong.getGiaTheoGio());
            preparedStatement.setInt(6, giaPhong.getGiaTuan());
            preparedStatement.setInt(7, giaPhong.getGiaThang());
            preparedStatement.setString(8, giaPhong.getMaGiaPhong());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public giaphong layGiaPhongTheoID(String maGiaPhong) {
        giaphong giaPhong = null;
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID_QUERY)) {
            preparedStatement.setString(1, maGiaPhong);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                giaPhong = new giaphong();
                giaPhong.setMaGiaPhong(resultSet.getString("MaGiaPhong"));
                giaPhong.setMaGiaThoiDiem(resultSet.getString("MaGiaThoiDiem"));
                giaPhong.setMaLoaiPhong(resultSet.getString("MaLoaiPhong"));
                giaPhong.setGiaNgay(resultSet.getInt("GiaNgay"));
                giaPhong.setGiaQuaDem(resultSet.getInt("GiaQuaDem"));
                giaPhong.setGiaTheoGio(resultSet.getInt("GiaTheoGio"));
                giaPhong.setGiaTuan(resultSet.getInt("GiaTuan"));
                giaPhong.setGiaThang(resultSet.getInt("GiaThang"));
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return giaPhong;
    }

    public List<giaphong> layTatCaGiaPhong() {
        List<giaphong> danhSachGiaPhong = new ArrayList<>();
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_QUERY)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                giaphong giaPhong = new giaphong();
                giaPhong.setMaGiaPhong(resultSet.getString("MaGiaPhong"));
                giaPhong.setMaGiaThoiDiem(resultSet.getString("MaGiaThoiDiem"));
                giaPhong.setMaLoaiPhong(resultSet.getString("MaLoaiPhong"));
                giaPhong.setGiaNgay(resultSet.getInt("GiaNgay"));
                giaPhong.setGiaQuaDem(resultSet.getInt("GiaQuaDem"));
                giaPhong.setGiaTheoGio(resultSet.getInt("GiaTheoGio"));
                giaPhong.setGiaTuan(resultSet.getInt("GiaTuan"));
                giaPhong.setGiaThang(resultSet.getInt("GiaThang"));
                danhSachGiaPhong.add(giaPhong);
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return danhSachGiaPhong;
    }
}
