import java.util.Scanner;

public class AverageofDoubleType {

	public static void main(String[] args) {
//		double num1;
//		double num2;
		
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.print("Enter two numbers ");	
		if(sc1.hasNextDouble() && sc2.hasNextDouble() && !sc1.hasNextInt() && !sc2.hasNextInt())
		{
			double num1 = sc1.nextDouble();
			double num2 = sc2.nextDouble();
			double num3 = (num1+num2)/2;
			System.out.println("Average of 2 numbers : "+ num3);
		}             
		else
		{
			System.out.println("Number is not of type double");
		}
			
		
		
		
		sc1.close();
		sc2.close();

	}

}
