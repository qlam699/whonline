package com.donglam.webhoconline.model;

import java.util.Date;

public class NguoiDungDto {

	private String mand;

	private String hovatenlot;

	private String ten;

	private boolean phai;

	private Date ngaysinh;

	private String diachi;

	private String cmnd;

	private String email;

	private String password;

	private String avatar;

	private String mota;

	public NguoiDungDto() {
	}

	public NguoiDungDto(String mand, String hovatenlot, String ten, boolean phai, Date ngaysinh, String diachi,
			String cmnd, String email, String password, String avatar, String mota) {
		super();
		this.mand = mand;
		this.hovatenlot = hovatenlot;
		this.ten = ten;
		this.phai = phai;
		this.ngaysinh = ngaysinh;
		this.diachi = diachi;
		this.cmnd = cmnd;
		this.email = email;
		this.password = password;
		this.avatar = avatar;
		this.mota = mota;
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

	public Date getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(Date ngaysinh) {
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getMota() {
		return mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

}
