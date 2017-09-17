package com.donglam.webhoconline.dao;

import java.util.List;

import com.donglam.webhoconline.model.Chuong;

public interface ChuongDao extends GenericDao<Chuong, String> {

	public List<Chuong> getListByName(String ten);
}
