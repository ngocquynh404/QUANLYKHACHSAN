package Model;

import java.util.Date;

public class phieutichdiem {
	private String maPTD;
    private Date ngayLapPhieu;
    private String MaHV;
    private String maQD;
    private Integer bienDongDiem;
    private String nguyenNhan;
	public phieutichdiem() {
		super();
	}
	public phieutichdiem(String maPTD, Date ngayLapPhieu, String MaHV, String maQD, Integer bienDongDiem,
			String nguyenNhan) {
		super();
		this.maPTD = maPTD;
		this.ngayLapPhieu = ngayLapPhieu;
		this.MaHV = MaHV;
		this.maQD = maQD;
		this.bienDongDiem = bienDongDiem;
		this.nguyenNhan = nguyenNhan;
	}
	public String getMaPTD() {
		return maPTD;
	}
	public void setMaPTD(String maPTD) {
		this.maPTD = maPTD;
	}
	public Date getNgayLapPhieu() {
		return ngayLapPhieu;
	}
	public void setNgayLapPhieu(Date ngayLapPhieu) {
		this.ngayLapPhieu = ngayLapPhieu;
	}
	public String getMaHV() {
		return MaHV;
	}
	public void setMaHV(String MaHV) {
		this.MaHV = MaHV;
	}
	public String getMaQD() {
		return maQD;
	}
	public void setMaQD(String maQD) {
		this.maQD = maQD;
	}
	public Integer getBienDongDiem() {
		return bienDongDiem;
	}
	public void setBienDongDiem(Integer bienDongDiem) {
		this.bienDongDiem = bienDongDiem;
	}
	public String getNguyenNhan() {
		return nguyenNhan;
	}
	public void setNguyenNhan(String nguyenNhan) {
		this.nguyenNhan = nguyenNhan;
	}
    
    
    
}
