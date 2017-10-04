package com.donglam.webhoconline.model;

import java.util.Date;

public class NdQuyenDto {

	private NdQuyenId ndquyenid;

	private Date ngaycap;
	
	public NdQuyenDto() {
	}
	
	public NdQuyenDto(NdQuyenId ndquyenid, Date ngaycap) {
		super();
		this.ndquyenid = ndquyenid;
		this.ngaycap = ngaycap;
	}

	public Date getNgaycap() {
		return ngaycap;
	}


	public void setNgaycap(Date ngaycap) {
		this.ngaycap = ngaycap;
	}

	public NdQuyenId getNdquyenid() {
		return ndquyenid;
	}

	public void setNdquyenid(NdQuyenId ndquyenid) {
		this.ndquyenid = ndquyenid;
	}

	
}
