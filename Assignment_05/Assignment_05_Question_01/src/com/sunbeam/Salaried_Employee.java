package com.sunbeam;

import java.util.Scanner;

public class Salaried_Employee extends Employee {
	private double weeklySalary;
	
	
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void acceptData()
	{	
		super.acceptData();
		System.out.print("Enter weekly salary : ");
		this.weeklySalary = sc.nextDouble();
	}
	@Override
	public void calculateTotalSalary() {
		System.out.print("Total Salary : "+ this.weeklySalary);
	}
	@Override
	public String toString() {
		return "Salaried_Employee [weeklySalary=" + weeklySalary + " , " + super.toString() + "]";
	}
	
	

}
