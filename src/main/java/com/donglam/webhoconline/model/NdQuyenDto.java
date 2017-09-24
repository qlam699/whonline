package com.donglam.webhoconline.model;

import java.util.Date;

public class NdQuyenDto {

	private NdQuyenId ndquyenid;

	private Date createdate;
	
	public NdQuyenDto() {
	}
	
	public NdQuyenDto(NdQuyenId ndquyenid, Date createdate) {
		super();
		this.ndquyenid = ndquyenid;
		this.createdate = createdate;
	}

	public Date getCreatedate() {
		return createdate;
	}


	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	public NdQuyenId getNdquyenid() {
		return ndquyenid;
	}

	public void setNdquyenid(NdQuyenId ndquyenid) {
		this.ndquyenid = ndquyenid;
	}

	
}
