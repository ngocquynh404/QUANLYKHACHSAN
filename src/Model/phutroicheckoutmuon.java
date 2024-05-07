package Model;

public class phutroicheckoutmuon {
	private String maPTCheckoutMuon;
    private String maGiaThoiDiem;
    private String maLoaiPhong;
    private Integer gio;
    private Integer phanTramTheoGiaPhong;
	public phutroicheckoutmuon() {
		super();
	}
	public phutroicheckoutmuon(String maPTCheckoutMuon, String maGiaThoiDiem, String maLoaiPhong, Integer gio,
			Integer phanTramTheoGiaPhong) {
		super();
		this.maPTCheckoutMuon = maPTCheckoutMuon;
		this.maGiaThoiDiem = maGiaThoiDiem;
		this.maLoaiPhong = maLoaiPhong;
		this.gio = gio;
		this.phanTramTheoGiaPhong = phanTramTheoGiaPhong;
	}
	public String getmaPTCheckoutMuon() {
		return maPTCheckoutMuon;
	}
	public void setmaPTCheckoutMuon(String maPTCheckoutMuon) {
		this.maPTCheckoutMuon = maPTCheckoutMuon;
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
