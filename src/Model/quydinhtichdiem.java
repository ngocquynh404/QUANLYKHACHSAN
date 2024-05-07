package Model;

public class quydinhtichdiem {
	private String maQD;
    private String kieuTichDiem;
    private Integer tyLeTichDiem;
    private Integer nguongTien;
    private Integer soDiemTuongUng;
	
    public quydinhtichdiem() {
		super();
	}

	public quydinhtichdiem(String maQD, String kieuTichDiem, Integer tyLeTichDiem, Integer nguongTien,
			Integer soDiemTuongUng) {
		super();
		this.maQD = maQD;
		this.kieuTichDiem = kieuTichDiem;
		this.tyLeTichDiem = tyLeTichDiem;
		this.nguongTien = nguongTien;
		this.soDiemTuongUng = soDiemTuongUng;
	}

	public String getMaQD() {
		return maQD;
	}

	public void setMaQD(String maQD) {
		this.maQD = maQD;
	}

	public String getKieuTichDiem() {
		return kieuTichDiem;
	}

	public void setKieuTichDiem(String kieuTichDiem) {
		this.kieuTichDiem = kieuTichDiem;
	}

	public Integer getTyLeTichDiem() {
		return tyLeTichDiem;
	}

	public void setTyLeTichDiem(Integer tyLeTichDiem) {
		this.tyLeTichDiem = tyLeTichDiem;
	}

	public Integer getNguongTien() {
		return nguongTien;
	}

	public void setNguongTien(Integer nguongTien) {
		this.nguongTien = nguongTien;
	}

	public Integer getSoDiemTuongUng() {
		return soDiemTuongUng;
	}

	public void setSoDiemTuongUng(Integer soDiemTuongUng) {
		this.soDiemTuongUng = soDiemTuongUng;
	}
    
    
}
