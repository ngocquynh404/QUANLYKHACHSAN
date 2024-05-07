package Model;

public class phuthuthemnguoi {
	private String maPTThemNguoi;
    private String maGiaThoiDiem;
    private String maLoaiPhong;
    private Integer nguoiLon;
    private Integer treEm;
	public phuthuthemnguoi() {
		super();
	}
	public phuthuthemnguoi(String maPTThemNguoi, String maGiaThoiDiem, String maLoaiPhong, Integer nguoiLon,
			Integer treEm) {
		super();
		this.maPTThemNguoi = maPTThemNguoi;
		this.maGiaThoiDiem = maGiaThoiDiem;
		this.maLoaiPhong = maLoaiPhong;
		this.nguoiLon = nguoiLon;
		this.treEm = treEm;
	}
	public String getMaPTThemNguoi() {
		return maPTThemNguoi;
	}
	public void setMaPTThemNguoi(String maPTThemNguoi) {
		this.maPTThemNguoi = maPTThemNguoi;
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
       
}
