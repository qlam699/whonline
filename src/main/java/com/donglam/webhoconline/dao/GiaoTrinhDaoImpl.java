package com.donglam.webhoconline.dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.donglam.webhoconline.model.GiaoTrinh;

@SuppressWarnings("unchecked")
@Repository
public class GiaoTrinhDaoImpl extends GenericDaoImpl<GiaoTrinh, String> implements GiaoTrinhDao {
	// custom method
	@Override
	public List<GiaoTrinh> getListByName(String ten) {
		Query query = currentSession().createQuery("from giaotrinh where giaotrinh.tengt =: tengt");
		query.setParameter("tengt", ten);
		return currentSession().createCriteria(daoType).list();
	}
}
