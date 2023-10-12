package com.sunbeam;

import java.util.Scanner;

abstract public class Employee {
	protected String firstName;
	protected String lastName;
	protected String SSN;
	
	abstract public void calculateTotalSalary();
	
	Scanner sc = new Scanner(System.in);
	public void acceptData()
	{
		System.out.print("Enter first name : ");
		firstName = sc.next();
		System.out.print("Enter last name : ");
		lastName = sc.next();
		System.out.print("Enter SSN number : ");
		SSN = sc.next();
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", SSN=" + SSN + "]";
	}
	

}

