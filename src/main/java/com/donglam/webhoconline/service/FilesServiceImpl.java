package com.donglam.webhoconline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.donglam.webhoconline.dao.GenericDao;
import com.donglam.webhoconline.dao.FilesDao;
import com.donglam.webhoconline.model.Files;

public class FilesServiceImpl extends GenericServiceImpl<Files, String> implements FilesService {
	@Autowired
	private FilesDao dao;

	@Autowired
	public FilesServiceImpl(GenericDao<Files, String> genericDao) {
		super(genericDao);
		this.dao = (FilesDao) genericDao;
	}

	// custom method
	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
	public List<Files> getListByName(String ten) {
		return dao.getListByName(ten);
	}
}
