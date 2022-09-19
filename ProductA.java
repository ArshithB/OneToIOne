package com.one.one;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class ProductA {
	@Id
	@Column(name ="productId")
	private int pOne;
	private String pName;
	private String pDes;
	
	@OneToOne
	@JoinColumn(name="p_id")
	private MyOrder myorder;
	
	
	public ProductA(int pOne, String pName, String pDes) {
		super();
		this.pOne = pOne;
		this.pName = pName;
		this.pDes = pDes;
	}
	public ProductA() {
		super();
	}
	public int getpOne() {
		return pOne;
	}
	public void setpOne(int pOne) {
		this.pOne = pOne;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpDes() {
		return pDes;
	}
	public void setpDes(String pDes) {
		this.pDes = pDes;
	}
}
