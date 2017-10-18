package com.donglam.webhoconline.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bai")
public class Bai {
	@Id
	@Column(name = "mabai", nullable = false)
	private String mabai;

	@Column(name = "tenbai", nullable = true)
	private String tenbai;

	@Column(name = "machuong", nullable = false)
	private String machuong;

	@Column(name = "noidung", nullable = true)
	private String noidung;

	@Column(name = "trangthai", nullable = true)
	private boolean trangthai;

	public Bai() {
	}

	public Bai(String mabai, String tenbai, String machuong, String noidung, boolean trangthai) {
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
