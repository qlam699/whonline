package com.donglam.webhoconline.model;

public class QuyenDto {

	private int maquyen;

	private String tenquyen;

	public QuyenDto() {
	}

	public QuyenDto(int maquyen, String tenquyen) {
		super();
		this.maquyen = maquyen;
		this.tenquyen = tenquyen;
	}

	public int getMaquyen() {
		return maquyen;
	}

	public void setMaquyen(int maquyen) {
		this.maquyen = maquyen;
	}

	public String getTenquyen() {
		return tenquyen;
	}

	public void setTenquyen(String tenquyen) {
		this.tenquyen = tenquyen;
	}

}
