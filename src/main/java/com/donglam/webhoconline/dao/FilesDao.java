package com.donglam.webhoconline.dao;

import java.util.List;

import com.donglam.webhoconline.model.Files;

public interface FilesDao extends GenericDao<Files, String> {

	public List<Files> getListByName(String ten);
}
