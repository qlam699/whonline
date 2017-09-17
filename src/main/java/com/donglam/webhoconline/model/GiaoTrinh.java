package com.donglam.webhoconline.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "giaotrinh")
public class GiaoTrinh {
	@Id
	@Column(name = "magt", nullable = false)
	private String magt;

	@Column(name = "tengt", nullable = false)
	private String tengt;

	@Column(name = "tgcapnhat", nullable = false)
	private Date tgcapnhat;

	@Column(name = "makh", nullable = false)
	private String makh;

	@Column(name = "magv", nullable = false)
	private String magv;

	public GiaoTrinh() {
	}

	public GiaoTrinh(String magt, String tengt, Date tgcapnhat, String makh, String magv) {
		super();
		this.magt = magt;
		this.tengt = tengt;
		this.tgcapnhat = tgcapnhat;
		this.makh = makh;
		this.magv = magv;
	}

	public String getMagt() {
		return magt;
	}

	public void setMagt(String magt) {
		this.magt = magt;
	}

	public String getTengt() {
		return tengt;
	}

	public void setTengt(String tengt) {
		this.tengt = tengt;
	}

	public Date getTgcapnhat() {
		return tgcapnhat;
	}

	public void setTgcapnhat(Date tgcapnhat) {
		this.tgcapnhat = tgcapnhat;
	}

	public String getMakh() {
		return makh;
	}

	public void setMakh(String makh) {
		this.makh = makh;
	}

	public String getMagv() {
		return magv;
	}

	public void setMagv(String magv) {
		this.magv = magv;
	}

}
