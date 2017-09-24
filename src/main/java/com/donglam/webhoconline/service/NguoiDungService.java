package com.donglam.webhoconline.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.donglam.webhoconline.model.NguoiDung;

public interface NguoiDungService extends GenericService<NguoiDung, String> {

	// custom method
	public List<NguoiDung> getListByName(String ten);
	public List<NguoiDung> getListTeacher();
}
