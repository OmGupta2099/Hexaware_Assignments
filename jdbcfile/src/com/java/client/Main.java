package com.java.client;

import java.util.Scanner;

import com.java.demo.Service.StudentService;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentService ser = new StudentService();
		while (true) {
			System.out.println("1.)             Add Student.");
			System.out.println("2.)             Remove Student.");
			System.out.println("3.)             Show All Student.");
			System.out.println("4.)             Update Fee of Student.");
			System.out.println("Enter Your Choice: ");
			int ch = sc.nextInt();
			if (ch == 1) {
				System.out.println("Add Student:");
				ser.addData();
			} else if (ch == 2) {
				System.out.println("Remove Student:");
				ser.removeData();
			} else if (ch == 3) {
				System.out.println("All Data in the Table Student:");
				ser.showAllData();
			} else if (ch == 4) {
				System.out.println("Update Fee of Student:");
				ser.updateData();
			} else {
				break;
			}
		}
	}
}
