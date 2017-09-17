package com.donglam.webhoconline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.donglam.webhoconline.dao.GenericDao;
import com.donglam.webhoconline.dao.KhoaHocDao;
import com.donglam.webhoconline.model.KhoaHoc;
@Service
public class KhoaHocServiceImpl extends GenericServiceImpl<KhoaHoc, String> implements KhoaHocService {
	@Autowired
	private KhoaHocDao dao;

	@Autowired
	public KhoaHocServiceImpl(GenericDao<KhoaHoc, String> genericDao) {
		super(genericDao);
		this.dao = (KhoaHocDao) genericDao;
	}

	// custom method
	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
	public List<KhoaHoc> getListByName(String ten) {
		return dao.getListByName(ten);
	}
}
