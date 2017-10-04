package com.donglam.webhoconline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.donglam.webhoconline.dao.GenericDao;
import com.donglam.webhoconline.dao.KhoaHocDao;
import com.donglam.webhoconline.model.KhoaHoc;
@Service
@Transactional(propagation = Propagation.REQUIRED)
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
	public List<KhoaHoc> getListByName(String ten) {
		return dao.getListByName(ten);
	}

	@Override
	public List<KhoaHoc> getListByPage(int firstResult, int maxResult) {
		return dao.getListByPage(firstResult, maxResult);
	}

	@Override
	public Page<KhoaHoc> getListPage(Pageable pageable) {
		return dao.getListPage(pageable);
	}
}
