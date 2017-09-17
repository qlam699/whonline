package com.donglam.webhoconline.service;

import java.util.List;

import com.donglam.webhoconline.model.Chuong;

public interface ChuongService extends GenericService<Chuong, String> {

	// custom method
	public List<Chuong> getListByName(String ten);
}
