package Model;

public class phutroicheckinsom {
	private String maPTCheckinSom;
    private String maGiaThoiDiem;
    private String maLoaiPhong;
    private Integer gio;
    private Integer phanTramTheoGiaPhong;
	public phutroicheckinsom() {
		super();
	}
	public phutroicheckinsom(String maPTCheckinSom, String maGiaThoiDiem, String maLoaiPhong, Integer gio,
			Integer phanTramTheoGiaPhong) {
		super();
		this.maPTCheckinSom = maPTCheckinSom;
		this.maGiaThoiDiem = maGiaThoiDiem;
		this.maLoaiPhong = maLoaiPhong;
		this.gio = gio;
		this.phanTramTheoGiaPhong = phanTramTheoGiaPhong;
	}
	public String getMaPTCheckinSom() {
		return maPTCheckinSom;
	}
	public void setMaPTCheckinSom(String maPTCheckinSom) {
		this.maPTCheckinSom = maPTCheckinSom;
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
	public Integer getGio() {
		return gio;
	}
	public void setGio(Integer gio) {
		this.gio = gio;
	}
	public Integer getPhanTramTheoGiaPhong() {
		return phanTramTheoGiaPhong;
	}
	public void setPhanTramTheoGiaPhong(Integer phanTramTheoGiaPhong) {
		this.phanTramTheoGiaPhong = phanTramTheoGiaPhong;
	}
    
    
    
}
