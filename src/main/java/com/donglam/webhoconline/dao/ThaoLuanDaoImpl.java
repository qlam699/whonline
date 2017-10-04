package com.donglam.webhoconline.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.donglam.webhoconline.model.ThaoLuan;
import com.donglam.webhoconline.model.ThaoLuanId;

@SuppressWarnings("unchecked")
@Repository
public class ThaoLuanDaoImpl extends GenericDaoImpl<ThaoLuan, ThaoLuanId> implements ThaoLuanDao {
	// custom method
	@Override
	public List<ThaoLuan> getListByTopic(Integer matl) {
		Query query = currentSession().createQuery("from ThaoLuan tl where tl.matl=:matl order by tl.thaoluanid.tgdang");
		query.setParameter("matl", matl);

		return query.list();
	}

	@Override
	public ThaoLuan getQuestion(Integer matl) {	
		List<ThaoLuan> list = new ArrayList<>();
		list = getListByTopic(matl);
		
		return list.get(0);
	}

	@Override
	public List<ThaoLuan> getReply(Integer matl) {	
		List<ThaoLuan> list = new ArrayList<>();
		list = getListByTopic(matl);
		list.remove(0);
		
		return list;
	}
	
	@Override
	public int getCountReply(Integer matl) {	
		List<ThaoLuan> list = new ArrayList<>();
		list = getReply(matl);
		
		return list.size();
	}
}
