package Model;

import java.util.Date;

public class phieudichvu {
	 private String maPDV;
    private Date ngayLapPhieu;
    private String maKH;
    private String ghiChu;
	public phieudichvu() {
		super();
	}
	public phieudichvu(String maPDV, Date ngayLapPhieu, String maKH, String ghiChu) {
		super();
		this.maPDV = maPDV;
		this.ngayLapPhieu = ngayLapPhieu;
		this.maKH = maKH;
		this.ghiChu = ghiChu;
	}
	public String getMaPDV() {
		return maPDV;
	}
	public void setMaPDV(String maPDV) {
		this.maPDV = maPDV;
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
