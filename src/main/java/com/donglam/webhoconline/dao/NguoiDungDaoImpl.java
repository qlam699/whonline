package com.donglam.webhoconline.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.donglam.webhoconline.model.NguoiDung;

@SuppressWarnings("unchecked")
@Repository
@Transactional
public class NguoiDungDaoImpl extends GenericDaoImpl<NguoiDung, String> implements NguoiDungDao {
	// custom method
	@Override
	public List<NguoiDung> getListByName(String ten) {
		Query query = currentSession().createQuery("from NguoiDung nd where nd.ten=:ten");
		query.setParameter("ten", ten);
		return currentSession().createCriteria(daoType).list();
	}

	
	@Override
	public List<NguoiDung> getListTeacher() {
		Query query = currentSession().createQuery("from NguoiDung nd join nd.ndQuyens ndq with ndq.ndquyenid.quyen.maquyen=3");
		List<Object[]> a=query.list();
		List<NguoiDung> list = new ArrayList<NguoiDung>();
		for(Object[] x: a) {
			list.add((NguoiDung)x[0]);
		}
		return list;
	}
	
	@Override
	public List<NguoiDung> getListStudent() {
		Query query = currentSession().createQuery("from NguoiDung nd join nd.ndQuyens ndq with ndq.ndquyenid.quyen.maquyen=4");
		List<Object[]> a=query.list();
		List<NguoiDung> list = new ArrayList<NguoiDung>();
		for(Object[] x: a) {
			list.add((NguoiDung)x[0]);
		}
		return list;
	}
	
	@Override
	public List<NguoiDung> getListTeaStu() {
		Query query = currentSession().createQuery("from NguoiDung nd join nd.ndQuyens ndq with ndq.ndquyenid.quyen.maquyen=3 or ndq.ndquyenid.quyen.maquyen=4");
		List<Object[]> a=query.list();
		List<NguoiDung> list = new ArrayList<NguoiDung>();
		for(Object[] x: a) {
			list.add((NguoiDung)x[0]);
		}
		return list;
	}
	
}
