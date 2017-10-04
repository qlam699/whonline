package com.donglam.webhoconline.model;

public class ThaoLuanDto {
	
	private KhoaHoc khoahoc;
	
	private ThaoLuanId thaoluanid;

	private String noidung;

	private String matl;

	public ThaoLuanDto() {
	}

	public ThaoLuanDto(KhoaHoc khoahoc, ThaoLuanId thaoluanid, String noidung, String matl) {
		super();
		this.khoahoc = khoahoc;
		this.thaoluanid = thaoluanid;
		this.noidung = noidung;
		this.matl = matl;
	}

	public KhoaHoc getKhoahoc() {
		return khoahoc;
	}

	public void setKhoahoc(KhoaHoc khoahoc) {
		this.khoahoc = khoahoc;
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

	public String getMatl() {
		return matl;
	}

	public void setMatl(String matl) {
		this.matl = matl;
	}

}
