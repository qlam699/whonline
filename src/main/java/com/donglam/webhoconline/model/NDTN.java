package com.donglam.webhoconline.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ndtn")
public class NDTN {
	@EmbeddedId
	private NDTNId ndtnid;

	@Column(name = "matn", nullable = false)
	private String matn;

	public NDTN() {
	}

	public NDTN(NDTNId ndtnid, String matn) {
		super();
		this.ndtnid = ndtnid;
		this.matn = matn;
	}

	public NDTNId getNdtnid() {
		return ndtnid;
	}

	public void setNdtnid(NDTNId ndtnid) {
		this.ndtnid = ndtnid;
	}

	public String getMatn() {
		return matn;
	}

	public void setMatn(String matn) {
		this.matn = matn;
	}

	

}
