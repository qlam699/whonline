package com.donglam.webhoconline.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "baifiles")
public class BaiFiles {
	@EmbeddedId
	private BaiFileId baifileid;

	public BaiFiles() {
	}

	public BaiFiles(BaiFileId baifileid) {
		super();
		this.baifileid = baifileid;
	}

	public BaiFileId getBaifileid() {
		return baifileid;
	}

	public void setBaifileid(BaiFileId baifileid) {
		this.baifileid = baifileid;
	}

	
}
