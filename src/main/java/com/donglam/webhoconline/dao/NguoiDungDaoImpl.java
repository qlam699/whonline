package com.donglam.webhoconline.dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.donglam.webhoconline.model.NguoiDung;

@SuppressWarnings("unchecked")
@Repository
public class NguoiDungDaoImpl extends GenericDaoImpl<NguoiDung, String> implements NguoiDungDao {
	// custom method
	@Override
	public List<NguoiDung> getListByName(String ten) {
		Query query = currentSession().createQuery("from nguoidung where nguoidung.ten =: ten");
		query.setParameter("ten", ten);
		return currentSession().createCriteria(daoType).list();
	}
}
