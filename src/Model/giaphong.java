package Model;

public class giaphong {
	private String maGiaPhong;
    private String maGiaThoiDiem;
    private String maLoaiPhong;
    private Integer giaNgay;
    private Integer giaQuaDem;
    private Integer giaTheoGio;
    private Integer giaTuan;
    private Integer giaThang;
	public giaphong() {
		super();
	}
	public giaphong(String maGiaPhong, String maGiaThoiDiem, String maLoaiPhong, Integer giaNgay, Integer giaQuaDem,
			Integer giaTheoGio, Integer giaTuan, Integer giaThang) {
		super();
		this.maGiaPhong = maGiaPhong;
		this.maGiaThoiDiem = maGiaThoiDiem;
		this.maLoaiPhong = maLoaiPhong;
		this.giaNgay = giaNgay;
		this.giaQuaDem = giaQuaDem;
		this.giaTheoGio = giaTheoGio;
		this.giaTuan = giaTuan;
		this.giaThang = giaThang;
	}
	public String getMaGiaPhong() {
		return maGiaPhong;
	}
	public void setMaGiaPhong(String maGiaPhong) {
		this.maGiaPhong = maGiaPhong;
	}
	public String getMaGiaThoiDiem() {
		return maGiaThoiDiem;
	}
	public void setMaGiaThoiDiem(String maGiaThoiDiem) {
		this.maGiaThoiDiem = maGiaThoiDiem;
	}
	public String getMaLoaiPhong() {
		return maLoaiPhong;
	}
	public void setMaLoaiPhong(String maLoaiPhong) {
		this.maLoaiPhong = maLoaiPhong;
	}
	public Integer getGiaNgay() {
		return giaNgay;
	}
	public void setGiaNgay(Integer giaNgay) {
		this.giaNgay = giaNgay;
	}
	public Integer getGiaQuaDem() {
		return giaQuaDem;
	}
	public void setGiaQuaDem(Integer giaQuaDem) {
		this.giaQuaDem = giaQuaDem;
	}
	public Integer getGiaTheoGio() {
		return giaTheoGio;
	}
	public void setGiaTheoGio(Integer giaTheoGio) {
		this.giaTheoGio = giaTheoGio;
	}
	public Integer getGiaTuan() {
		return giaTuan;
	}
	public void setGiaTuan(Integer giaTuan) {
		this.giaTuan = giaTuan;
	}
	public Integer getGiaThang() {
		return giaThang;
	}
	public void setGiaThang(Integer giaThang) {
		this.giaThang = giaThang;
	}
    
    
}
