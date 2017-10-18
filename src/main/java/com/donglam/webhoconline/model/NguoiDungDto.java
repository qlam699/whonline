package com.donglam.webhoconline.model;

import java.util.ArrayList;
import java.util.List;

public class NguoiDungDto {

	private String mand;

	private String hovatenlot;

	private String ten;

	private boolean phai;

	private String ngaysinh;

	private String diachi;

	private String cmnd;

	private String email;

	private String matkhau;

	private String hinh;

	private String mota;
	
	private List<NdQuyen> ndQuyens=new ArrayList<NdQuyen>();
	
	public NguoiDungDto() {
	}

	public NguoiDungDto(String mand, String hovatenlot, String ten, boolean phai, String ngaysinh, String diachi,
			String cmnd, String email, String matkhau, String hinh, String mota, List<NdQuyen> ndQuyens) {
		super();
		this.mand = mand;
		this.hovatenlot = hovatenlot;
		this.ten = ten;
		this.phai = phai;
		this.ngaysinh = ngaysinh;
		this.diachi = diachi;
		this.cmnd = cmnd;
		this.email = email;
		this.matkhau = matkhau;
		this.hinh = hinh;
		this.mota = mota;
		this.ndQuyens = ndQuyens;
	}

	public String getMand() {
		return mand;
	}

	public void setMand(String mand) {
		this.mand = mand;
	}

	public String getHovatenlot() {
		return hovatenlot;
	}

	public void setHovatenlot(String hovatenlot) {
		this.hovatenlot = hovatenlot;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public boolean isPhai() {
		return phai;
	}

	public void setPhai(boolean phai) {
		this.phai = phai;
	}

	public String getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(String ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getCmnd() {
		return cmnd;
	}

	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMatkhau() {
		return matkhau;
	}

	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}

	public String getHinh() {
		return hinh;
	}

	public void setHinh(String hinh) {
		this.hinh = hinh;
	}

	public String getMota() {
		return mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

	public List<NdQuyen> getNdQuyens() {
		return ndQuyens;
	}

	public void setNdQuyens(List<NdQuyen> ndQuyens) {
		this.ndQuyens = ndQuyens;
	}

}
