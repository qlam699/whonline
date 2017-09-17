package com.donglam.webhoconline.dao;

import java.util.List;

import com.donglam.webhoconline.model.TinNhan;

public interface TinNhanDao extends GenericDao<TinNhan, String> {

	public List<TinNhan> getListByName(String tieude);
}
