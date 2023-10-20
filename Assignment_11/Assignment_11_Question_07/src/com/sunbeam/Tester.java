package com.sunbeam;

interface Emp
{
	double getSal();
	default double calcIncentives() {
		return 0.0;
	}
	static double calcTotalIncome(Emp arr[]) {
		double totalSalary = 0.0;
		for(Emp e : arr)
			totalSalary += e.getSal() + e.calcIncentives(); 
		return totalSalary;
	}
}

class Manager implements Emp
{
	private double basicSalary;
	private double dearanceAllowance;
	
	
	public Manager(double basicSalary, double dearanceAllowance) {
		this.basicSalary = basicSalary;
		this.dearanceAllowance = dearanceAllowance;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getDearanceAllowance() {
		return dearanceAllowance;
	}

	public void setDearanceAllowance(double dearanceAllowance) {
		this.dearanceAllowance = dearanceAllowance;
	}

	@Override
	public double getSal() {
		return basicSalary+dearanceAllowance;
	}
	
	public double calcIncentives()
	{
		return 0.2* basicSalary;
	}
	
}

class Labor implements Emp
{
	private double hrs;
	private double rate;

	
	public Labor(double hrs, double rate) {
		this.hrs = hrs;
		this.rate = rate;
	}

	public double getHrs() {
		return hrs;
	}

	public void setHrs(double hrs) {
		this.hrs = hrs;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	public double getSal() {
		
		return hrs*rate;
	}
	
	public double calcIncentives()
	{
		if(hrs>300)
			return 0.5 * hrs * rate;
		return 0.0;
		
	}
	
}

class Clerk implements Emp
{
	private double salary;
	
	
	public Clerk(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public double getSal() {
		return salary;
	}
	
}



class Tester {

	public static void main(String[] args) {
		Emp[] arr = new Emp[3];
		arr[0] = new Manager(10000,2000);
		arr[1] = new Clerk(5000);
		arr[2] = new Labor(20,200);
		
		double totalIncome = Emp.calcTotalIncome(arr);
		System.out.println("Total Income of all employee : " +totalIncome);

	}

}
