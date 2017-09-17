package com.donglam.webhoconline.service;

import java.util.List;

import com.donglam.webhoconline.model.GiaoTrinh;

public interface GiaoTrinhService extends GenericService<GiaoTrinh, String> {

	// custom method
	public List<GiaoTrinh> getListByName(String ten);
}
