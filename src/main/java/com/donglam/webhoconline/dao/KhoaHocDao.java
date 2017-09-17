package com.donglam.webhoconline.dao;

import java.util.List;

import com.donglam.webhoconline.model.KhoaHoc;

public interface KhoaHocDao extends GenericDao<KhoaHoc, String> {

	public List<KhoaHoc> getListByName(String ten);
}
