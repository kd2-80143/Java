package com.sunbeam;

public class Salesman extends Employee {
	private double comm;
	public Salesman()
	{
		this(0);
	}
	public Salesman(double comm)
	{
		this.comm = comm;
	}
	public double getComm() {
		return comm;
	}
	public void setComm(double comm) 
	{
		this.comm = comm;
	}
	@Override
	public void acceptData()
	{
		super.acceptData();
		System.out.println("Enter commission : ");
		this.comm = sc.nextDouble();
	}
	@Override
	public void displayData()
	{
		super.displayData();
		System.out.println("Salesman Commission :" + comm);
		
	}
	public double calculateTotalSalary()
	{
		double TS;
		TS = this.getSal()+this.comm;
		//System.out.println("Total Salary : " + TS);
		return TS;
	}
}
