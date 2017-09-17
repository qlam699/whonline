package com.donglam.webhoconline.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "khoahoc")
public class KhoaHoc {
	@Id
	@Column(name = "makh", nullable = false)
	private String makh;

	@Column(name = "tenkh", nullable = false)
	private String tenkh;

	@Column(name = "makhoa", nullable = false)
	private String makhoa;

	@Column(name = "maloaikh", nullable = false)
	private String maloaikh;

	@Column(name = "giobd", nullable = false)
	private Date giobd;

	@Column(name = "giokt", nullable = false)
	private Date giokt;

	@Column(name = "tgbdhoc", nullable = false)
	private Date tgbdhoc;

	@Column(name = "tgkthoc", nullable = false)
	private Date tgkthoc;

	@Column(name = "tgbddk", nullable = false)
	private Date tgbddk;

	@Column(name = "tgktdk", nullable = false)
	private Date tgktdk;

	@Column(name = "hocphi", nullable = false)
	private double hocphi;

	@Column(name = "mota", nullable = false)
	private String mota;

	@Column(name = "daduyet", nullable = false)
	private boolean daduyet;

	public KhoaHoc() {
	}

	public KhoaHoc(String makh, String tenkh, String makhoa, String maloaikh, Date giobd, Date giokt, Date tgbdhoc,
			Date tgkthoc, Date tgbddk, Date tgktdk, double hocphi, String mota, boolean daduyet) {
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

	public boolean isDaduyet() {
		return daduyet;
	}

	public void setDaduyet(boolean daduyet) {
		this.daduyet = daduyet;
	}

}
