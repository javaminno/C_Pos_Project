package com.javaGG.C_Pos_Project.dto;

import java.sql.Date;

public class Dto {	
	private int num;
	private String quantity;
	private String product;
	private String cpdate;
	private String price;
	
	public Dto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dto(int num, String quantity, String product, String cpdate, String price) {
		super();
		this.num = num;
		this.quantity = quantity;
		this.product = product;
		this.cpdate = cpdate;
		this.price = price;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getCpdate() {
		return cpdate;
	}

	public void setCpdate(String cpdate) {
		this.cpdate = cpdate;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}	
	
}
