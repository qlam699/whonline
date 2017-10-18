package com.donglam.webhoconline.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "danhgia")
public class DanhGia {
	
	@EmbeddedId
	private DanhGiaId danhgiaid;

	@Column(name = "sao", nullable = true)
	private double sao;

	@Column(name = "noidung", nullable = true)
	private String noidung;

	public DanhGia() {
	}

	public DanhGia(DanhGiaId danhgiaid, double sao, String noidung) {
		super();
		this.danhgiaid = danhgiaid;
		this.sao = sao;
		this.noidung = noidung;
	}

	public DanhGiaId getDanhgiaid() {
		return danhgiaid;
	}

	public void setDanhgiaid(DanhGiaId danhgiaid) {
		this.danhgiaid = danhgiaid;
	}

	public double getSao() {
		return sao;
	}

	public void setSao(double sao) {
		this.sao = sao;
	}

	public String getNoidung() {
		return noidung;
	}

	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}

}
