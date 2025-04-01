package Model;

import java.util.Date;

public class checkinout {
	private String maCTPDP;
    private Date thoiGianCheckin;
    private Date thoiGianCheckout;
	public checkinout() {
		super();
	}
	public checkinout(String maCTPDP, Date thoiGianCheckin, Date thoiGianCheckout) {
		super();
		this.maCTPDP = maCTPDP;
		this.thoiGianCheckin = thoiGianCheckin;
		this.thoiGianCheckout = thoiGianCheckout;
	}
	public String getMaCTPDP() {
		return maCTPDP;
	}
	public void setMaCTPDP(String maCTPDP) {
		this.maCTPDP = maCTPDP;
	}
	public Date getThoiGianCheckin() {
		return thoiGianCheckin;
	}
	public void setThoiGianCheckin(Date thoiGianCheckin) {
		this.thoiGianCheckin = thoiGianCheckin;
	}
	public Date getThoiGianCheckout() {
		return thoiGianCheckout;
	}
	public void setThoiGianCheckout(Date thoiGianCheckout) {
		this.thoiGianCheckout = thoiGianCheckout;
	}
    
    
}
