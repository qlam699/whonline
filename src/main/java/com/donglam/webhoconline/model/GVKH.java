package com.donglam.webhoconline.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "gvkh")
public class GVKH {
	@EmbeddedId
	private GVKHId gvkhid;

	public GVKH() {
	}

	public GVKH(GVKHId gvkhid) {
		super();
		this.gvkhid = gvkhid;
	}

	public GVKHId getGvkhid() {
		return gvkhid;
	}

	public void setGvkhid(GVKHId gvkhid) {
		this.gvkhid = gvkhid;
	}

	
}
