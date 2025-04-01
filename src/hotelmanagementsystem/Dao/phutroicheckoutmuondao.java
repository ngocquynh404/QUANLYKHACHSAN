package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.phutroicheckoutmuon;
import Util.JDBCUtils;

public class phutroicheckoutmuondao {
	private final String INSERT_QUERY = "INSERT INTO phutroicheckoutmuon (maPTCheckoutMuon, MaGiaThoiDiem, MaLoaiPhong, Gio, PhanTramTheoGiaPhong) VALUES (?, ?, ?, ?, ?)";
    private final String SELECT_BY_ID_QUERY = "SELECT * FROM phutroicheckoutmuon WHERE maPTCheckoutMuon = ?";
    private final String UPDATE_QUERY = "UPDATE phutroicheckoutmuon SET MaGiaThoiDiem = ?, MaLoaiPhong = ?, Gio = ?, PhanTramTheoGiaPhong = ? WHERE maPTCheckoutMuon = ?";
    private final String DELETE_QUERY = "DELETE FROM phutroicheckoutmuon WHERE maPTCheckoutMuon = ?";
    private final String SELECT_ALL_QUERY = "SELECT * FROM phutroicheckoutmuon";

    public boolean themPhuTroicheckoutmuon(phutroicheckoutmuon phuTroicheckoutmuon) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY)) {
            preparedStatement.setString(1, phuTroicheckoutmuon.getmaPTCheckoutMuon());
            preparedStatement.setString(2, phuTroicheckoutmuon.getMaGiaThoiDiem());
            preparedStatement.setString(3, phuTroicheckoutmuon.getMaLoaiPhong());
            preparedStatement.setInt(4, phuTroicheckoutmuon.getGio());
            preparedStatement.setInt(5, phuTroicheckoutmuon.getPhanTramTheoGiaPhong());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public boolean xoaPhuTroicheckoutmuon(String maPTCheckoutMuon) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_QUERY)) {
            preparedStatement.setString(1, maPTCheckoutMuon);

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public boolean capNhatPhuTroicheckoutmuon(phutroicheckoutmuon phuTroicheckoutmuon) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_QUERY)) {
            preparedStatement.setString(1, phuTroicheckoutmuon.getMaGiaThoiDiem());
            preparedStatement.setString(2, phuTroicheckoutmuon.getMaLoaiPhong());
            preparedStatement.setInt(3, phuTroicheckoutmuon.getGio());
            preparedStatement.setInt(4, phuTroicheckoutmuon.getPhanTramTheoGiaPhong());
            preparedStatement.setString(5, phuTroicheckoutmuon.getmaPTCheckoutMuon());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public phutroicheckoutmuon layPhuTroicheckoutmuonTheoID(String maPTCheckoutMuon) {
        phutroicheckoutmuon phuTroicheckoutmuon = null;
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID_QUERY)) {
            preparedStatement.setString(1, maPTCheckoutMuon);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                phuTroicheckoutmuon = new phutroicheckoutmuon();
                phuTroicheckoutmuon.setmaPTCheckoutMuon(resultSet.getString("maPTCheckoutMuon"));
                phuTroicheckoutmuon.setMaGiaThoiDiem(resultSet.getString("MaGiaThoiDiem"));
                phuTroicheckoutmuon.setMaLoaiPhong(resultSet.getString("MaLoaiPhong"));
                phuTroicheckoutmuon.setGio(resultSet.getInt("Gio"));
                phuTroicheckoutmuon.setPhanTramTheoGiaPhong(resultSet.getInt("PhanTramTheoGiaPhong"));
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return phuTroicheckoutmuon;
    }

    public List<phutroicheckoutmuon> layTatCaPhuTroicheckoutmuon() {
        List<phutroicheckoutmuon> danhSachPhuTroicheckoutmuon = new ArrayList<>();
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_QUERY)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                phutroicheckoutmuon phuTroicheckoutmuon = new phutroicheckoutmuon();
                phuTroicheckoutmuon.setmaPTCheckoutMuon(resultSet.getString("maPTCheckoutMuon"));
                phuTroicheckoutmuon.setMaGiaThoiDiem(resultSet.getString("MaGiaThoiDiem"));
                phuTroicheckoutmuon.setMaLoaiPhong(resultSet.getString("MaLoaiPhong"));
                phuTroicheckoutmuon.setGio(resultSet.getInt("Gio"));
                phuTroicheckoutmuon.setPhanTramTheoGiaPhong(resultSet.getInt("PhanTramTheoGiaPhong"));

                danhSachPhuTroicheckoutmuon.add(phuTroicheckoutmuon);
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return danhSachPhuTroicheckoutmuon;
    }
}
