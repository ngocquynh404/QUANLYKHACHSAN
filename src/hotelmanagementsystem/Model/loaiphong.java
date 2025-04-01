package Model;

public class loaiphong {
	private String maLoaiPhong;
    private String tenLoaiPhong;
    private Integer nguoiLon;
    private Integer treEm;
    private String ghiChu;
	public loaiphong() {
		super();
	}
	public loaiphong(String maLoaiPhong, String tenLoaiPhong, Integer nguoiLon, Integer treEm, String ghiChu) {
		super();
		this.maLoaiPhong = maLoaiPhong;
		this.tenLoaiPhong = tenLoaiPhong;
		this.nguoiLon = nguoiLon;
		this.treEm = treEm;
		this.ghiChu = ghiChu;
	}
	public String getMaLoaiPhong() {
		return maLoaiPhong;
	}
	public void setMaLoaiPhong(String maLoaiPhong) {
		this.maLoaiPhong = maLoaiPhong;
	}
	public String getTenLoaiPhong() {
		return tenLoaiPhong;
	}
	public void setTenLoaiPhong(String tenLoaiPhong) {
		this.tenLoaiPhong = tenLoaiPhong;
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
