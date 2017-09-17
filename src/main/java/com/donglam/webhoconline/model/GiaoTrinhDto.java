package com.donglam.webhoconline.model;

import java.util.Date;

public class GiaoTrinhDto {

	private String magt;

	private String tengt;

	private Date tgcapnhat;

	private String makh;

	private String magv;

	public GiaoTrinhDto() {
	}

	public GiaoTrinhDto(String magt, String tengt, Date tgcapnhat, String makh, String magv) {
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
