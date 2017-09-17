package com.donglam.webhoconline.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tinnhan")
public class TinNhan {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "matn", nullable = false)
	private int matn;

	@Column(name = "tieude", nullable = false)
	private String tieude;

	@Column(name = "tggui", nullable = false)
	private Date tggui;

	@Column(name = "noidung", nullable = false)
	private String noidung;

	public TinNhan() {
	}

	public TinNhan(int matn, String tieude, Date tggui, String noidung) {
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
