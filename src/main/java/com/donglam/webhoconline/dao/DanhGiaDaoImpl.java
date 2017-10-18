package com.donglam.webhoconline.dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.donglam.webhoconline.model.DanhGia;
import com.donglam.webhoconline.model.DanhGiaId;

@SuppressWarnings("unchecked")
@Repository
public class DanhGiaDaoImpl extends GenericDaoImpl<DanhGia, DanhGiaId> implements DanhGiaDao {
	// custom method
		@Override
		public List<DanhGia> getListBySao(Double sao) {
			Query query = currentSession().createQuery("from DanhGia dg where dg.sao=:sao");
			query.setParameter("sao", sao);
			return currentSession().createCriteria(daoType).list();
		}
}
