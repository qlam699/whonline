package com.donglam.webhoconline.model;

import java.util.Date;

public class KhoaHocDto {

	private String makh;

	private String tenkh;

	private String makhoa;

	private String maloaikh;

	private Date giobd;

	private Date giokt;

	private Date tgbdhoc;

	private Date tgkthoc;

	private Date tgbddk;

	private Date tgktdk;

	private double hocphi;

	private String mota;
	
	private String hinh;

	private boolean daduyet;

	public KhoaHocDto() {
	}

	public KhoaHocDto(String makh, String tenkh, String makhoa, String maloaikh, Date giobd, Date giokt, Date tgbdhoc,
			Date tgkthoc, Date tgbddk, Date tgktdk, double hocphi, String mota, String hinh, boolean daduyet) {
		super();
		this.makh = makh;
		this.tenkh = tenkh;
		this.makhoa = makhoa;
		this.maloaikh = maloaikh;
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

	public String getMakhoa() {
		return makhoa;
	}

	public void setMakhoa(String makhoa) {
		this.makhoa = makhoa;
	}

	public String getMaloaikh() {
		return maloaikh;
	}

	public void setMaloaikh(String maloaikh) {
		this.maloaikh = maloaikh;
	}

	public Date getGiobd() {
		return giobd;
	}

	public void setGiobd(Date giobd) {
		this.giobd = giobd;
	}

	public Date getGiokt() {
		return giokt;
	}

	public void setGiokt(Date giokt) {
		this.giokt = giokt;
	}

	public Date getTgbdhoc() {
		return tgbdhoc;
	}

	public void setTgbdhoc(Date tgbdhoc) {
		this.tgbdhoc = tgbdhoc;
	}

	public Date getTgkthoc() {
		return tgkthoc;
	}

	public void setTgkthoc(Date tgkthoc) {
		this.tgkthoc = tgkthoc;
	}

	public Date getTgbddk() {
		return tgbddk;
	}

	public void setTgbddk(Date tgbddk) {
		this.tgbddk = tgbddk;
	}

	public Date getTgktdk() {
		return tgktdk;
	}

	public void setTgktdk(Date tgktdk) {
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
