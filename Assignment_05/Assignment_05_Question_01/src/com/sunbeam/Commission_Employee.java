package com.sunbeam;

import java.util.Scanner;

public class Commission_Employee extends Employee {
	private int grossSales;
	private double commissionRate;
	
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void acceptData()
	{
		super.acceptData();
		System.out.print("Enter gross sales : ");
		this.grossSales = sc.nextInt();
		System.out.print("Enter Commission Rate : ");
		this.commissionRate = sc.nextDouble();		
		
	}
	@Override
	public void calculateTotalSalary() {
		double totalSalary = 0;
		totalSalary = this.commissionRate*this.grossSales;
		System.out.print("Total Salary : "+ totalSalary);
	}
	@Override
	public String toString() {
		return "Commission_Employee [grossSales=" + grossSales + ", commissionRate=" + commissionRate + " , " + super.toString() + "]";
	}
	
	
}
