package com.donglam.webhoconline.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "hvkh")
public class HVKH {
	@EmbeddedId
	private HVKHId hvkhid;

	public HVKH() {
	}

	public HVKH(HVKHId hvkhid) {
		super();
		this.hvkhid = hvkhid;
	}

	public HVKHId getHvkhid() {
		return hvkhid;
	}

	public void setHvkhid(HVKHId hvkhid) {
		this.hvkhid = hvkhid;
	}

}
