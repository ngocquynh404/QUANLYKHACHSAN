package Model;

public class sanpham {
	private String maSP;
    private String tenSP;
    private String maLoaiSP;
    private String donViTinh;
    private Integer giaNhap;
    private Integer giaBan;
    private String trangThai;
	public sanpham() {
		super();
	}
	public sanpham(String maSP, String tenSP, String maLoaiSP, String donViTinh, Integer giaNhap, Integer giaBan,
			String trangThai) {
		super();
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.maLoaiSP = maLoaiSP;
		this.donViTinh = donViTinh;
		this.giaNhap = giaNhap;
		this.giaBan = giaBan;
		this.trangThai = trangThai;
	}
	public String getMaSP() {
		return maSP;
	}
	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public String getMaLoaiSP() {
		return maLoaiSP;
	}
	public void setMaLoaiSP(String maLoaiSP) {
		this.maLoaiSP = maLoaiSP;
	}
	public String getDonViTinh() {
		return donViTinh;
	}
	public void setDonViTinh(String donViTinh) {
		this.donViTinh = donViTinh;
	}
	public Integer getGiaNhap() {
		return giaNhap;
	}
	public void setGiaNhap(Integer giaNhap) {
		this.giaNhap = giaNhap;
	}
	public Integer getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(Integer giaBan) {
		this.giaBan = giaBan;
	}
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
    
    
}
