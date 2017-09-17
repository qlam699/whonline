package com.donglam.webhoconline.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class NdQuyenId implements Serializable{

	private static final long serialVersionUID = 1L;

	@Column(name = "mand")
    private String mand;
 
    @Column(name = "maquyen")
    private int maquyen;
    
    public NdQuyenId() {}
	
	
	public NdQuyenId(String mand, int maquyen) {
		super();
		this.mand = mand;
		this.maquyen = maquyen;
	}


	public String getMand() {
		return mand;
	}


	public void setMand(String mand) {
		this.mand = mand;
	}


	public int getMaquyen() {
		return maquyen;
	}


	public void setMaquyen(int maquyen) {
		this.maquyen = maquyen;
	}


	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NdQuyenId)) return false;
        NdQuyenId that = (NdQuyenId) o;
        return Objects.equals(getMand(), that.getMand()) &&
                Objects.equals(getMaquyen(), that.getMaquyen());
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(getMand(), getMaquyen());
    }
}
