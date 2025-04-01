package Model;

public class chitietphieudatphong {
	private String maCTPDP;
    private String maPDP;
    private String maPhong;
    private Integer nguoiLon;
    private Integer treEm;
    private String ghiChu;
	public chitietphieudatphong() {
		super();
	}
	public chitietphieudatphong(String maCTPDP, String maPDP, String maPhong, Integer nguoiLon, Integer treEm,
			String ghiChu) {
		super();
		this.maCTPDP = maCTPDP;
		this.maPDP = maPDP;
		this.maPhong = maPhong;
		this.nguoiLon = nguoiLon;
		this.treEm = treEm;
		this.ghiChu = ghiChu;
	}
	public String getMaCTPDP() {
		return maCTPDP;
	}
	public void setMaCTPDP(String maCTPDP) {
		this.maCTPDP = maCTPDP;
	}
	public String getMaPDP() {
		return maPDP;
	}
	public void setMaPDP(String maPDP) {
		this.maPDP = maPDP;
	}
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}
	public Integer getNguoiLon() {
		return nguoiLon;
	}
	public void setNguoiLon(Integer nguoiLon) {
		this.nguoiLon = nguoiLon;
	}
	public Integer getTreEm() {
		return treEm;
	}
	public void setTreEm(Integer treEm) {
		this.treEm = treEm;
	}
	public String getGhiChu() {
		return ghiChu;
	}
	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}
    
    
}
