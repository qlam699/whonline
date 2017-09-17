package com.donglam.webhoconline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.donglam.webhoconline.dao.GenericDao;
import com.donglam.webhoconline.dao.ChuongDao;
import com.donglam.webhoconline.model.Chuong;

public class ChuongServiceImpl extends GenericServiceImpl<Chuong, String> implements ChuongService {
	@Autowired
	private ChuongDao dao;

	@Autowired
	public ChuongServiceImpl(GenericDao<Chuong, String> genericDao) {
		super(genericDao);
		this.dao = (ChuongDao) genericDao;
	}

	// custom method
	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
	public List<Chuong> getListByName(String ten) {
		return dao.getListByName(ten);
	}
}
