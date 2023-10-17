package com.sunbeam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Tester {
	
	static int menu()
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("****************************************************");
		System.out.println("1. Add new book in list");
		System.out.println("2. Display all books in forward order");
		System.out.println("3. Delete book at given index");
		System.out.println("4. Check if book with given isbn is in list or not");
		System.out.println("5. Delete all books in list");
		System.out.println("6. Display number of books in list");
		System.out.println("7. Sort all books by price in desc order");
		System.out.println("****************************************************");
		System.out.print("Enter your choice : ");
		choice = sc.nextInt();
		return choice;
		
	}
	public static void main(String[] args) {
		List<BookDetails> list = new ArrayList<BookDetails>();
		int ch;
		int index;
		BookDetails b = null;
		Scanner sc1 = new Scanner(System.in);
		
		while((ch=menu())!=0)
		{
			switch(ch)
			{
			case 1: 
				b = new BookDetails();
				b.acceptData();
				list.add(b);
			break;
			case 2:
				for(BookDetails bd: list )
					bd.displayData();
			break;
			case 3:
				System.out.println("Enter index ");
				index = sc1.nextInt();
				list.remove(index);
			break;
			case 4:
				System.out.println("Enter isbn : ");
				String isbn = sc1.next();
				BookDetails key = new BookDetails();
				key.setIsbn(isbn);
				if(list.contains(key))
				{
					System.out.println("Found");
				}
				else
				{
					System.out.println("Not Found");
				}
			break;
			case 5:
				list.clear();
				
			break;
			case 6:
				System.out.println("Number of books : " + list.size());
				
			break;
			case 7:
				class BooksPriceComparator implements Comparator<BookDetails>
				{

					@Override
					public int compare(BookDetails b1, BookDetails b2) {
						int diff = - Double.compare(b1.getPrice(), b2.getPrice());
						return diff;
					}
					
				}
				BooksPriceComparator bpc = new BooksPriceComparator();
				list.sort(bpc);
				for(BookDetails ele:list)
				{
					System.out.println(ele.price);
				}
			break;
			default:
				System.out.println("Enter correct choice");
			}
		}
		System.out.println("Thank you for using our application");
	}

}
