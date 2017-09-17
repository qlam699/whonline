package com.donglam.webhoconline.model;

import java.util.Date;

public class TinNhanDto {

	private int matn;

	private String tieude;

	private Date tggui;

	private String noidung;

	public TinNhanDto() {
	}

	public TinNhanDto(int matn, String tieude, Date tggui, String noidung) {
		super();
		this.matn = matn;
		this.tieude = tieude;
		this.tggui = tggui;
		this.noidung = noidung;
	}

	public int getMatn() {
		return matn;
	}

	public void setMatn(int matn) {
		this.matn = matn;
	}

	public String getTieude() {
		return tieude;
	}

	public void setTieude(String tieude) {
		this.tieude = tieude;
	}

	public Date getTggui() {
		return tggui;
	}

	public void setTggui(Date tggui) {
		this.tggui = tggui;
	}

	public String getNoidung() {
		return noidung;
	}

	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}

}