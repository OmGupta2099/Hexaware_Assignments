package com.hexaware.maven.com.hexaware.springxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		Nutrients n1 = (Nutrients) context.getBean("nut1");
		System.out.println(n1.toString());
//		Products p1 = (Products) context.getBean("item1");
//		System.out.println(p1.toString());
//		Products p2 = (Products) context.getBean("item2");
//		System.out.println(p2.toString());
	}
}
