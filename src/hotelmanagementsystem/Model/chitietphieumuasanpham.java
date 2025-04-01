package Model;

public class chitietphieumuasanpham {
	private String maCTPMSP;
    private String maPMSP;
    private String maPhong;
    private String maSanPham;
    private Integer soLuong;
	public chitietphieumuasanpham() {
		super();
	}
	public chitietphieumuasanpham(String maCTPMSP, String maPMSP, String maPhong, String maSanPham, Integer soLuong) {
		super();
		this.maCTPMSP = maCTPMSP;
		this.maPMSP = maPMSP;
		this.maPhong = maPhong;
		this.maSanPham = maSanPham;
		this.soLuong = soLuong;
	}
	public String getMaCTPMSP() {
		return maCTPMSP;
	}
	public void setMaCTPMSP(String maCTPMSP) {
		this.maCTPMSP = maCTPMSP;
	}
	public String getMaPMSP() {
		return maPMSP;
	}
	public void setMaPMSP(String maPMSP) {
		this.maPMSP = maPMSP;
	}
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}
	public String getMaSanPham() {
		return maSanPham;
	}
	public void setMaSanPham(String maSanPham) {
		this.maSanPham = maSanPham;
	}
	public Integer getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(Integer soLuong) {
		this.soLuong = soLuong;
	}
    
    
}
