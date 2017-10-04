package com.donglam.webhoconline.model;

import java.util.Date;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "ndquyen")
@AssociationOverrides({ @AssociationOverride(name = "ndquyenid.nguoidung", joinColumns = @JoinColumn(name = "mand")),
		@AssociationOverride(name = "ndquyenid.quyen", joinColumns = @JoinColumn(name = "maquyen")) })

public class NdQuyen {
	@EmbeddedId
	private NdQuyenId ndquyenid;
	@Column
	private Date ngaycap;

	public NdQuyen() {
	}

	public NdQuyen(NdQuyenId ndquyenid, Date ngaycap) {
		super();
		this.ndquyenid = ndquyenid;
		this.ngaycap = ngaycap;
	}

	public Date getNgaycap() {
		return ngaycap;
	}

	public void setNgaycap(Date ngaycap) {
		this.ngaycap = ngaycap;
	}

	public NdQuyenId getNdquyenid() {
		return ndquyenid;
	}

	public void setNdquyenid(NdQuyenId ndquyenid) {
		this.ndquyenid = ndquyenid;
	}

	@Transient
	public NguoiDung getND() {
		return getNdquyenid().getNd();
	}

	public void setND(NguoiDung nd) {
		getNdquyenid().setNd(nd);
	}

	@Transient
	public Quyen getQuyen() {
		return getNdquyenid().getQuyen();
	}

	public void setND(Quyen nd) {
		getNdquyenid().setQuyen(nd);
	}

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		NdQuyen that = (NdQuyen) o;

		if (getNdquyenid() != null ? !getNdquyenid().equals(that.getNdquyenid()) : that.getNdquyenid() != null)
			return false;

		return true;
	}

	public int hashCode() {
		return (getNdquyenid() != null ? getNdquyenid().hashCode() : 0);
	}

}
