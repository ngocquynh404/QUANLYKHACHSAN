package Model;

import java.util.Date;

public class khachhang {
	private String maKH;
    private String hoVaTen;
    private String gioiTinh;
    private String sdt;
    private byte[] cccd;
    private String quocTich;
    private Date ngaySinh;
    private boolean isXoa;
	public khachhang() {
		super();
	}
	public khachhang(String maKH, String hoVaTen, String gioiTinh, String sdt, byte[] cccd, String quocTich,
			Date ngaySinh, boolean isXoa) {
		super();
		this.maKH = maKH;
		this.hoVaTen = hoVaTen;
		this.gioiTinh = gioiTinh;
		this.sdt = sdt;
		this.cccd = cccd;
		this.quocTich = quocTich;
		this.ngaySinh = ngaySinh;
		this.isXoa = isXoa;
	}
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public byte[] getCccd() {
		return cccd;
	}
	public void setCccd(byte[] cccd) {
		this.cccd = cccd;
	}
	public String getQuocTich() {
		return quocTich;
	}
	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public boolean isXoa() {
		return isXoa;
	}
	public void setXoa(boolean isXoa) {
		this.isXoa = isXoa;
	}
    
    

}
