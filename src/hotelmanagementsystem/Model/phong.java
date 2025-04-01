package Model;

public class phong {
	private String maPhong;
    private String maLoaiPhong;
    private String maTang;
    private String trangThai;
	public phong() {
		super();
	}
	public phong(String maPhong, String maLoaiPhong, String maTang, String trangThai) {
		super();
		this.maPhong = maPhong;
		this.maLoaiPhong = maLoaiPhong;
		this.maTang = maTang;
		this.trangThai = trangThai;
	}
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}
	public String getMaLoaiPhong() {
		return maLoaiPhong;
	}
	public void setMaLoaiPhong(String maLoaiPhong) {
		this.maLoaiPhong = maLoaiPhong;
	}
	public String getMaTang() {
		return maTang;
	}
	public void setMaTang(String maTang) {
		this.maTang = maTang;
	}
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
    
    
}
