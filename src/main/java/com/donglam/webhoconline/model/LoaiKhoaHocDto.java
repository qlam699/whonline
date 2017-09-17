package com.donglam.webhoconline.model;

public class LoaiKhoaHocDto {

	private String maloaikh;

	private String tenloaikh;

	private String makhoa;

	public LoaiKhoaHocDto() {
	}

	public LoaiKhoaHocDto(String maloaikh, String tenloaikh, String makhoa) {
		super();
		this.maloaikh = maloaikh;
		this.tenloaikh = tenloaikh;
		this.makhoa = makhoa;
	}

	public String getMaloaikh() {
		return maloaikh;
	}

	public void setMaloaikh(String maloaikh) {
		this.maloaikh = maloaikh;
	}

	public String getTenloaikh() {
		return tenloaikh;
	}

	public void setTenloaikh(String tenloaikh) {
		this.tenloaikh = tenloaikh;
	}

	public String getMakhoa() {
		return makhoa;
	}

	public void setMakhoa(String makhoa) {
		this.makhoa = makhoa;
	}

}
