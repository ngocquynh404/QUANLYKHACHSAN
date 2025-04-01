package Model;

public class hoivien {
	private String maHV;
    private String maKH;
    private Integer tongDiem;
    private String maCapBac;
    private Integer phanTramKhuyenMai;
    private boolean isXoa;
	public hoivien() {
		super();
	}
	
	public hoivien(String maHV, String maKH, Integer tongDiem, String maCapBac, Integer phanTramKhuyenMai,
			boolean isXoa) {
		super();
		this.maHV = maHV;
		this.maKH = maKH;
		this.tongDiem = tongDiem;
		this.maCapBac = maCapBac;
		this.isXoa = isXoa;
	}

	public String getMaHV() {
		return maHV;
	}
	public void setMaHV(String maHV) {
		this.maHV = maHV;
	}
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public Integer getTongDiem() {
		return tongDiem;
	}
	public void setTongDiem(Integer tongDiem) {
		this.tongDiem = tongDiem;
	}
	public String getMaCapBac() {
		return maCapBac;
	}
	public void setMaCapBac(String maCapBac) {
		this.maCapBac = maCapBac;
	}
	public boolean isXoa() {
		return isXoa;
	}

	public void setXoa(boolean isXoa) {
		this.isXoa = isXoa;
	}
    
}
