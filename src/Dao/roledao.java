package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.role;
import Util.JDBCUtils;

public class roledao {
	private final String INSERT_QUERY = "INSERT INTO role (RoleID, RoleName) VALUES (?, ?)";
    private final String SELECT_BY_ID_QUERY = "SELECT * FROM role WHERE RoleID = ?";
    private final String UPDATE_QUERY = "UPDATE role SET RoleName = ? WHERE RoleID = ?";
    private final String DELETE_QUERY = "DELETE FROM role WHERE RoleID = ?";
    private final String SELECT_ALL_QUERY = "SELECT * FROM role";

    public boolean themRole(role role) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY)) {
            preparedStatement.setString(1, role.getRoleID());
            preparedStatement.setString(2, role.getRoleName());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public boolean xoaRole(String roleID) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_QUERY)) {
            preparedStatement.setString(1, roleID);

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public boolean capNhatRole(role role) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_QUERY)) {
            preparedStatement.setString(1, role.getRoleName());
            preparedStatement.setString(2, role.getRoleID());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public role layRoleTheoID(String roleID) {
        role role = null;
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID_QUERY)) {
            preparedStatement.setString(1, roleID);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                role = new role();
                role.setRoleID(resultSet.getString("RoleID"));
                role.setRoleName(resultSet.getString("RoleName"));
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return role;
    }

    public List<role> layTatCaRole() {
        List<role> danhSachRole = new ArrayList<>();
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_QUERY)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                role role = new role();
                role.setRoleID(resultSet.getString("RoleID"));
                role.setRoleName(resultSet.getString("RoleName"));

                danhSachRole.add(role);
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return danhSachRole;
    }
}
