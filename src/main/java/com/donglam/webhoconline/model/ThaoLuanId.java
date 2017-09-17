package com.donglam.webhoconline.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ThaoLuanId implements Serializable{

	private static final long serialVersionUID = 1L;

	@Column(name = "nguoidang")
    private String nguoidang;
 
    @Column(name = "tgdang")
    private Date tgdang;
    
    public ThaoLuanId() {}	

	public ThaoLuanId(String nguoidang, Date tgdang) {
		super();
		this.nguoidang = nguoidang;
		this.tgdang = tgdang;
	}

	public String getNguoidang() {
		return nguoidang;
	}

	public void setNguoidang(String nguoidang) {
		this.nguoidang = nguoidang;
	}

	public Date getTgdang() {
		return tgdang;
	}

	public void setTgdang(Date tgdang) {
		this.tgdang = tgdang;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ThaoLuanId)) return false;
        ThaoLuanId that = (ThaoLuanId) o;
        return Objects.equals(getNguoidang(), that.getNguoidang()) &&
                Objects.equals(getTgdang(), that.getTgdang());
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(getNguoidang(), getTgdang());
    }
}
