package com.donglam.webhoconline.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class NDTNId implements Serializable{

	private static final long serialVersionUID = 1L;

	@Column(name = "nguoigui")
    private String nguoigui;
 
    @Column(name = "nguoinhan")
    private String nguoinhan;
    
    public NDTNId() {}
	
	public NDTNId(String nguoigui, String nguoinhan) {
		super();
		this.nguoigui = nguoigui;
		this.nguoinhan = nguoinhan;
	}

	public String getNguoigui() {
		return nguoigui;
	}

	public void setNguoigui(String nguoigui) {
		this.nguoigui = nguoigui;
	}

	public String getNguoinhan() {
		return nguoinhan;
	}

	public void setNguoinhan(String nguoinhan) {
		this.nguoinhan = nguoinhan;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NDTNId)) return false;
        NDTNId that = (NDTNId) o;
        return Objects.equals(getNguoigui(), that.getNguoigui()) &&
                Objects.equals(getNguoinhan(), that.getNguoinhan());
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(getNguoigui(), getNguoinhan());
    }
}
