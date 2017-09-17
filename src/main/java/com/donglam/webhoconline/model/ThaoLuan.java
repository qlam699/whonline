package com.donglam.webhoconline.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "thaoluan")
public class ThaoLuan {
	@EmbeddedId
	private ThaoLuanId thaoluanid;

	@Column(name = "noidung", nullable = false)
	private String noidung;

	@Column(name = "makh", nullable = false)
	private String makh;

	public ThaoLuan() {
	}

	public ThaoLuan(ThaoLuanId thaoluanid, String noidung, String makh) {
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
