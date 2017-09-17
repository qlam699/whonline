package com.donglam.webhoconline.model;

public class ChuongDto {

	private String machuong;

	private String tenchuong;

	private String magt;

	public ChuongDto() {
	}

	public ChuongDto(String machuong, String tenchuong, String magt) {
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
