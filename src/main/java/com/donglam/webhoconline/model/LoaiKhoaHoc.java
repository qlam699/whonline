package com.donglam.webhoconline.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "loaikhoahoc")
public class LoaiKhoaHoc {
	@Id
	@Column(name = "maloaikh", nullable = false)
	private String maloaikh;

	@Column(name = "tenloaikh", nullable = false)
	private String tenloaikh;

	@Column(name = "makhoa", nullable = false)
	private String makhoa;

	public LoaiKhoaHoc() {
	}

	public LoaiKhoaHoc(String maloaikh, String tenloaikh, String makhoa) {
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
