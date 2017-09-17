package com.donglam.webhoconline.model;

public class NDTNDto {

	private NDTNId ndtnid;

	private String matn;

	public NDTNDto() {
	}

	public NDTNDto(NDTNId ndtnid, String matn) {
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
