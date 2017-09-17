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

	@Column(name = "tenbai", nullable = false)
	private String tenbai;

	@Column(name = "machuong", nullable = false)
	private String machuong;

	@Column(name = "noidung", nullable = false)
	private String noidung;

	public Bai() {
	}

	public Bai(String mabai, String tenbai, String machuong, String noidung) {
		super();
		this.mabai = mabai;
		this.tenbai = tenbai;
		this.machuong = machuong;
		this.noidung = noidung;
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

}