package Model;

public class loaisanpham {
	private String maLoaiSP;
    private String tenLoaiSanPham;
	public loaisanpham() {
		super();
	}
	public loaisanpham(String maLoaiSP, String tenLoaiSanPham) {
		super();
		this.maLoaiSP = maLoaiSP;
		this.tenLoaiSanPham = tenLoaiSanPham;
	}
	public String getMaLoaiSP() {
		return maLoaiSP;
	}
	public void setMaLoaiSP(String maLoaiSP) {
		this.maLoaiSP = maLoaiSP;
	}
	public String getTenLoaiSanPham() {
		return tenLoaiSanPham;
	}
	public void setTenLoaiSanPham(String tenLoaiSanPham) {
		this.tenLoaiSanPham = tenLoaiSanPham;
	}
    
    
}
