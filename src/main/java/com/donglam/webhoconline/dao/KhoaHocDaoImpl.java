package com.donglam.webhoconline.dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import com.donglam.webhoconline.model.KhoaHoc;

@SuppressWarnings("unchecked")
@Repository
public class KhoaHocDaoImpl extends GenericDaoImpl<KhoaHoc, String> implements KhoaHocDao {
	// custom method
	@Override
	public List<KhoaHoc> getListByName(String ten) {
		Query query = currentSession().createQuery("from KhoaHoc where KhoaHoc.tenkh =: tenkh");
		query.setParameter("tenkh", ten);
		return currentSession().createCriteria(daoType).list();
	}

	@Override
	public List<KhoaHoc> getListByPage(int firstResult, int maxResult) {
		Query query = currentSession().createQuery("from KhoaHoc where KhoaHoc.tenkh =: tenkh");
		query.setFirstResult(firstResult);
		query.setMaxResults(maxResult);
		return currentSession().createCriteria(daoType).list();
	}

	@Override
	public Page<KhoaHoc> getListPage(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}
}
