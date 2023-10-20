package com.sunbeam;

import java.util.Scanner;

@FunctionalInterface
interface Arithmetic {
	double calc(double a, double b);
}
public class Tester{
	
	static int menu()
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("******************");
		System.out.println("0. Exit");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		System.out.println("******************");
		System.out.print("Enter your choice : ");
		choice = sc.nextInt();
		return choice;
		
	}
	static void calculate(double num1, double num2, Arithmetic op)
	{
	    double result = op.calc(num1, num2);
	    System.out.println("Result: "+result);
	}
	public static void main(String[] args)
	{
		int ch;
		int num1;
		int num2;
		Scanner sc1 = new Scanner(System.in);
		while((ch=menu())!=0)
		{
			switch(ch)
			{
			case 1:
				System.out.println("Enter first number");
				num1 = sc1.nextInt();
				System.out.println("Enter second number");
				num2 = sc1.nextInt();
				calculate(num1,num2,(x,y) -> x+y);
			break;
			case 2:
				System.out.println("Enter first number");
				num1 = sc1.nextInt();
				System.out.println("Enter second number");
				num2 = sc1.nextInt();
				calculate(num1,num2,(x,y) -> x-y);
			break;
			case 3:
				System.out.println("Enter first number");
				num1 = sc1.nextInt();
				System.out.println("Enter second number");
				num2 = sc1.nextInt();
				calculate(num1,num2,(x,y) -> x*y);
			break;
			case 4:
				System.out.println("Enter first number");
				num1 = sc1.nextInt();
				System.out.println("Enter second number");
				num2 = sc1.nextInt();
				calculate(num1,num2,(x,y) -> x/y);
			break;
			default:
				System.out.println("Enter correct choice");
			}
		}
		System.out.println("Thank you for using our application");
		
	}
}
