package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.phutroicheckinsom;
import Util.JDBCUtils;

public class phutroicheckinsomdao {
	private final String INSERT_QUERY = "INSERT INTO phutroicheckinsom (MaPTCheckinSom, MaGiaThoiDiem, MaLoaiPhong, Gio, PhanTramTheoGiaPhong) VALUES (?, ?, ?, ?, ?)";
    private final String SELECT_BY_ID_QUERY = "SELECT * FROM phutroicheckinsom WHERE MaPTCheckinSom = ?";
    private final String UPDATE_QUERY = "UPDATE phutroicheckinsom SET MaGiaThoiDiem = ?, MaLoaiPhong = ?, Gio = ?, PhanTramTheoGiaPhong = ? WHERE MaPTCheckinSom = ?";
    private final String DELETE_QUERY = "DELETE FROM phutroicheckinsom WHERE MaPTCheckinSom = ?";
    private final String SELECT_ALL_QUERY = "SELECT * FROM phutroicheckinsom";

    public boolean themPhuTroicheckinsom(phutroicheckinsom phuTroicheckinsom) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY)) {
            preparedStatement.setString(1, phuTroicheckinsom.getMaPTCheckinSom());
            preparedStatement.setString(2, phuTroicheckinsom.getMaGiaThoiDiem());
            preparedStatement.setString(3, phuTroicheckinsom.getMaLoaiPhong());
            preparedStatement.setInt(4, phuTroicheckinsom.getGio());
            preparedStatement.setInt(5, phuTroicheckinsom.getPhanTramTheoGiaPhong());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public boolean xoaPhuTroicheckinsom(String maPTCheckinSom) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_QUERY)) {
            preparedStatement.setString(1, maPTCheckinSom);

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public boolean capNhatPhuTroicheckinsom(phutroicheckinsom phuTroicheckinsom) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_QUERY)) {
            preparedStatement.setString(1, phuTroicheckinsom.getMaGiaThoiDiem());
            preparedStatement.setString(2, phuTroicheckinsom.getMaLoaiPhong());
            preparedStatement.setInt(3, phuTroicheckinsom.getGio());
            preparedStatement.setInt(4, phuTroicheckinsom.getPhanTramTheoGiaPhong());
            preparedStatement.setString(5, phuTroicheckinsom.getMaPTCheckinSom());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public phutroicheckinsom layPhuTroicheckinsomTheoID(String maPTCheckinSom) {
        phutroicheckinsom phuTroicheckinsom = null;
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID_QUERY)) {
            preparedStatement.setString(1, maPTCheckinSom);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                phuTroicheckinsom = new phutroicheckinsom();
                phuTroicheckinsom.setMaPTCheckinSom(resultSet.getString("MaPTCheckinSom"));
                phuTroicheckinsom.setMaGiaThoiDiem(resultSet.getString("MaGiaThoiDiem"));
                phuTroicheckinsom.setMaLoaiPhong(resultSet.getString("MaLoaiPhong"));
                phuTroicheckinsom.setGio(resultSet.getInt("Gio"));
                phuTroicheckinsom.setPhanTramTheoGiaPhong(resultSet.getInt("PhanTramTheoGiaPhong"));
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return phuTroicheckinsom;
    }

    public List<phutroicheckinsom> layTatCaPhuTroicheckinsom() {
        List<phutroicheckinsom> danhSachPhuTroicheckinsom = new ArrayList<>();
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_QUERY)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                phutroicheckinsom phuTroicheckinsom = new phutroicheckinsom();
                phuTroicheckinsom.setMaPTCheckinSom(resultSet.getString("MaPTCheckinSom"));
                phuTroicheckinsom.setMaGiaThoiDiem(resultSet.getString("MaGiaThoiDiem"));
                phuTroicheckinsom.setMaLoaiPhong(resultSet.getString("MaLoaiPhong"));
                phuTroicheckinsom.setGio(resultSet.getInt("Gio"));
                phuTroicheckinsom.setPhanTramTheoGiaPhong(resultSet.getInt("PhanTramTheoGiaPhong"));
                danhSachPhuTroicheckinsom.add(phuTroicheckinsom);
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return danhSachPhuTroicheckinsom;
    }
}
