package com.donglam.webhoconline.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "chuong")
public class Chuong {
	@Id
	@Column(name = "machuong", nullable = false)
	private String machuong;

	@Column(name = "tenchuong", nullable = true)
	private String tenchuong;

	@Column(name = "magt", nullable = false)
	private String magt;

	public Chuong() {
	}

	public Chuong(String machuong, String tenchuong, String magt) {
		super();
		this.machuong = machuong;
		this.tenchuong = tenchuong;
		this.magt = magt;
	}

	public String getMachuong() {
		return machuong;
	}

	public void setMachuong(String machuong) {
		this.machuong = machuong;
	}

	public String getTenchuong() {
		return tenchuong;
	}

	public void setTenchuong(String tenchuong) {
		this.tenchuong = tenchuong;
	}

	public String getMagt() {
		return magt;
	}

	public void setMagt(String magt) {
		this.magt = magt;
	}

}
