package com.donglam.webhoconline.model;

public class KhoaDto {

	private String makhoa;

	private String tenkhoa;

	public KhoaDto() {
	}

	public KhoaDto(String makhoa, String tenkhoa) {
		super();
		this.makhoa = makhoa;
		this.tenkhoa = tenkhoa;
	}

	public String getMakhoa() {
		return makhoa;
	}

	public void setMakhoa(String makhoa) {
		this.makhoa = makhoa;
	}

	public String getTenkhoa() {
		return tenkhoa;
	}

	public void setTenkhoa(String tenkhoa) {
		this.tenkhoa = tenkhoa;
	}

}
