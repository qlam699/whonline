package com.donglam.webhoconline.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "files")
public class Files {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "mafile", nullable = false)
	private int mafile;

	@Column(name = "tenfile", nullable = false)
	private String tenfile;

	@Column(name = "dungluong", nullable = false)
	private String dungluong;

	@Column(name = "ngaydang", nullable = false)
	private Date ngaydang;

	@Column(name = "nguoidang", nullable = false)
	private String nguoidang;

	@Column(name = "mota", nullable = false)
	private String mota;

	public Files() {
	}

	public Files(int mafile, String tenfile, String dungluong, Date ngaydang, String nguoidang, String mota) {
		super();
		this.mafile = mafile;
		this.tenfile = tenfile;
		this.dungluong = dungluong;
		this.ngaydang = ngaydang;
		this.nguoidang = nguoidang;
		this.mota = mota;
	}

	public int getMafile() {
		return mafile;
	}

	public void setMafile(int mafile) {
		this.mafile = mafile;
	}

	public String getTenfile() {
		return tenfile;
	}

	public void setTenfile(String tenfile) {
		this.tenfile = tenfile;
	}

	public String getDungluong() {
		return dungluong;
	}

	public void setDungluong(String dungluong) {
		this.dungluong = dungluong;
	}

	public Date getNgaydang() {
		return ngaydang;
	}

	public void setNgaydang(Date ngaydang) {
		this.ngaydang = ngaydang;
	}

	public String getNguoidang() {
		return nguoidang;
	}

	public void setNguoidang(String nguoidang) {
		this.nguoidang = nguoidang;
	}

	public String getMota() {
		return mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

}
