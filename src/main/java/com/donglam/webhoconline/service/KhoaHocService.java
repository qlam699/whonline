package com.donglam.webhoconline.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.donglam.webhoconline.model.KhoaHoc;

public interface KhoaHocService extends GenericService<KhoaHoc, String> {

	// custom method
	public List<KhoaHoc> getListByName(String ten);
	public List<KhoaHoc> getListByPage(int firstResult, int maxResult);
	public Page<KhoaHoc> getListPage(Pageable pageable);
}
