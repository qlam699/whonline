package com.donglam.webhoconline.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class DanhGiaId implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "mahv", nullable = false)
	private String mahv;

	@Column(name = "magv", nullable = false)
	private String magv;

	@Column(name = "makh", nullable = false)
	private String makh;

	public DanhGiaId() {
	}

	public DanhGiaId(String mahv, String magv, String makh) {
		super();
		this.mahv = mahv;
		this.magv = magv;
		this.makh = makh;
	}

	public String getMahv() {
		return mahv;
	}

	public void setMahv(String mahv) {
		this.mahv = mahv;
	}

	public String getMagv() {
		return magv;
	}

	public void setMagv(String magv) {
		this.magv = magv;
	}

	public String getMakh() {
		return makh;
	}

	public void setMakh(String makh) {
		this.makh = makh;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof DanhGiaId))
			return false;
		DanhGiaId that = (DanhGiaId) o;
		return Objects.equals(getMahv(), that.getMahv()) && Objects.equals(getMagv(), that.getMagv())
				&& Objects.equals(getMakh(), that.getMakh());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getMahv(), getMagv(), getMakh());
	}
}
