package com.sunbeam;

import java.util.Scanner;

public class Hourly_Employee extends Employee {
	private double wage;
	private int hours;
	
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void acceptData()
	{
		super.acceptData();
		System.out.print("Enter wages : ");
		this.wage = sc.nextDouble();
		System.out.print("Enter hours : ");
		this.hours = sc.nextInt();
		
	}
	
	
	@Override
	public void calculateTotalSalary() {
		double totalSalary = 0;
		if(hours <= 40)
		{
			totalSalary = this.hours*this.wage;
			System.out.println("Total Salary : " + totalSalary);
		}
		else if (hours > 40)
		{
			totalSalary = 40*this.wage + (this.hours - 40)*this.wage*1.5;
			System.out.println("Total Salary : " + totalSalary);
		}
	}


	@Override
	public String toString() {
		return "Hourly_Employee [wage=" + wage + ", hours=" + hours + " , " + super.toString() + "]";
	}
	
	
	
	
	
}
