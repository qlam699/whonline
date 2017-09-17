package com.donglam.webhoconline.dao;

import java.util.List;

import com.donglam.webhoconline.model.LoaiKhoaHoc;

public interface LoaiKhoaHocDao extends GenericDao<LoaiKhoaHoc, Integer> {
	// custom method
	public List<LoaiKhoaHoc> getListByName(String ten);
}
