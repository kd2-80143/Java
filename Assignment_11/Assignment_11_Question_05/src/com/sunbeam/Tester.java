package com.sunbeam;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Tester {

	static int menu()
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("**************************");
		System.out.println("0. Exit");
		System.out.println("1. Insert in Map");
		System.out.println("2. Find in Map");
		System.out.println("3. Display key and values together");
		System.out.println("**************************");
		System.out.print("Enter your choice ");
		choice = sc.nextInt();
		return choice;
		
	}
	public static void main(String[] args) {
		Map<String, BookDetails> map = new HashMap<>();
		int ch;
		Scanner sc1 = new Scanner(System.in);
		while((ch=menu())!=0)
		{
			switch(ch)
			{
			case 1:
				BookDetails bd = new BookDetails("101",20.0,"Madhur",5);
				map.put(bd.getIsbn(), bd);
				bd = new BookDetails("110",40.0,"Abhay",10);
				map.put(bd.getIsbn(), bd);
				bd = new BookDetails("104",30.0,"Yash",8);
				map.put(bd.getIsbn(), bd);
				bd = new BookDetails("201",50.0,"Ayush",12);
				map.put(bd.getIsbn(), bd);
				bd = new BookDetails("120",80.0,"Abhay",9);
				map.put(bd.getIsbn(), bd);
				
			break;
			case 2:
				System.out.println("Enter isbn to search ");
				String isbn = sc1.next();
				BookDetails find = map.get(isbn);
				if(find==null)
				{
					System.out.println("Book not found");
				}
				else
				{
					System.out.println("Book found: " + find);
				}
			break;
			case 3:
				Set<Entry<String,BookDetails>> entries = map.entrySet();
				for(Entry<String,BookDetails> entry:entries)
				{
					System.out.println(entry.getKey() + "--->" + entry.getValue());
				}
			break;
			default:
				System.out.println("Enter correct choice ");
			break;
				
			}
		}
		System.out.println("Thank you for using our application");
//NO NEED TO OVER-RIDE equals and hashcode in BookDetails as key is of String class and that's already over-ridden the two methods
	}

}
