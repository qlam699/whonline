package com.donglam.webhoconline.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class HVKHId implements Serializable{

	private static final long serialVersionUID = 1L;

	@Column(name = "mahv")
    private String mahv;
 
    @Column(name = "makh")
    private String makh;
    
    public HVKHId() {}
	
	
	public HVKHId(String mahv, String makh) {
		super();
		this.mahv = mahv;
		this.makh = makh;
	}


	public String getMahv() {
		return mahv;
	}


	public void setMahv(String mahv) {
		this.mahv = mahv;
	}


	public String getMakh() {
		return makh;
	}


	public void setMakh(String makh) {
		this.makh = makh;
	}


	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HVKHId)) return false;
        HVKHId that = (HVKHId) o;
        return Objects.equals(getMahv(), that.getMahv()) &&
                Objects.equals(getMakh(), that.getMakh());
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(getMahv(), getMakh());
    }
}
