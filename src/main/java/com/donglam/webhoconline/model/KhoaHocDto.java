package com.donglam.webhoconline.model;

import java.util.List;

public class KhoaHocDto {
	
	private List<ThaoLuan> thaoluans;
	
	private LoaiKhoaHoc loaikhoahoc;

	private String makh;

	private String tenkh;

	private String giobd;

	private String giokt;

	private String tgbdhoc;

	private String tgkthoc;

	private String tgbddk;

	private String tgktdk;

	private double hocphi;

	private String mota;
	
	private String hinh;

	private boolean daduyet;

	public KhoaHocDto() {
	}

	public KhoaHocDto(List<ThaoLuan> thaoluans, LoaiKhoaHoc loaikhoahoc, String makh, String tenkh, String giobd,
			String giokt, String tgbdhoc, String tgkthoc, String tgbddk, String tgktdk, double hocphi, String mota,
			String hinh, boolean daduyet) {
		super();
		this.thaoluans = thaoluans;
		this.loaikhoahoc = loaikhoahoc;
		this.makh = makh;
		this.tenkh = tenkh;
		this.giobd = giobd;
		this.giokt = giokt;
		this.tgbdhoc = tgbdhoc;
		this.tgkthoc = tgkthoc;
		this.tgbddk = tgbddk;
		this.tgktdk = tgktdk;
		this.hocphi = hocphi;
		this.mota = mota;
		this.hinh = hinh;
		this.daduyet = daduyet;
	}

	public List<ThaoLuan> getThaoluans() {
		return thaoluans;
	}

	public void setThaoluans(List<ThaoLuan> thaoluans) {
		this.thaoluans = thaoluans;
	}

	public LoaiKhoaHoc getLoaikhoahoc() {
		return loaikhoahoc;
	}

	public void setLoaikhoahoc(LoaiKhoaHoc loaikhoahoc) {
		this.loaikhoahoc = loaikhoahoc;
	}

	public String getMakh() {
		return makh;
	}

	public void setMakh(String makh) {
		this.makh = makh;
	}

	public String getTenkh() {
		return tenkh;
	}

	public void setTenkh(String tenkh) {
		this.tenkh = tenkh;
	}

	public String getGiobd() {
		return giobd;
	}

	public void setGiobd(String giobd) {
		this.giobd = giobd;
	}

	public String getGiokt() {
		return giokt;
	}

	public void setGiokt(String giokt) {
		this.giokt = giokt;
	}

	public String getTgbdhoc() {
		return tgbdhoc;
	}

	public void setTgbdhoc(String tgbdhoc) {
		this.tgbdhoc = tgbdhoc;
	}

	public String getTgkthoc() {
		return tgkthoc;
	}

	public void setTgkthoc(String tgkthoc) {
		this.tgkthoc = tgkthoc;
	}

	public String getTgbddk() {
		return tgbddk;
	}

	public void setTgbddk(String tgbddk) {
		this.tgbddk = tgbddk;
	}

	public String getTgktdk() {
		return tgktdk;
	}

	public void setTgktdk(String tgktdk) {
		this.tgktdk = tgktdk;
	}

	public double getHocphi() {
		return hocphi;
	}

	public void setHocphi(double hocphi) {
		this.hocphi = hocphi;
	}

	public String getMota() {
		return mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

	public String getHinh() {
		return hinh;
	}

	public void setHinh(String hinh) {
		this.hinh = hinh;
	}

	public boolean isDaduyet() {
		return daduyet;
	}

	public void setDaduyet(boolean daduyet) {
		this.daduyet = daduyet;
	}

}
