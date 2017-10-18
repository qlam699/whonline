package com.donglam.webhoconline.model;

public class FilesDto {

	private int mafile;

	private String tenfile;

	private String dungluong;

	private String ngaydang;

	private String nguoidang;
	
	private String url;
	
	private String mota;

	public FilesDto() {
	}

	public FilesDto(int mafile, String tenfile, String dungluong, String ngaydang, String nguoidang, String url,
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

	public String getNgaydang() {
		return ngaydang;
	}

	public void setNgaydang(String ngaydang) {
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
