package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Model.chitiethoadon;
import Util.JDBCUtils;

public class chitiethoadondao {
    private final String INSERT_QUERY = "INSERT INTO chitiethoadon (MaCTHD, MaHD, MaPDV, MaPMSP, MaPPS, MaHV, TienPhong, TienDichVu, TienSanPham, PhiPhatSinh, PhuThuThemNguoi, PhuTroi, PhuThuKhac, KhuyenMai, TongTien, PhuongThucThanhToan, NgayThanhToan) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private final String SELECT_BY_ID_QUERY = "SELECT * FROM chitiethoadon WHERE MaCTHD = ?";
    private final String UPDATE_QUERY = "UPDATE chitiethoadon SET MaHD = ?, MaPDV = ?, MaPMSP = ?, MaPPS = ?, MaHV = ?, TienPhong = ?, TienDichVu = ?, TienSanPham = ?, PhiPhatSinh = ?, PhuThuThemNguoi = ?, PhuTroi = ?, PhuThuKhac = ?, KhuyenMai = ?, TongTien = ?, PhuongThucThanhToan = ?, NgayThanhToan = ? WHERE MaCTHD = ?";
    private final String DELETE_QUERY = "DELETE FROM chitiethoadon WHERE MaCTHD = ?";
    private final String SELECT_ALL_QUERY = "SELECT * FROM chitiethoadon";

    public boolean themChiTietHoaDon(chitiethoadon chiTietHoaDon) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY)) {
            preparedStatement.setString(1, chiTietHoaDon.getMaCTHD());
            preparedStatement.setString(2, chiTietHoaDon.getMaHD());
            preparedStatement.setString(3, chiTietHoaDon.getMaPDV());
            preparedStatement.setString(4, chiTietHoaDon.getMaPMSP());
            preparedStatement.setString(5, chiTietHoaDon.getMaPPS());
            preparedStatement.setString(6, chiTietHoaDon.getMaHV());
            preparedStatement.setInt(7, chiTietHoaDon.getTienPhong());
            preparedStatement.setInt(8, chiTietHoaDon.getTienDichVu());
            preparedStatement.setInt(9, chiTietHoaDon.getTienSanPham());
            preparedStatement.setInt(10, chiTietHoaDon.getPhiPhatSinh());
            preparedStatement.setInt(11, chiTietHoaDon.getPhuThuThemNguoi());
            preparedStatement.setInt(12, chiTietHoaDon.getPhuTroi());
            preparedStatement.setInt(13, chiTietHoaDon.getPhuThuKhac());
            preparedStatement.setInt(14, chiTietHoaDon.getKhuyenMai());
            preparedStatement.setInt(15, chiTietHoaDon.getTongTien());
            preparedStatement.setString(16, chiTietHoaDon.getPhuongThucThanhToan());
            preparedStatement.setDate(17, new java.sql.Date(chiTietHoaDon.getNgayThanhToan().getTime()));

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public boolean xoaChiTietHoaDon(String maCTHD) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_QUERY)) {
            preparedStatement.setString(1, maCTHD);

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public boolean capNhatChiTietHoaDon(chitiethoadon chiTietHoaDon) {
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_QUERY)) {
            preparedStatement.setString(1, chiTietHoaDon.getMaHD());
            preparedStatement.setString(2, chiTietHoaDon.getMaPDV());
            preparedStatement.setString(3, chiTietHoaDon.getMaPMSP());
            preparedStatement.setString(4, chiTietHoaDon.getMaPPS());
            preparedStatement.setString(5, chiTietHoaDon.getMaHV());
            preparedStatement.setInt(6, chiTietHoaDon.getTienPhong());
            preparedStatement.setInt(7, chiTietHoaDon.getTienDichVu());
            preparedStatement.setInt(8, chiTietHoaDon.getTienSanPham());
            preparedStatement.setInt(9, chiTietHoaDon.getPhiPhatSinh());
            preparedStatement.setInt(10, chiTietHoaDon.getPhuThuThemNguoi());
            preparedStatement.setInt(11, chiTietHoaDon.getPhuTroi());
            preparedStatement.setInt(12, chiTietHoaDon.getPhuThuKhac());
            preparedStatement.setInt(13, chiTietHoaDon.getKhuyenMai());
            preparedStatement.setInt(14, chiTietHoaDon.getTongTien());
            preparedStatement.setString(15, chiTietHoaDon.getPhuongThucThanhToan());
            preparedStatement.setDate(16, new java.sql.Date(chiTietHoaDon.getNgayThanhToan().getTime()));
            preparedStatement.setString(17, chiTietHoaDon.getMaCTHD());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
            return false;
        }
    }

    public chitiethoadon layChiTietHoaDonTheoID(String maCTHD) {
        chitiethoadon chiTietHoaDon = null;
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID_QUERY)) {
            preparedStatement.setString(1, maCTHD);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                chiTietHoaDon = new chitiethoadon();
                chiTietHoaDon.setMaCTHD(resultSet.getString("MaCTHD"));
                chiTietHoaDon.setMaHD(resultSet.getString("MaHD"));
                chiTietHoaDon.setMaPDV(resultSet.getString("MaPDV"));
                chiTietHoaDon.setMaPMSP(resultSet.getString("MaPMSP"));
                chiTietHoaDon.setMaPPS(resultSet.getString("MaPPS"));
                chiTietHoaDon.setMaHV(resultSet.getString("MaHV"));
                chiTietHoaDon.setTienPhong(resultSet.getInt("TienPhong"));
                chiTietHoaDon.setTienDichVu(resultSet.getInt("TienDichVu"));
                chiTietHoaDon.setTienSanPham(resultSet.getInt("TienSanPham"));
                chiTietHoaDon.setPhiPhatSinh(resultSet.getInt("PhiPhatSinh"));
                chiTietHoaDon.setPhuThuThemNguoi(resultSet.getInt("PhuThuThemNguoi"));
                chiTietHoaDon.setPhuTroi(resultSet.getInt("PhuTroi"));
                chiTietHoaDon.setPhuThuKhac(resultSet.getInt("PhuThuKhac"));
                chiTietHoaDon.setKhuyenMai(resultSet.getInt("KhuyenMai"));
                chiTietHoaDon.setTongTien(resultSet.getInt("TongTien"));
                chiTietHoaDon.setPhuongThucThanhToan(resultSet.getString("PhuongThucThanhToan"));
                chiTietHoaDon.setNgayThanhToan(resultSet.getDate("NgayThanhToan"));
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return chiTietHoaDon;
    }

    public List<chitiethoadon> layTatCaChiTietHoaDon() {
        List<chitiethoadon> danhSachChiTietHoaDon = new ArrayList<>();
        try (Connection connection = JDBCUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_QUERY)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                chitiethoadon chiTietHoaDon = new chitiethoadon();
                chiTietHoaDon.setMaCTHD(resultSet.getString("MaCTHD"));
                chiTietHoaDon.setMaHD(resultSet.getString("MaHD"));
                chiTietHoaDon.setMaPDV(resultSet.getString("MaPDV"));
                chiTietHoaDon.setMaPMSP(resultSet.getString("MaPMSP"));
                chiTietHoaDon.setMaPPS(resultSet.getString("MaPPS"));
                chiTietHoaDon.setMaHV(resultSet.getString("MaHV"));
                chiTietHoaDon.setTienPhong(resultSet.getInt("TienPhong"));
                chiTietHoaDon.setTienDichVu(resultSet.getInt("TienDichVu"));
                chiTietHoaDon.setTienSanPham(resultSet.getInt("TienSanPham"));
                chiTietHoaDon.setPhiPhatSinh(resultSet.getInt("PhiPhatSinh"));
                chiTietHoaDon.setPhuThuThemNguoi(resultSet.getInt("PhuThuThemNguoi"));
                chiTietHoaDon.setPhuTroi(resultSet.getInt("PhuTroi"));
                chiTietHoaDon.setPhuThuKhac(resultSet.getInt("PhuThuKhac"));
                chiTietHoaDon.setKhuyenMai(resultSet.getInt("KhuyenMai"));
                chiTietHoaDon.setTongTien(resultSet.getInt("TongTien"));
                chiTietHoaDon.setPhuongThucThanhToan(resultSet.getString("PhuongThucThanhToan"));
                chiTietHoaDon.setNgayThanhToan(resultSet.getDate("NgayThanhToan"));

                danhSachChiTietHoaDon.add(chiTietHoaDon);
            }
        } catch (SQLException e) {
            JDBCUtils.printSQLException(e);
        }
        return danhSachChiTietHoaDon;
    }
}
