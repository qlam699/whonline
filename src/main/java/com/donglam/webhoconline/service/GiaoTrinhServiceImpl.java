package com.donglam.webhoconline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.donglam.webhoconline.dao.GenericDao;
import com.donglam.webhoconline.dao.GiaoTrinhDao;
import com.donglam.webhoconline.model.GiaoTrinh;

public class GiaoTrinhServiceImpl extends GenericServiceImpl<GiaoTrinh, String> implements GiaoTrinhService {
	@Autowired
	private GiaoTrinhDao dao;

	@Autowired
	public GiaoTrinhServiceImpl(GenericDao<GiaoTrinh, String> genericDao) {
		super(genericDao);
		this.dao = (GiaoTrinhDao) genericDao;
	}

	// custom method
	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
	public List<GiaoTrinh> getListByName(String ten) {
		return dao.getListByName(ten);
	}
}
