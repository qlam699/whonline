package com.donglam.webhoconline.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "quyen")
public class Quyen {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "maquyen", nullable = false)
	private int maquyen;

	@Column(name = "tenquyen", nullable = false)
	private String tenquyen;

	public Quyen() {
	}

	public Quyen(int maquyen, String tenquyen) {
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
