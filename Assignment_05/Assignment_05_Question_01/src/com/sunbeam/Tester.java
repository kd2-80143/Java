package com.sunbeam;

public class Tester {

	public static void main(String[] args) {
		Employee e1;
//		e1 = new Salaried_Employee();
//		e1.acceptData();
//		System.out.println(e1);
//		e1.calculateTotalSalary();
		
//		e1 = new Hourly_Employee();
//		e1.acceptData();
//		System.out.println(e1);
//		e1.calculateTotalSalary();
		
//		e1 = new Commission_Employee();
//		e1.acceptData();
//		System.out.println(e1);
//		e1.calculateTotalSalary();
		
		e1 = new BasePlus_Commission_Employee();
		e1.acceptData();
		System.out.println(e1);
		e1.calculateTotalSalary();

	}

}
