package com.hexaware.maven.com.hexaware.springanno;

import org.springframework.context.annotation.Bean;

public class ProductConfigFile {

	@Bean(name = "cart1", initMethod = "starting", destroyMethod = "finishing")
	public Cart getCart1() {
		Cart bill1 = new Cart();
		bill1.setQty(2);
		bill1.setTotalBill(401.8);
		return bill1;
	}

	@Bean(name = "item1")
	public Product getProduct1() {
		Product item1 = new Product();
		item1.setName("Apple");
		item1.setPrice(200.9);
		return item1;
	}
}
