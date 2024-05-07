package Model;

public class dichvu {
	 private String maDichVu;
	    private String tenDichVu;
	    private String moTa;
	    private String donViTinh;
	    private String trangThai;
		public dichvu() {
			super();
		}
		public dichvu(String maDichVu, String tenDichVu, String moTa, String donViTinh, String trangThai) {
			super();
			this.maDichVu = maDichVu;
			this.tenDichVu = tenDichVu;
			this.moTa = moTa;
			this.donViTinh = donViTinh;
			this.trangThai = trangThai;
		}
		public String getMaDichVu() {
			return maDichVu;
		}
		public void setMaDichVu(String maDichVu) {
			this.maDichVu = maDichVu;
		}
		public String getTenDichVu() {
			return tenDichVu;
		}
		public void setTenDichVu(String tenDichVu) {
			this.tenDichVu = tenDichVu;
		}
		public String getMoTa() {
			return moTa;
		}
		public void setMoTa(String moTa) {
			this.moTa = moTa;
		}
		public String getDonViTinh() {
			return donViTinh;
		}
		public void setDonViTinh(String donViTinh) {
			this.donViTinh = donViTinh;
		}
		public String getTrangThai() {
			return trangThai;
		}
		public void setTrangThai(String trangThai) {
			this.trangThai = trangThai;
		}
	    
}
