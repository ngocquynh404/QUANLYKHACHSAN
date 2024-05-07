package Model;

import java.util.Date;

public class giathoidiem {
	 private String maGiaThoiDiem;
	 private Date ngayApDung;
	 private Date ngayKetThuc;
     private String moTa;
	public giathoidiem() {
		super();
	}
	public giathoidiem(String maGiaThoiDiem, Date ngayApDung, Date ngayKetThuc, String moTa) {
		super();
		this.maGiaThoiDiem = maGiaThoiDiem;
		this.ngayApDung = ngayApDung;
		this.ngayKetThuc = ngayKetThuc;
		this.moTa = moTa;
	}
	public String getMaGiaThoiDiem() {
		return maGiaThoiDiem;
	}
	public void setMaGiaThoiDiem(String maGiaThoiDiem) {
		this.maGiaThoiDiem = maGiaThoiDiem;
	}
	public Date getNgayApDung() {
		return ngayApDung;
	}
	public void setNgayApDung(Date ngayApDung) {
		this.ngayApDung = ngayApDung;
	}
	public Date getNgayKetThuc() {
		return ngayKetThuc;
	}
	public void setNgayKetThuc(Date ngayKetThuc) {
		this.ngayKetThuc = ngayKetThuc;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
     
     
}
