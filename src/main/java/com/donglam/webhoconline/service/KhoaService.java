package com.donglam.webhoconline.service;

import java.util.List;

import com.donglam.webhoconline.model.Khoa;
import com.donglam.webhoconline.model.KhoaHoc;

public interface KhoaService extends GenericService<Khoa, String> {

	// custom method
	public List<Khoa> getListByName(String ten);
}
