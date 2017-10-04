package com.donglam.webhoconline.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "nguoidung")
public class NguoiDung {
	@Id
	@Column(name = "mand", nullable = false)
	private String mand;

	@Column(name = "hovatenlot", nullable = true)
	private String hovatenlot;

	@Column(name = "ten", nullable = false)
	private String ten;

	@Column(name = "phai", nullable = true)
	private boolean phai;

	@DateTimeFormat(pattern="dd/MM/yyyy")
	@Column(name = "ngaysinh", nullable = true)
	private Date ngaysinh;

	@Column(name = "diachi", nullable = true)
	private String diachi;

	@Column(name = "cmnd", nullable = true)
	private String cmnd;

	@Column(name = "email", nullable = false)
	private String email;

	@Column(name = "matkhau", nullable = false)
	private String matkhau;

	@Column(name = "hinh", nullable = true)
	private String hinh;

	@Column(name = "mota", nullable = true)
	private String mota;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ndquyenid.nguoidung", cascade = CascadeType.ALL)
	private List<NdQuyen> ndQuyens = new ArrayList<NdQuyen>();

	public NguoiDung() {
	}

	public NguoiDung(String mand, String hovatenlot, String ten, boolean phai, Date ngaysinh, String diachi,
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
