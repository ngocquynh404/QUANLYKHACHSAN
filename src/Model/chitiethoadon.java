package Model;

import java.util.Date;

public class chitiethoadon {
	private String maCTHD;
    private String maHD;
    private String maPDV;
    private String maPMSP;
    private String maPPS;
    private String maHV;
    private Integer tienPhong;
    private Integer tienDichVu;
    private Integer tienSanPham;
    private Integer phiPhatSinh;
    private Integer phuThuThemNguoi;
    private Integer phuTroi;
    private Integer phuThuKhac;
    private Integer khuyenMai;
    private Integer tongTien;
    private String phuongThucThanhToan;
    private Date ngayThanhToan;
	public chitiethoadon() {
		super();
	}
	public chitiethoadon(String maCTHD, String maHD, String maPDV, String maPMSP, String maPPS, String maHV,
			Integer tienPhong, Integer tienDichVu, Integer tienSanPham, Integer phiPhatSinh, Integer phuThuThemNguoi,
			Integer phuTroi, Integer phuThuKhac, Integer khuyenMai, Integer tongTien, String phuongThucThanhToan,
			Date ngayThanhToan) {
		super();
		this.maCTHD = maCTHD;
		this.maHD = maHD;
		this.maPDV = maPDV;
		this.maPMSP = maPMSP;
		this.maPPS = maPPS;
		this.maHV = maHV;
		this.tienPhong = tienPhong;
		this.tienDichVu = tienDichVu;
		this.tienSanPham = tienSanPham;
		this.phiPhatSinh = phiPhatSinh;
		this.phuThuThemNguoi = phuThuThemNguoi;
		this.phuTroi = phuTroi;
		this.phuThuKhac = phuThuKhac;
		this.khuyenMai = khuyenMai;
		this.tongTien = tongTien;
		this.phuongThucThanhToan = phuongThucThanhToan;
		this.ngayThanhToan = ngayThanhToan;
	}
	public String getMaCTHD() {
		return maCTHD;
	}
	public void setMaCTHD(String maCTHD) {
		this.maCTHD = maCTHD;
	}
	public String getMaHD() {
		return maHD;
	}
	public void setMaHD(String maHD) {
		this.maHD = maHD;
	}
	public String getMaPDV() {
		return maPDV;
	}
	public void setMaPDV(String maPDV) {
		this.maPDV = maPDV;
	}
	public String getMaPMSP() {
		return maPMSP;
	}
	public void setMaPMSP(String maPMSP) {
		this.maPMSP = maPMSP;
	}
	public String getMaPPS() {
		return maPPS;
	}
	public void setMaPPS(String maPPS) {
		this.maPPS = maPPS;
	}
	public String getMaHV() {
		return maHV;
	}
	public void setMaHV(String maHV) {
		this.maHV = maHV;
	}
	public Integer getTienPhong() {
		return tienPhong;
	}
	public void setTienPhong(Integer tienPhong) {
		this.tienPhong = tienPhong;
	}
	public Integer getTienDichVu() {
		return tienDichVu;
	}
	public void setTienDichVu(Integer tienDichVu) {
		this.tienDichVu = tienDichVu;
	}
	public Integer getTienSanPham() {
		return tienSanPham;
	}
	public void setTienSanPham(Integer tienSanPham) {
		this.tienSanPham = tienSanPham;
	}
	public Integer getPhiPhatSinh() {
		return phiPhatSinh;
	}
	public void setPhiPhatSinh(Integer phiPhatSinh) {
		this.phiPhatSinh = phiPhatSinh;
	}
	public Integer getPhuThuThemNguoi() {
		return phuThuThemNguoi;
	}
	public void setPhuThuThemNguoi(Integer phuThuThemNguoi) {
		this.phuThuThemNguoi = phuThuThemNguoi;
	}
	public Integer getPhuTroi() {
		return phuTroi;
	}
	public void setPhuTroi(Integer phuTroi) {
		this.phuTroi = phuTroi;
	}
	public Integer getPhuThuKhac() {
		return phuThuKhac;
	}
	public void setPhuThuKhac(Integer phuThuKhac) {
		this.phuThuKhac = phuThuKhac;
	}
	public Integer getKhuyenMai() {
		return khuyenMai;
	}
	public void setKhuyenMai(Integer khuyenMai) {
		this.khuyenMai = khuyenMai;
	}
	public Integer getTongTien() {
		return tongTien;
	}
	public void setTongTien(Integer tongTien) {
		this.tongTien = tongTien;
	}
	public String getPhuongThucThanhToan() {
		return phuongThucThanhToan;
	}
	public void setPhuongThucThanhToan(String phuongThucThanhToan) {
		this.phuongThucThanhToan = phuongThucThanhToan;
	}
	public Date getNgayThanhToan() {
		return ngayThanhToan;
	}
	public void setNgayThanhToan(Date ngayThanhToan) {
		this.ngayThanhToan = ngayThanhToan;
	}
    
}
