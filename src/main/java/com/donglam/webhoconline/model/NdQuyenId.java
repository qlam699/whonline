package com.donglam.webhoconline.model;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class NdQuyenId implements Serializable{

	private static final long serialVersionUID = 1L;
	@ManyToOne
	private NguoiDung nguoidung;
	@ManyToOne
	private Quyen quyen;
    
    public NdQuyenId() {}

	public NdQuyenId(NguoiDung nd, Quyen quyen) {
		super();
		this.nguoidung = nd;
		this.quyen = quyen;
	}

	
	public NguoiDung getNd() {
		return nguoidung;
	}

	public void setNd(NguoiDung nd) {
		this.nguoidung = nd;
	}

	public Quyen getQuyen() {
		return quyen;
	}

	public void setQuyen(Quyen quyen) {
		this.quyen = quyen;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NdQuyenId that = (NdQuyenId) o;
        if (nguoidung != null ? !nguoidung.equals(that.nguoidung) : that.nguoidung != null) return false;
        if (quyen != null ? !quyen.equals(that.quyen) : that.quyen != null)
            return false;
        return true;
    }
 
    @Override
    public int hashCode() {
    	int result;
        result = (nguoidung != null ? nguoidung.hashCode() : 0);
        result = 31 * result + (quyen != null ? quyen.hashCode() : 0);
        return result;
    }
}
