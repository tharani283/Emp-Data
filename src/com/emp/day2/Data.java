package com.emp.day2;

import java.util.Scanner;

public class Data {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter employee ID");
		
		int ID = sc.nextInt();
		
		System.out.println("Enter name");
		
		String name = sc.next();
		
		System.out.println("Enter mail ID");
		
		String mail_ID = sc.next();
		
		System.out.println("Enter mobile no");
		
		long mobno = sc.nextLong();
		
		System.out.println("Enter Salary");
		
		double salary = sc.nextDouble();
		
		System.out.println("Enter Gender");
		
		String gender = sc.next();
		
		System.out.println("Enter city");
		
		String city = sc.next();
		
		System.out.println("Emp ID: " + ID);
		System.out.println("Emp Name: " + name);
		System.out.println("Emp Mail ID: " + mail_ID);
		System.out.println("Emp Mob no: " + mobno);
		System.out.println("Emp Salary: " + salary);
		
		System.out.println("Emp Gender: " + gender);

		System.out.println("Emp City: " + city);
		
		
		
		
	}

}
