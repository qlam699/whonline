package com.donglam.webhoconline.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BaiFileId implements Serializable{

	private static final long serialVersionUID = 1L;

	@Column(name = "mabai")
    private String mabai;
 
    @Column(name = "mafile")
    private int mafile;
    
    public BaiFileId() {}
	public BaiFileId(String mabai, int mafile) {
		super();
		this.mabai = mabai;
		this.mafile = mafile;
	}
	public String getMabai() {
		return mabai;
	}
	public void setMabai(String mabai) {
		this.mabai = mabai;
	}
	public int getMafile() {
		return mafile;
	}
	public void setMafile(int mafile) {
		this.mafile = mafile;
	}
    
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaiFileId)) return false;
        BaiFileId that = (BaiFileId) o;
        return Objects.equals(getMabai(), that.getMabai()) &&
                Objects.equals(getMafile(), that.getMafile());
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(getMabai(), getMafile());
    }
}
