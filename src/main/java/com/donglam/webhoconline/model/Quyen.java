package com.donglam.webhoconline.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "quyen")
public class Quyen {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "maquyen", nullable = false)
	private int maquyen;

	@Column(name = "tenquyen", nullable = true)
	private String tenquyen;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ndquyenid.quyen")
	private List<NdQuyen> ndQuyens=new ArrayList<NdQuyen>();
	
	public Quyen() {
	}

	public Quyen(int maquyen, String tenquyen, List<NdQuyen> ndQuyens) {
		super();
		this.maquyen = maquyen;
		this.tenquyen = tenquyen;
		this.ndQuyens = ndQuyens;
	}

	public List<NdQuyen> getNdQuyens() {
		return ndQuyens;
	}

	public void setNdQuyens(List<NdQuyen> ndQuyens) {
		this.ndQuyens = ndQuyens;
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
