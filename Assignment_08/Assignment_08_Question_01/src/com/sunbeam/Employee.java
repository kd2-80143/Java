package com.sunbeam;

import java.util.Scanner;

public abstract class Employee extends Person {
	private int id;
	private double sal;
	
	Scanner sc = new Scanner(System.in);
	public Employee()
	{
		this(0,0);
	}
	public Employee(int id, float sal) {
		this.id = id;
		this.sal = sal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public void acceptData()
	{	
		super.acceptData();
		System.out.println("Enter employee id : ");
		this.id = sc.nextInt();
		System.out.println("Enter salary : ");
		this.sal = sc.nextDouble();
	}
	@Override
	public void displayData()
	{
		super.displayData();
		System.out.println("Employee id : " + id);
		//System.out.println("Employee salary : " + sal);
	}
	public abstract double calculateTotalSalary();
	
	
}


