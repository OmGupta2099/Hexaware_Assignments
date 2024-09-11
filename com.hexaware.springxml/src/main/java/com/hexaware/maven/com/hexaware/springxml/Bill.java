package com.hexaware.maven.com.hexaware.springxml;

public class Bill {
	int gst;
	int discount;

	public int getGst() {
		return gst;
	}

	public void setGst(int gst) {
		this.gst = gst;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return ", gst = " + gst + ", discount = " + discount;
	}
}
