import java.util.Scanner;

public class Car {
	int total_miles;
	int cost;
	int avg_miles;
	int park_fees;
	int tolls;
	public Car(int total_miles, int cost, int avg_miles, int park_fees, int tolls) {
		this.total_miles = total_miles;
		this.cost = cost;
		this.avg_miles = avg_miles;
		this.park_fees = park_fees;
		this.tolls = tolls;
	}
	public Car() {
		this.total_miles = 0;
		this.cost = 0;
		this.avg_miles = 0;
		this.park_fees = 0;
		this.tolls = 0;
	}
	Scanner sc = new Scanner(System.in);
	public void accept()
	{
		System.out.print("Enter total miles : ");
		total_miles = sc.nextInt();
		System.out.print("Enter cost per gallon of gasoline : ");
		cost = sc.nextInt();
		System.out.print("Enter avg miles per gallon : ");
		avg_miles = sc.nextInt();
		System.out.print("Enter parking fees per day : ");
		park_fees = sc.nextInt();
		System.out.print("Enter tolls per day : ");
		tolls = sc.nextInt();
	}
	
	public void display()
	{
		int total_cost = 0;
		int xyz = total_miles/avg_miles;
		total_cost = xyz*cost + park_fees + tolls;
		System.out.println("Total Cost to User : " + total_cost);
	}
	
	
	
}
