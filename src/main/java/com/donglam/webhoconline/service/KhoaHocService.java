package com.donglam.webhoconline.service;

import java.util.List;

import com.donglam.webhoconline.model.KhoaHoc;

public interface KhoaHocService extends GenericService<KhoaHoc, String> {

	// custom method
	public List<KhoaHoc> getListByName(String ten);
}
