package com.donglam.webhoconline.dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.donglam.webhoconline.model.LoaiKhoaHoc;

@SuppressWarnings("unchecked")
@Repository
public class LoaiKhoaHocDaoImpl extends GenericDaoImpl<LoaiKhoaHoc, String> implements LoaiKhoaHocDao {
	// custom method
	@Override
	public List<LoaiKhoaHoc> getListByName(String ten) {
		Query query = currentSession().createQuery("from LoaiKhoaHoc lkh where lkh.tenloaikh=:tenloaikh");
		query.setParameter("tenloaikh", ten);
		return currentSession().createCriteria(daoType).list();
	}
}
