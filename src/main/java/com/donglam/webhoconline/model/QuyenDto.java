package com.donglam.webhoconline.model;

import java.util.ArrayList;
import java.util.List;

public class QuyenDto {

	private int maquyen;

	private String tenquyen;

	private List<NdQuyen> ndQuyens=new ArrayList<NdQuyen>();
	
	public QuyenDto() {
	}

	public QuyenDto(int maquyen, String tenquyen, List<NdQuyen> ndQuyens) {
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
