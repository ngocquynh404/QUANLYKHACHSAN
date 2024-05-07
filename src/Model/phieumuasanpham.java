package Model;

import java.util.Date;

public class phieumuasanpham {
	private String maPMSP;
    private Date ngayLapPhieu;
    private String maKH;
    private String ghiChu;
	public phieumuasanpham() {
		super();
	}
	public phieumuasanpham(String maPMSP, Date ngayLapPhieu, String maKH, String ghiChu) {
		super();
		this.maPMSP = maPMSP;
		this.ngayLapPhieu = ngayLapPhieu;
		this.maKH = maKH;
		this.ghiChu = ghiChu;
	}
	public String getMaPMSP() {
		return maPMSP;
	}
	public void setMaPMSP(String maPMSP) {
		this.maPMSP = maPMSP;
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
	public String getGhiChu() {
		return ghiChu;
	}
	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}
    
}
