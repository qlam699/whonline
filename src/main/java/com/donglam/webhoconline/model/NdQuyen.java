package com.donglam.webhoconline.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ndquyen")
public class NdQuyen {
	@EmbeddedId
	private NdQuyenId ndquyenid;

	public NdQuyen() {
	}

	public NdQuyen(NdQuyenId ndquyenid) {
		super();
		this.ndquyenid = ndquyenid;
	}

	public NdQuyenId getNdquyenid() {
		return ndquyenid;
	}

	public void setNdquyenid(NdQuyenId ndquyenid) {
		this.ndquyenid = ndquyenid;
	}

	
}
