package com.donglam.webhoconline.dao;

import java.util.List;

import com.donglam.webhoconline.model.Bai;

public interface BaiDao extends GenericDao<Bai, String> {

	public List<Bai> getListByName(String ten);
}
