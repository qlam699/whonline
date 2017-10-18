package com.donglam.webhoconline.dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.donglam.webhoconline.model.Bai;

@SuppressWarnings("unchecked")
@Repository
public class BaiDaoImpl extends GenericDaoImpl<Bai, String> implements BaiDao {
	// custom method
	@Override
	public List<Bai> getListByName(String ten) {
		Query query = currentSession().createQuery("from bai where bai.tenbai=:tenbai");
		query.setParameter("tenbai", ten);
		return currentSession().createCriteria(daoType).list();
	}
}
