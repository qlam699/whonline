package com.donglam.webhoconline.dao;

import java.util.List;

import com.donglam.webhoconline.model.NguoiDung;

public interface NguoiDungDao extends GenericDao<NguoiDung, String> {

	public List<NguoiDung> getListByName(String ten);
	public List<NguoiDung> getListTeacher();
}
