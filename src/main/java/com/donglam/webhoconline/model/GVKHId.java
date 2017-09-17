package com.donglam.webhoconline.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class GVKHId implements Serializable{

	private static final long serialVersionUID = 1L;

	@Column(name = "magv")
    private String magv;
 
    @Column(name = "makh")
    private String makh;
    
    public GVKHId() {}
	
	public GVKHId(String magv, String makh) {
		super();
		this.magv = magv;
		this.makh = makh;
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
        if (this == o) return true;
        if (!(o instanceof GVKHId)) return false;
        GVKHId that = (GVKHId) o;
        return Objects.equals(getMagv(), that.getMagv()) &&
                Objects.equals(getMakh(), that.getMakh());
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(getMagv(), getMakh());
    }
}
