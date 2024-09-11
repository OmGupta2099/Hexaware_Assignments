package com.hexaware.maven.com.hexaware.springanno;

import org.springframework.beans.factory.annotation.Autowired;

public class Cart {

	int qty;
	double totalBill;

	@Autowired
	Product product;

	public Cart(int qty, double totalBill, Product product) {
		super();
		this.qty = qty;
		this.totalBill = totalBill;
		this.product = product;
	}

	public Cart() {
		// TODO Auto-generated constructor stub
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getTotalBill() {
		return totalBill;
	}

	public void setTotalBill(double totalBill) {
		this.totalBill = totalBill;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	void starting() {
		System.out.println("Starting...");
	}

	void finishing() {
		System.out.println("Finished...");
	}

	@Override
	public String toString() {
		return product + ", Cart qty = " + qty + ", total Bill = " + totalBill;
	}
}
