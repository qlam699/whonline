package com.donglam.webhoconline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.donglam.webhoconline.dao.GenericDao;
import com.donglam.webhoconline.dao.LoaiKhoaHocDao;
import com.donglam.webhoconline.model.LoaiKhoaHoc;

@Service
public class LoaiKhoaHocServiceImpl extends GenericServiceImpl<LoaiKhoaHoc, Integer> implements LoaiKhoaHocService {
	@Autowired
	private LoaiKhoaHocDao dao;

	@Autowired
	public LoaiKhoaHocServiceImpl(GenericDao<LoaiKhoaHoc, Integer> genericDao) {
		super(genericDao);
		this.dao = (LoaiKhoaHocDao) genericDao;
	}

	// custom method
	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
	public List<LoaiKhoaHoc> getListByName(String ten) {
		return dao.getListByName(ten);
	}
}
