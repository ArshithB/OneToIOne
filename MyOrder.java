package com.one.one;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class MyOrder {
	
	@Id
	@Column(name="OrderId")
	private int orId;
	private String orName;
	private String orDes;
	
	@OneToOne
	@JoinColumn(name = "o_id")
	private ProductA producta;

	public MyOrder(int orId, String orName, String orDes, ProductA producta) {
		super();
		this.orId = orId;
		this.orName = orName;
		this.orDes = orDes;
		this.producta = producta;
	}

	public MyOrder() {
		super();
	}

	public int getOrId() {
		return orId;
	}

	public void setOrId(int orId) {
		this.orId = orId;
	}

	public String getOrName() {
		return orName;
	}

	public void setOrName(String orName) {
		this.orName = orName;
	}

	public String getOrDes() {
		return orDes;
	}

	public void setOrDes(String orDes) {
		this.orDes = orDes;
	}

	public ProductA getProducta() {
		return producta;
	}

	public void setProducta(ProductA producta) {
		this.producta = producta;
	}
	
	
	
	

}
