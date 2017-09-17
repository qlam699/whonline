package com.donglam.webhoconline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.donglam.webhoconline.dao.GenericDao;
import com.donglam.webhoconline.dao.TinNhanDao;
import com.donglam.webhoconline.model.TinNhan;

public class TinNhanServiceImpl extends GenericServiceImpl<TinNhan, String> implements TinNhanService {
	@Autowired
	private TinNhanDao dao;

	@Autowired
	public TinNhanServiceImpl(GenericDao<TinNhan, String> genericDao) {
		super(genericDao);
		this.dao = (TinNhanDao) genericDao;
	}

	// custom method
	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
	public List<TinNhan> getListByName(String ten) {
		return dao.getListByName(ten);
	}
}
