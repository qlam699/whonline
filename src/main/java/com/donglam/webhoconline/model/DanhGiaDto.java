package com.donglam.webhoconline.model;

public class DanhGiaDto {

	private DanhGiaId danhgiaid;
	
	private double sao;

	private String noidung;

	public DanhGiaDto() {
	}

	public DanhGiaDto(DanhGiaId danhgiaid, double sao, String noidung) {
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
