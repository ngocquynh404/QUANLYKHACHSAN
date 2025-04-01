package Model;

public class phieuphatsinh {
	private String maPPS;
    private String maPhong;
    private String lyDoPhatSinh;
    private Float tongChiPhi;
    private String ghiChu;
	public phieuphatsinh() {
		super();
	}
	public phieuphatsinh(String maPPS, String maPhong, String lyDoPhatSinh, Float tongChiPhi, String ghiChu) {
		super();
		this.maPPS = maPPS;
		this.maPhong = maPhong;
		this.lyDoPhatSinh = lyDoPhatSinh;
		this.tongChiPhi = tongChiPhi;
		this.ghiChu = ghiChu;
	}
	public String getMaPPS() {
		return maPPS;
	}
	public void setMaPPS(String maPPS) {
		this.maPPS = maPPS;
	}
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}
	public String getLyDoPhatSinh() {
		return lyDoPhatSinh;
	}
	public void setLyDoPhatSinh(String lyDoPhatSinh) {
		this.lyDoPhatSinh = lyDoPhatSinh;
	}
	public Float getTongChiPhi() {
		return tongChiPhi;
	}
	public void setTongChiPhi(Float tongChiPhi) {
		this.tongChiPhi = tongChiPhi;
	}
	public String getGhiChu() {
		return ghiChu;
	}
	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}
    
    
}
