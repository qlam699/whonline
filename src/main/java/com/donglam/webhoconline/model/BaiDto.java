package com.donglam.webhoconline.model;

public class BaiDto {

	private String mabai;

	private String tenbai;

	private String machuong;

	private String noidung;

	private boolean trangthai;

	public BaiDto() {
	}

	public BaiDto(String mabai, String tenbai, String machuong, String noidung, boolean trangthai) {
		super();
		this.mabai = mabai;
		this.tenbai = tenbai;
		this.machuong = machuong;
		this.noidung = noidung;
		this.trangthai = trangthai;
	}

	public String getMabai() {
		return mabai;
	}

	public void setMabai(String mabai) {
		this.mabai = mabai;
	}

	public String getTenbai() {
		return tenbai;
	}

	public void setTenbai(String tenbai) {
		this.tenbai = tenbai;
	}

	public String getMachuong() {
		return machuong;
	}

	public void setMachuong(String machuong) {
		this.machuong = machuong;
	}

	public String getNoidung() {
		return noidung;
	}

	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}

	public boolean isTrangthai() {
		return trangthai;
	}

	public void setTrangthai(boolean trangthai) {
		this.trangthai = trangthai;
	}

}
