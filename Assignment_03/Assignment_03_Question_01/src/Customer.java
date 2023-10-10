import java.util.*;
public class Customer {
	int acc_no;
	int balance;
	int totalItems;
	int totalCredits;
	int creditLimit;
	
	Scanner sc = new Scanner(System.in);
	
	public void accept()
	{
		System.out.print("Enter account number : ");
		acc_no = sc.nextInt();
		System.out.print("Enter balance : ");
		balance = sc.nextInt();
		System.out.print("Enter Item Total : ");
		totalItems = sc.nextInt();
		System.out.print("Enter total credits : ");
		totalCredits = sc.nextInt();
		System.out.print("Enter credit limit : ");
		creditLimit = sc.nextInt();
	}
	
	
	public void newBalance()
	{	
		int newBalance = 0;
		newBalance = balance+totalItems-totalCredits;
		if(newBalance > creditLimit)
		{
			System.out.println("Credit Limit Exceeded");
		}
		else
		{
			System.out.println("New Balance : " + newBalance);
		}
		
	}
		
}
