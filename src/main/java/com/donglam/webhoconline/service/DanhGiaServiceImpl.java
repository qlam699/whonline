package com.donglam.webhoconline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.donglam.webhoconline.dao.GenericDao;
import com.donglam.webhoconline.dao.DanhGiaDao;
import com.donglam.webhoconline.model.DanhGia;
import com.donglam.webhoconline.model.DanhGiaId;

@Service
public class DanhGiaServiceImpl extends GenericServiceImpl<DanhGia, DanhGiaId> implements DanhGiaService {
	@Autowired
	private DanhGiaDao dao;

	@Autowired
	public DanhGiaServiceImpl(GenericDao<DanhGia, DanhGiaId> genericDao) {
		super(genericDao);
		this.dao = (DanhGiaDao) genericDao;
	}

	// custom method
	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
	public List<DanhGia> getListBySao(Double sao) {
		return dao.getListBySao(sao);
	}
}
