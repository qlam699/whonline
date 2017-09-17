package com.donglam.webhoconline.dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.donglam.webhoconline.model.KhoaHoc;

@SuppressWarnings("unchecked")
@Repository
public class KhoaHocDaoImpl extends GenericDaoImpl<KhoaHoc, String> implements KhoaHocDao {
	// custom method
	@Override
	public List<KhoaHoc> getListByName(String ten) {
		Query query = currentSession().createQuery("from khoahoc where khoahoc.tenkh =: tenkh");
		query.setParameter("tenkh", ten);
		return currentSession().createCriteria(daoType).list();
	}
}
