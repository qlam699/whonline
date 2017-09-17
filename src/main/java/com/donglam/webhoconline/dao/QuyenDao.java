package com.donglam.webhoconline.dao;

import java.util.List;

import com.donglam.webhoconline.model.Quyen;

public interface QuyenDao extends GenericDao<Quyen, String> {

	public List<Quyen> getListByName(String ten);
}
