package com.donglam.webhoconline.service;

import java.util.List;

import com.donglam.webhoconline.model.NguoiDung;

public interface NguoiDungService extends GenericService<NguoiDung, String> {

	// custom method
	public List<NguoiDung> getListByName(String ten);
}
