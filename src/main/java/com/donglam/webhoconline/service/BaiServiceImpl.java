package com.donglam.webhoconline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.donglam.webhoconline.dao.GenericDao;
import com.donglam.webhoconline.dao.BaiDao;
import com.donglam.webhoconline.model.Bai;

public class BaiServiceImpl extends GenericServiceImpl<Bai, String> implements BaiService {
	@Autowired
	private BaiDao dao;

	@Autowired
	public BaiServiceImpl(GenericDao<Bai, String> genericDao) {
		super(genericDao);
		this.dao = (BaiDao) genericDao;
	}

	// custom method
	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
	public List<Bai> getListByName(String ten) {
		return dao.getListByName(ten);
	}
}
