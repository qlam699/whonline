package com.donglam.webhoconline.service;

import java.util.List;

import com.donglam.webhoconline.model.Files;

public interface FilesService extends GenericService<Files, String> {

	// custom method
	public List<Files> getListByName(String ten);
}
