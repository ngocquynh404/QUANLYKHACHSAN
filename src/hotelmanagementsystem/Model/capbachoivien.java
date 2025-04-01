package Model;

public class capbachoivien {
	private String maCapBac;
    private String hang;
    private Integer soDiemToiThieu;
    private Integer KhuyenMai;
	public capbachoivien() {
		super();
	}
	
	public capbachoivien(String maCapBac, String hang, Integer soDiemToiThieu, Integer khuyenMai) {
		super();
		this.maCapBac = maCapBac;
		this.hang = hang;
		this.soDiemToiThieu = soDiemToiThieu;
		this.KhuyenMai = khuyenMai;
	}

	public String getMaCapBac() {
		return maCapBac;
	}
	public void setMaCapBac(String maCapBac) {
		this.maCapBac = maCapBac;
	}
	public String getHang() {
		return hang;
	}
	public void setHang(String hang) {
		this.hang = hang;
	}
	public Integer getSoDiemToiThieu() {
		return soDiemToiThieu;
	}
	public void setSoDiemToiThieu(Integer soDiemToiThieu) {
		this.soDiemToiThieu = soDiemToiThieu;
	}

	public Integer getKhuyenMai() {
		return KhuyenMai;
	}

	public void setKhuyenMai(Integer khuyenMai) {
		KhuyenMai = khuyenMai;
	}
    
    
}
