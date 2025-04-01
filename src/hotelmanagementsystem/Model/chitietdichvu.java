package Model;

import java.util.Date;

public class chitietdichvu {
	private String maCTPDV;
    private String maPDV;
    private String maPhong;
    private Date ngaySuDung;
    private String maDichVu;
    private Integer soLuong;
	public chitietdichvu() {
		super();
	}
	public chitietdichvu(String maCTPDV, String maPDV, String maPhong, Date ngaySuDung, String maDichVu,
			Integer soLuong) {
		super();
		this.maCTPDV = maCTPDV;
		this.maPDV = maPDV;
		this.maPhong = maPhong;
		this.ngaySuDung = ngaySuDung;
		this.maDichVu = maDichVu;
		this.soLuong = soLuong;
	}
	public String getMaCTPDV() {
		return maCTPDV;
	}
	public void setMaCTPDV(String maCTPDV) {
		this.maCTPDV = maCTPDV;
	}
	public String getMaPDV() {
		return maPDV;
	}
	public void setMaPDV(String maPDV) {
		this.maPDV = maPDV;
	}
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}
	public Date getNgaySuDung() {
		return ngaySuDung;
	}
	public void setNgaySuDung(Date ngaySuDung) {
		this.ngaySuDung = ngaySuDung;
	}
	public String getMaDichVu() {
		return maDichVu;
	}
	public void setMaDichVu(String maDichVu) {
		this.maDichVu = maDichVu;
	}
	public Integer getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(Integer soLuong) {
		this.soLuong = soLuong;
	}
   
    
}
