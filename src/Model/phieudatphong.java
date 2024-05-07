package Model;

import java.util.Date;

public class phieudatphong {
	private String maPDP;
    private Date ngayLapPhieu;
    private String maKH;
    private String loaiHinh;
    private Integer soLuongNguoi;
    private Integer soLuongPhong;
    private Integer traTruoc;
    private String ghiChu;
    private String trangThai;
	public phieudatphong() {
		super();
	}
	public phieudatphong(String maPDP, Date ngayLapPhieu, String maKH, String loaiHinh, Integer soLuongNguoi,
			Integer soLuongPhong, Integer traTruoc, String ghiChu, String trangThai) {
		super();
		this.maPDP = maPDP;
		this.ngayLapPhieu = ngayLapPhieu;
		this.maKH = maKH;
		this.loaiHinh = loaiHinh;
		this.soLuongNguoi = soLuongNguoi;
		this.soLuongPhong = soLuongPhong;
		this.traTruoc = traTruoc;
		this.ghiChu = ghiChu;
		this.trangThai = trangThai;
	}
	public String getMaPDP() {
		return maPDP;
	}
	public void setMaPDP(String maPDP) {
		this.maPDP = maPDP;
	}
	public Date getNgayLapPhieu() {
		return ngayLapPhieu;
	}
	public void setNgayLapPhieu(Date ngayLapPhieu) {
		this.ngayLapPhieu = ngayLapPhieu;
	}
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public String getLoaiHinh() {
		return loaiHinh;
	}
	public void setLoaiHinh(String loaiHinh) {
		this.loaiHinh = loaiHinh;
	}
	public Integer getSoLuongNguoi() {
		return soLuongNguoi;
	}
	public void setSoLuongNguoi(Integer soLuongNguoi) {
		this.soLuongNguoi = soLuongNguoi;
	}
	public Integer getSoLuongPhong() {
		return soLuongPhong;
	}
	public void setSoLuongPhong(Integer soLuongPhong) {
		this.soLuongPhong = soLuongPhong;
	}
	public Integer getTraTruoc() {
		return traTruoc;
	}
	public void setTraTruoc(Integer traTruoc) {
		this.traTruoc = traTruoc;
	}
	public String getGhiChu() {
		return ghiChu;
	}
	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
    
    
}
