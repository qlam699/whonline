package com.donglam.webhoconline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.donglam.webhoconline.dao.GenericDao;
import com.donglam.webhoconline.dao.NguoiDungDao;
import com.donglam.webhoconline.model.NguoiDung;
@Service
public class NguoiDungServiceImpl extends GenericServiceImpl<NguoiDung, String> implements NguoiDungService {
	@Autowired
	private NguoiDungDao dao;

	@Autowired
	public NguoiDungServiceImpl(GenericDao<NguoiDung, String> genericDao) {
		super(genericDao);
		this.dao = (NguoiDungDao) genericDao;
	}

	// custom method
	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
	public List<NguoiDung> getListByName(String ten) {
		return dao.getListByName(ten);
	}

	@Override
	public List<NguoiDung> getListTeacher() {
		return dao.getListTeacher();
	}
	
	@Override
	public List<NguoiDung> getListStudent() {
		return dao.getListStudent();
	}
	
	@Override
	public List<NguoiDung> getListTeaStu() {
		return dao.getListTeaStu();
	}
}
