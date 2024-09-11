package com.hexaware.maven.com.hexaware.springanno;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext(ProductConfigFile.class);

		Cart c1 = (Cart) anno.getBean("cart1");
		Product p1 = c1.getProduct();
//		System.out.println(p1.toString());
		System.out.println(c1.toString());

		anno.close();
	}
}
