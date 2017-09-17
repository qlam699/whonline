package com.donglam.webhoconline.service;

import java.util.List;

import com.donglam.webhoconline.model.LoaiKhoaHoc;

public interface LoaiKhoaHocService extends GenericService<LoaiKhoaHoc,Integer> {
	//custom method
	public List<LoaiKhoaHoc> getListByName(String ten);
}
