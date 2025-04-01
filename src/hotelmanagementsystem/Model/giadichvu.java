package Model;

public class giadichvu {
	private String maGiaDV;
    private String maGiaThoiDiem;
    private String maDichVu;
    private Integer giaDichVu;
	public giadichvu() {
		super();
	}
	public giadichvu(String maGiaDV, String maGiaThoiDiem, String maDichVu, Integer giaDichVu) {
		super();
		this.maGiaDV = maGiaDV;
		this.maGiaThoiDiem = maGiaThoiDiem;
		this.maDichVu = maDichVu;
		this.giaDichVu = giaDichVu;
	}
	public String getMaGiaDV() {
		return maGiaDV;
	}
	public void setMaGiaDV(String maGiaDV) {
		this.maGiaDV = maGiaDV;
	}
	public String getMaGiaThoiDiem() {
		return maGiaThoiDiem;
	}
	public void setMaGiaThoiDiem(String maGiaThoiDiem) {
		this.maGiaThoiDiem = maGiaThoiDiem;
	}
	public String getMaDichVu() {
		return maDichVu;
	}
	public void setMaDichVu(String maDichVu) {
		this.maDichVu = maDichVu;
	}
	public Integer getGiaDichVu() {
		return giaDichVu;
	}
	public void setGiaDichVu(Integer giaDichVu) {
		this.giaDichVu = giaDichVu;
	}
    
    
}
