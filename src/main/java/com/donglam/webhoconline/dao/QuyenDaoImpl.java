package com.donglam.webhoconline.dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.donglam.webhoconline.model.Quyen;

@SuppressWarnings("unchecked")
@Repository
public class QuyenDaoImpl extends GenericDaoImpl<Quyen, String> implements QuyenDao {
	// custom method
	@Override
	public List<Quyen> getListByName(String ten) {
		Query query = currentSession().createQuery("from quyen where quyen.tenquyen =: tenquyen");
		query.setParameter("tenquyen", ten);
		return currentSession().createCriteria(daoType).list();
	}
}
