package com.donglam.webhoconline.model;

public class BaiFilesDto {

	private BaiFileId baifileid;

	public BaiFilesDto() {
	}

	public BaiFilesDto(BaiFileId baifileid) {
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
