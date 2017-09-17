package com.donglam.webhoconline.dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.donglam.webhoconline.model.Files;

@SuppressWarnings("unchecked")
@Repository
public class FilesDaoImpl extends GenericDaoImpl<Files, String> implements FilesDao {
	// custom method
	@Override
	public List<Files> getListByName(String ten) {
		Query query = currentSession().createQuery("from files where files.tenfile =: tenfile");
		query.setParameter("tenfile", ten);
		return currentSession().createCriteria(daoType).list();
	}
}
