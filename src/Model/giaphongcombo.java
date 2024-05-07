package Model;

public class giaphongcombo {
	private String maGiaPhongCB;
    private String maGiaThoiDiem;
    private String maPhong;
    private Integer Gio;
    private Integer giaPhong;
	public giaphongcombo() {
		super();
	}
	public giaphongcombo(String maGiaPhongCB, String maGiaThoiDiem, String maPhong, Integer gio, Integer giaPhong) {
		super();
		this.maGiaPhongCB = maGiaPhongCB;
		this.maGiaThoiDiem = maGiaThoiDiem;
		this.maPhong = maPhong;
		Gio = gio;
		this.giaPhong = giaPhong;
	}
	public String getMaGiaPhongCB() {
		return maGiaPhongCB;
	}
	public void setMaGiaPhongCB(String maGiaPhongCB) {
		this.maGiaPhongCB = maGiaPhongCB;
	}
	public String getMaGiaThoiDiem() {
		return maGiaThoiDiem;
	}
	public void setMaGiaThoiDiem(String maGiaThoiDiem) {
		this.maGiaThoiDiem = maGiaThoiDiem;
	}
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}
	public Integer getGio() {
		return Gio;
	}
	public void setGio(Integer gio) {
		Gio = gio;
	}
	public Integer getGiaPhong() {
		return giaPhong;
	}
	public void setGiaPhong(Integer giaPhong) {
		this.giaPhong = giaPhong;
	}
    
    
}
