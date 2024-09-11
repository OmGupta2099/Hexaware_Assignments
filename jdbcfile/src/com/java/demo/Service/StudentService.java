package com.java.demo.Service;

import java.util.Scanner;

import com.java.Model.Student;
import com.java.Student.Dao.IStudentDao;

public class StudentService {

	Scanner sc;
	IStudentDao dao;

	public StudentService() {

		sc = new Scanner(System.in);
		dao = new IStudentDao();

	}

	public void addData() {
		Student s = new Student();
		System.out.println("Enter Roll Number: ");
		s.setRollno(sc.nextInt());

		System.out.println("Enter Name: ");
		sc.nextLine();
		s.setName(sc.nextLine());

		System.out.println("Enter Fee Amount: ");
		s.setFee(sc.nextDouble());

		dao.insert(s);
	}

	public void removeData() {
		System.out.println("Enter Roll Number to Remove: ");
		int roll = (sc.nextInt());

		dao.remove(roll);

	}

	public void showAllData() {
		dao.showAll();
	}

	public void updateData() {
		System.out.println("Enter Roll Number to Update: ");
		int roll = sc.nextInt();

		System.out.println("Enter New Fee Amount: ");
		sc.nextLine();
		double fee = sc.nextDouble();

		dao.update(roll, fee);
	}
}
