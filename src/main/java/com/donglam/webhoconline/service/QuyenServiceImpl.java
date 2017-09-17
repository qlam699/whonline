package com.donglam.webhoconline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.donglam.webhoconline.dao.GenericDao;
import com.donglam.webhoconline.dao.QuyenDao;
import com.donglam.webhoconline.model.Quyen;

public class QuyenServiceImpl extends GenericServiceImpl<Quyen, String> implements QuyenService {
	@Autowired
	private QuyenDao dao;

	@Autowired
	public QuyenServiceImpl(GenericDao<Quyen, String> genericDao) {
		super(genericDao);
		this.dao = (QuyenDao) genericDao;
	}

	// custom method
	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
	public List<Quyen> getListByName(String ten) {
		return dao.getListByName(ten);
	}
}
