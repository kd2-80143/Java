import java.util.*;
public class Employee {
	String first_name;
	String last_name;
	double salary;
	
	public Employee(String first_name, String last_name, double salary)
	{
		this.first_name = first_name;
		this.last_name = last_name;
		this.salary = salary;
	}
	
	public Employee()
	{
		this.first_name="";
		this.last_name="";
		this.salary=0;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name : ");
		first_name = sc.nextLine();
		System.out.println("Enter last name : ");
		last_name = sc.nextLine();
		System.out.println("Enter monthly salary : ");
		salary = sc.nextDouble();
		if(salary < 0)
		{
			this.setSalary(0);
		}
		else 
		{
			this.setSalary(salary);
		}
	}
	
	public void display()
	{
		System.out.println("Yearly salary " +salary*12);
		increment();
		
	}
	
	public void increment()
	{
		double raise = 0.10;
		double ye_sal = salary*12 + salary*12*raise;
		System.out.println("Yearly salary after raise : " + ye_sal);
	}
}
