package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Tester {
	
	static int menu()
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("****************************************************");
		System.out.println("1. Add new book in list if not present, if present increment it's quantity");
		System.out.println("2. Display all books in forward order using random access");
		System.out.println("3. Search a book with given isbn");
		System.out.println("4. Delete book at given index");
		System.out.println("5. Delete a book with given isbn");
		System.out.println("6. Reverse the list");
		System.out.println("****************************************************");
		System.out.print("Enter your choice : ");
		choice = sc.nextInt();
		return choice;
		
	}
	public static void main(String[] args) {
		List<BookDetails> list = new ArrayList<BookDetails>();
		int ch;
		int index;
		BookDetails b=null;
		Scanner sc1 = new Scanner(System.in);
		
		while((ch=menu())!=0)
		{
			switch(ch)
			{
			case 1:
				if(b==null)
				{
					b = new BookDetails();
					b.acceptData();
					list.add(b);
				}
				else
				{
					
					System.out.println("Enter isbn to check whether book is present or not : ");
					String isbn = sc1.nextLine();
					BookDetails key = new BookDetails();
					key.setIsbn(isbn);
					if(list.contains(key))
					{
						if(list.contains(b))
						{
///							int ind = b.getQuantity()+1;
///							b.setQuantity(ind);
							b.setQuantity(b.getQuantity()+1);
							System.out.println("Quantity increased");
						}
					}
					else
					{
						System.out.println("Adding book");
						b = new BookDetails();
						b.acceptData();
						list.add(b);
					}
				}
				
			break;
			case 2:
				Collections.shuffle(list);
				for(BookDetails bd: list )
					bd.displayData();
			break;
			case 3:
				System.out.println("Enter isbn to search :");
				String isbn3 = sc1.next();
				BookDetails key3 = new BookDetails();
				key3.setIsbn(isbn3);
				int index3 = list.indexOf(key3);
				if(index3==-1)
				{
					System.out.println("Book not found");
				}
				else
				{
					System.out.println("Book found");
				}
				
			break;
			case 4:
				System.out.println("Enter index ");
				index = sc1.nextInt();
				
				list.remove(index);
			break;
			case 5:
				System.out.println("Enter isbn to delete :");
				String isbn = sc1.next();
				BookDetails key2 = new BookDetails();
				key2.setIsbn(isbn);
				if(list.contains(key2))
				{
					list.remove(key2);
					System.out.println("Removed successfully");
				}
				
			break;
			case 6:
				Collections.reverse(list);
				for(BookDetails bd : list)
				{
					bd.displayData();
				}
				
			break;
			default:
				System.out.println("Enter correct choice");
			}
		}
		System.out.println("Thank you for using our application");
	}

}
