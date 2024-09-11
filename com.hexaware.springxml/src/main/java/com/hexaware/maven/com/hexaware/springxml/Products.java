package com.hexaware.maven.com.hexaware.springxml;

public class Products {

	int code;
	String itemName;
	double price;

	Bill bill;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Bill getBill() {
		return bill;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
	}

	@Override
	public String toString() {
		return "Product code = " + code + ", item Name = " + itemName + ", price = " + price + bill;
	}
}
