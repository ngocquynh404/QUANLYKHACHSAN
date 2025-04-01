package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.nguoidung;
import Util.JDBCUtils;

public class nguoidungdao {
	private final String INSERT_QUERY = "INSERT INTO nguoidung (MaNguoiDung, HoVaTen, GioiTinh, NgaySinh, SDT, Email, Username, Password, RoleID, TrangThai) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private final String SELECT_BY_ID_QUERY = "SELECT * FROM nguoidung WHERE MaNguoiDung = ?";
    private final String UPDATE_QUERY = "UPDATE nguoidung SET HoVaTen = ?, GioiTinh = ?, NgaySinh = ?, SDT = ?, Email = ?, Username = ?, Password = ?, RoleID = ?, TrangThai = ? WHERE MaNguoiDung = ?";
    private final String DELETE_QUERY = "DELETE FROM nguoidung WHERE MaNguoiDung = ?";
    private final String SELECT_ALL_QUERY = "SELECT * FROM nguoidung";

    public boolean themNguoiDung(nguoidung nguoiDung) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY)) {
            preparedStatement.setString(1, nguoiDung.getMaNguoiDung());
            preparedStatement.setString(2, nguoiDung.getHoVaTen());
            preparedStatement.setString(3, nguoiDung.getGioiTinh());
            preparedStatement.setDate(4, new java.sql.Date(nguoiDung.getNgaySinh().getTime()));
            preparedStatement.setString(5, nguoiDung.getSdt());
            preparedStatement.setString(6, nguoiDung.getEmail());
            preparedStatement.setString(7, nguoiDung.getUsername());
            preparedStatement.setString(8, nguoiDung.getPassword());
            preparedStatement.setString(9, nguoiDung.getRoleID());
            preparedStatement.setString(10, nguoiDung.getTrangThai());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public boolean xoaNguoiDung(String maNguoiDung) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_QUERY)) {
            preparedStatement.setString(1, maNguoiDung);

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public boolean capNhatNguoiDung(nguoidung nguoiDung) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_QUERY)) {
            preparedStatement.setString(1, nguoiDung.getHoVaTen());
            preparedStatement.setString(2, nguoiDung.getGioiTinh());
            preparedStatement.setDate(3, new java.sql.Date(nguoiDung.getNgaySinh().getTime()));
            preparedStatement.setString(4, nguoiDung.getSdt());
            preparedStatement.setString(5, nguoiDung.getEmail());
            preparedStatement.setString(6, nguoiDung.getUsername());
            preparedStatement.setString(7, nguoiDung.getPassword());
            preparedStatement.setString(8, nguoiDung.getRoleID());
            preparedStatement.setString(9, nguoiDung.getTrangThai());
            preparedStatement.setString(10, nguoiDung.getMaNguoiDung());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public nguoidung layNguoiDungTheoID(String maNguoiDung) {
        nguoidung nguoiDung = null;
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID_QUERY)) {
            preparedStatement.setString(1, maNguoiDung);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                nguoiDung = new nguoidung();
                nguoiDung.setMaNguoiDung(resultSet.getString("MaNguoiDung"));
                nguoiDung.setHoVaTen(resultSet.getString("HoVaTen"));
                nguoiDung.setGioiTinh(resultSet.getString("GioiTinh"));
                nguoiDung.setNgaySinh(resultSet.getDate("NgaySinh"));
                nguoiDung.setSdt(resultSet.getString("SDT"));
                nguoiDung.setEmail(resultSet.getString("Email"));
                nguoiDung.setUsername(resultSet.getString("Username"));
                nguoiDung.setPassword(resultSet.getString("Password"));
                nguoiDung.setRoleID(resultSet.getString("RoleID"));
                nguoiDung.setTrangThai(resultSet.getString("TrangThai"));
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return nguoiDung;
    }
    public List<nguoidung> layTatCaNguoiDung() {
        List<nguoidung> danhSachNguoiDung = new ArrayList<>();
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_QUERY)) {
        	ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                nguoidung nguoiDung = new nguoidung();
                nguoiDung.setMaNguoiDung(resultSet.getString("MaNguoiDung"));
                nguoiDung.setHoVaTen(resultSet.getString("HoVaTen"));
                nguoiDung.setGioiTinh(resultSet.getString("GioiTinh"));
                nguoiDung.setNgaySinh(resultSet.getDate("NgaySinh"));
                nguoiDung.setSdt(resultSet.getString("SDT"));
                nguoiDung.setEmail(resultSet.getString("Email"));
                nguoiDung.setUsername(resultSet.getString("Username"));
                nguoiDung.setPassword(resultSet.getString("Password"));
                nguoiDung.setRoleID(resultSet.getString("RoleID"));
                nguoiDung.setTrangThai(resultSet.getString("TrangThai"));

                danhSachNguoiDung.add(nguoiDung);
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return danhSachNguoiDung;
    }
}
