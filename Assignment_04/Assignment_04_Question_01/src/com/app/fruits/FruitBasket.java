package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {

	public static int menu()
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("*********************************");
		System.out.println("1. Add Mango ");
		System.out.println("2. Add Orange ");
		System.out.println("3. Add Apple ");
		System.out.println("4. Display names of all fruits ");
		System.out.println("5. Display name,color,weight , taste of all fresh fruits , in the basket.");
		System.out.println("6. Display tastes of all stale(not fresh) fruits in the basket.");
		System.out.println("7. Mark a fruit as stale");
		System.out.println("8. Mark all sour fruits stale (optional)");
		System.out.println("*********************************");
		System.out.print("Enter your choice ");
		choice = sc.nextInt();
		return choice;
	}
	public static void main(String[] args) {
		int choice;
		int size;
		int index=0;
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the size of basket ");
		size = sc1.nextInt();
		Fruit[] basket =  new Fruit[size];
		while((choice=menu())!=0)
		{
			switch(choice)
			{
			case 1:
				if(index>=0 && index<basket.length)
				{
					basket[index] = new Mango();
					basket[index].AcceptData();
					index++;
				}
				else
				{
					System.out.println("Array is full, cannot add Mango");
				}
			break;
			case 2:
				if(index>0 && index<basket.length)
				{
					basket[index] = new Orange();
					basket[index].AcceptData();
					index++;
				}
				else
				{
					System.out.println("Array is full, cannot add Orange");
				}
			break;
			case 3:
				if(index>0 && index<basket.length)
				{
					basket[index] = new Apple();
					basket[index].AcceptData();
					index++;
				}
				else
				{
					System.out.println("Array is full, cannot add Apple");
				}
			break;
			case 4:
				for(Fruit fb:basket)
				{
					if(fb!=null)
					{
						System.out.println("Name of the fruit : "+ fb.getName());
					}
				}
			break;
			case 5:
				for(Fruit fb:basket)
				{
					if(fb!=null)
					{
						//System.out.println(fb.toString());
						if(fb.isFresh())
						{
						System.out.println("Name of the fruit : "+ fb.getName());
						System.out.println("Color of the fruit : "+ fb.getColor());
						System.out.println("Weight of the fruit : "+ fb.getWeight());
						System.out.println("Taste of the fruit :" + fb.taste());
						
						
						}
						//System.out.println("Is the fruit fresh :" +fb.isFresh());
					}
					
				}
			break;
			case 6:
				for(Fruit fb:basket)
				{
					if(fb.isFresh()==false)
					{
						System.out.println("Taste of the fruit :" + fb.taste());
					}
				}
			break;
			case 7:
				int index1;
				System.out.println("Enter the index ");
				index1 = sc1.nextInt();
				if(index1>=0 && index1<basket.length)
				{
					basket[index1].setFresh(false);
					System.out.println("Marked as stale");
				}
				else
				{
					System.out.println("Invalid index ");
				}
			break;
			case 8:
				for(Fruit fb:basket)
				{
					if(fb.taste()=="sour")
					{
						fb.setFresh(false);	
						System.out.println("Marked all sour taste fruits stale");
					}
				}
			default:
				System.out.println("Enter correct choice ");
			break;
			}
				
		}
		System.out.println("Thank you for using our application");
	}
}
