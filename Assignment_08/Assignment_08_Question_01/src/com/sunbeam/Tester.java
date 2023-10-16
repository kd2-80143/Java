package com.sunbeam;

class Box<T extends Employee>{
	private T obj;
	public void set(T val)
	{
		this.obj = val;
	}
	public T get()
	{
		return this.obj;
	}
	public double getTotalSalary()
	{
		return obj.calculateTotalSalary();	
	}
}
public class Tester {

	public static void main(String[] args) {
		
		Manager m = new Manager();
		m.acceptData();
		m.displayData();
		
		Box<Manager> b1 = new Box<>();
		b1.set(m);
		System.out.println("Manager Total Salary : " + b1.getTotalSalary());
		
		Salesman s = new Salesman();
		s.acceptData();
		s.displayData();
		Box<Employee> b2 = new Box<>();
		b2.set(s);
		System.out.println("Salesman Salary :" +b2.getTotalSalary());
		
	}

}
