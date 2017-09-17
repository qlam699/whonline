package com.donglam.webhoconline.model;

public class ThaoLuanDto {
	private ThaoLuanId thaoluanid;

	private String noidung;

	private String makh;

	public ThaoLuanDto() {
	}

	public ThaoLuanDto(ThaoLuanId thaoluanid, String noidung, String makh) {
		super();
		this.thaoluanid = thaoluanid;
		this.noidung = noidung;
		this.makh = makh;
	}

	public ThaoLuanId getThaoluanid() {
		return thaoluanid;
	}

	public void setThaoluanid(ThaoLuanId thaoluanid) {
		this.thaoluanid = thaoluanid;
	}

	public String getNoidung() {
		return noidung;
	}

	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}

	public String getMakh() {
		return makh;
	}

	public void setMakh(String makh) {
		this.makh = makh;
	}

}
