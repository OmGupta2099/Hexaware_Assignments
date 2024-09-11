package com.hexaware.maven.com.hexaware.springxml;

public class Nutrients {

	int protien;
	int calories;
	int fat;

	public Nutrients(int protien, int calories, int fat) {
		super();
		this.protien = protien;
		this.calories = calories;
		this.fat = fat;
	}

	public int getProtien() {
		return protien;
	}

	public void setProtien(int protien) {
		this.protien = protien;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public int getFat() {
		return fat;
	}

	public void setFat(int fat) {
		this.fat = fat;
	}

	@Override
	public String toString() {
		return "Protien = " + protien + ", calories = " + calories + ", fat = " + fat;
	}
}
