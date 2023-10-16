package com.sunbeam;

public class Manager extends Employee {
	private double bonus;
	
	public Manager()
	{
		this(0);
	}
	public Manager(double bonus) {
		super();
		this.bonus = bonus;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	@Override
	public void acceptData()
	{
		super.acceptData();
		System.out.println("Enter bonus : ");
		this.bonus = sc.nextDouble();
	}
	@Override
	public void displayData()
	{
		super.displayData();
		System.out.println("Manager Bonus : " + bonus);
	}
	public double calculateTotalSalary()
	{
		double TS = this.getSal() + this.bonus;
		//System.out.println("Total Salary : " + TS);
		return TS;
	}
}
