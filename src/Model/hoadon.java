package Model;

import java.util.Date;

public class hoadon {
	private String maHD;
    private Date ngayLap;
    private String maPDK;
    private Integer tongTien;
    private String trangThai;
    private String ghiChu;
	public hoadon() {
		super();
	}
	public hoadon(String maHD, Date ngayLap, String maPDK, Integer tongTien, String trangThai, String ghiChu) {
		super();
		this.maHD = maHD;
		this.ngayLap = ngayLap;
		this.maPDK = maPDK;
		this.tongTien = tongTien;
		this.trangThai = trangThai;
		this.ghiChu = ghiChu;
	}
	public String getMaHD() {
		return maHD;
	}
	public void setMaHD(String maHD) {
		this.maHD = maHD;
	}
	public Date getNgayLap() {
		return ngayLap;
	}
	public void setNgayLap(Date ngayLap) {
		this.ngayLap = ngayLap;
	}
	public String getMaPDK() {
		return maPDK;
	}
	public void setMaPDK(String maPDK) {
		this.maPDK = maPDK;
	}
	public Integer getTongTien() {
		return tongTien;
	}
	public void setTongTien(Integer tongTien) {
		this.tongTien = tongTien;
	}
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	public String getGhiChu() {
		return ghiChu;
	}
	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}
    
	    
}
