package com.demo.model;

import java.io.Serializable;

public class ProductVO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String productname;
	private String producttype;
	@Override
	public String toString() {
		return "ProductVO [id=" + id + ", productname=" + productname + ", producttype=" + producttype + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProducttype() {
		return producttype;
	}
	public void setProducttype(String producttype) {
		this.producttype = producttype;
	}
	

}
