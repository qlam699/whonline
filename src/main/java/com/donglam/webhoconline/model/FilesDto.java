package com.donglam.webhoconline.model;

import java.util.Date;

public class FilesDto {

	private int mafile;

	private String tenfile;

	private String dungluong;

	private Date ngaydang;

	private String nguoidang;
	
	private String url;
	
	private String mota;

	public FilesDto() {
	}

	public FilesDto(int mafile, String tenfile, String dungluong, Date ngaydang, String nguoidang, String url,
			String mota) {
		super();
		this.mafile = mafile;
		this.tenfile = tenfile;
		this.dungluong = dungluong;
		this.ngaydang = ngaydang;
		this.nguoidang = nguoidang;
		this.url = url;
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getMota() {
		return mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

}
