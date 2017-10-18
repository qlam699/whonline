package com.donglam.webhoconline.dao;

import java.util.List;

import com.donglam.webhoconline.model.DanhGia;
import com.donglam.webhoconline.model.DanhGiaId;

public interface DanhGiaDao extends GenericDao<DanhGia, DanhGiaId> {

	public List<DanhGia> getListBySao(Double sao);
}
