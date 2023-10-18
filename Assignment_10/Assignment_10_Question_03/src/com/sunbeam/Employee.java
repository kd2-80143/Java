package com.sunbeam;

import java.util.Objects;
import java.util.Scanner;

public class Employee {
	private int empno;
	private double salary;
	private String name;
	
	public Employee()
	{
		this(0,0,"");
	}
	public Employee(int empno, double salary, String name) {
		this.empno = empno;
		this.salary = salary;
		this.name = name;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	Scanner sc = new Scanner(System.in);
	public void acceptData()
	{
		System.out.println("Enter Employee Number ");
		empno = sc.nextInt();
		System.out.println("Enter Employee Salary ");
		salary = sc.nextDouble();
		System.out.println("Enter Employee Name ");
		name = sc.next();
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", salary=" + salary + ", name=" + name + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (obj instanceof Employee)
		{
			Employee other = (Employee) obj;
			if(this.empno == other.empno)
				return true;
		}
		return false;
	}
	
	
	
	
}
