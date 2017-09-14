package com.donglam.webhoconline.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "khoa")
public class Khoa {
	@Id
	@Column(name = "makhoa", nullable = false)
	private String makhoa;
	
	@Column(name = "tenkhoa", nullable = false)
	private String tenkhoa;
	
	public Khoa() {}
	public Khoa(String makhoa, String tenkhoa) {
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
