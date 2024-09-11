package com.java.Student.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.java.Connect.DataConnect;
import com.java.Model.Student;

public class IStudentDao {

	Connection con;
	PreparedStatement stat;

	public IStudentDao() {
		con = DataConnect.getConnect();

	}

	public void insert(Student s) {
		try {
			stat = con.prepareStatement("insert into student values(?,?,?)");
			stat.setInt(1, s.getRollno());
			stat.setString(2, s.getName());
			stat.setDouble(3, s.getFee());

			stat.executeUpdate();
			System.out.println("Inserted.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void remove(int roll) {
		try {
			stat = con.prepareStatement("delete from student where rollno=?");
			stat.setInt(1, roll);
			int k = stat.executeUpdate();
			if (k > 0) {
				System.out.println("Removed.");
			} else {
				System.out.println("Not Removed! Please give valid Data.");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void showAll() {
		try {
			stat = con.prepareStatement("select * from student");
			ResultSet rs = stat.executeQuery();

			while (rs.next()) {
				System.out.println("---------------------------------------------");
				System.out.println("Student Roll Number :" + rs.getInt((1)));
				System.out.println("Student Name :" + rs.getString((2)));
				System.out.println("Student Fee Amount :" + rs.getDouble((3)));
			}
			System.out.println("---------------------------------------------");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void update(int roll, double fee) {
		try {
			stat = con.prepareStatement("update student set fee = ? where rollno = ?");
			stat.setDouble(1, fee);
			stat.setInt(2, roll);
			int k = stat.executeUpdate();
			if (k > 0) {
				System.out.println("Updated.");
			} else {
				System.out.println("Not Updated! Please give valid Data.");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
