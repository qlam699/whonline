package com.donglam.webhoconline.service;

import java.util.List;

import com.donglam.webhoconline.model.DanhGia;
import com.donglam.webhoconline.model.DanhGiaId;

public interface DanhGiaService extends GenericService<DanhGia, DanhGiaId> {

	// custom method
	public List<DanhGia> getListBySao(Double sao);
}
