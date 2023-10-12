package com.sunbeam;

import java.util.Scanner;

public class BasePlus_Commission_Employee extends Employee {

	private int grossSales;
	private double commissionRate;
	private double baseSalary;
	
	Scanner sc = new Scanner(System.in);
	public void acceptData()
	{
		super.acceptData();
		System.out.print("Enter Gross Sales : ");
		this.grossSales = sc.nextInt();
		System.out.print("Enter Commission Rate : ");
		this.commissionRate = sc.nextDouble();
		System.out.print("Enter Base Salary : ");
		this.baseSalary = sc.nextDouble();
	}
	@Override
	public void calculateTotalSalary() {
		double totalSalary = 0;
		totalSalary = (this.commissionRate * this.grossSales) + this.baseSalary*1.1;
		System.out.println("Total Salary : " + totalSalary);
	}
	@Override
	public String toString() {
		return "BasePlus_Commission_Employee [grossSales=" + grossSales + ", commissionRate=" + commissionRate
				+ ", baseSalary=" + baseSalary + " , " + super.toString() + "]";
	}
	
	

}
