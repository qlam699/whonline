package com.donglam.webhoconline.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nguoidung")
public class NguoiDung {
	@Id
	@Column(name = "mand", nullable = false)
	private String mand;

	@Column(name = "hovatenlot", nullable = false)
	private String hovatenlot;

	@Column(name = "ten", nullable = false)
	private String ten;

	@Column(name = "phai", nullable = false)
	private String phai;

	@Column(name = "ngaysinh", nullable = false)
	private Date ngaysinh;

	@Column(name = "diachi", nullable = false)
	private String diachi;

	@Column(name = "cmnd", nullable = false)
	private String cmnd;

	@Column(name = "email", nullable = false)
	private String email;

	@Column(name = "password", nullable = false)
	private String password;

	@Column(name = "avatar", nullable = false)
	private String avatar;

	@Column(name = "mota", nullable = false)
	private String mota;

	public NguoiDung() {
	}

	public NguoiDung(String mand, String hovatenlot, String ten, String phai, Date ngaysinh, String diachi, String cmnd,
			String email, String password, String avatar, String mota) {
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

	public String getPhai() {
		return phai;
	}

	public void setPhai(String phai) {
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
