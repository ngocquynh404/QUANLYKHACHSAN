package Model;

public class thietbi {
	private String maThietBi;
    private String maLoaiThietBi;
    private String tenThietBi;
    private int giaThietBi;
    private String trangThai;
	public thietbi() {
		super();
	}
	public thietbi(String maThietBi, String maLoaiThietBi, String tenThietBi, int giaThietBi, String trangThai) {
		super();
		this.maThietBi = maThietBi;
		this.maLoaiThietBi = maLoaiThietBi;
		this.tenThietBi = tenThietBi;
		this.giaThietBi = giaThietBi;
		this.trangThai = trangThai;
	}
	public String getMaThietBi() {
		return maThietBi;
	}
	public void setMaThietBi(String maThietBi) {
		this.maThietBi = maThietBi;
	}
	public String getMaLoaiThietBi() {
		return maLoaiThietBi;
	}
	public void setMaLoaiThietBi(String maLoaiThietBi) {
		this.maLoaiThietBi = maLoaiThietBi;
	}
	public String getTenThietBi() {
		return tenThietBi;
	}
	public void setTenThietBi(String tenThietBi) {
		this.tenThietBi = tenThietBi;
	}
	public int getGiaThietBi() {
		return giaThietBi;
	}
	public void setGiaThietBi(int giaThietBi) {
		this.giaThietBi = giaThietBi;
	}
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
    
    
}
