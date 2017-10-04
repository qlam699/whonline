package com.donglam.webhoconline.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "thaoluan")
public class ThaoLuan {
	
	@ManyToOne
    @JoinColumn(name="makh", nullable=false)
    private KhoaHoc khoahoc;
	
	@EmbeddedId
	private ThaoLuanId thaoluanid;

	@Column(name = "noidung", nullable = false)
	private String noidung;

	@Column(name = "matl", nullable = false)
	private int matl;

	public ThaoLuan() {
	}

	public ThaoLuan(KhoaHoc khoahoc, ThaoLuanId thaoluanid, String noidung, int matl) {
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

	public int getMatl() {
		return matl;
	}

	public void setMatl(int matl) {
		this.matl = matl;
	}

}
