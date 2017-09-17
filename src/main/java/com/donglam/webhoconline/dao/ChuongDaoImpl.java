package com.donglam.webhoconline.dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.donglam.webhoconline.model.Chuong;

@SuppressWarnings("unchecked")
@Repository
public class ChuongDaoImpl extends GenericDaoImpl<Chuong, String> implements ChuongDao {
	// custom method
	@Override
	public List<Chuong> getListByName(String ten) {
		Query query = currentSession().createQuery("from chuong where chuong.tenchuong =: tenchuong");
		query.setParameter("tenchuong", ten);
		return currentSession().createCriteria(daoType).list();
	}
}
