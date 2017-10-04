package com.donglam.webhoconline.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.donglam.webhoconline.model.KhoaHoc;

public interface KhoaHocDao extends GenericDao<KhoaHoc, String> {

	public List<KhoaHoc> getListByName(String ten);
	public List<KhoaHoc> getListByPage(int firstResult, int maxResult);
	public Page<KhoaHoc> getListPage(Pageable pageable);
}
