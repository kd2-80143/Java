package com.sunbeam;

import java.util.HashMap;
import java.util.LinkedHashMap;
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
		Map<Integer, Student> map = new LinkedHashMap<>();
		int ch;
		Scanner sc1 = new Scanner(System.in);
		while((ch=menu())!=0)
		{
			switch(ch)
			{
			case 1:
				Student bd = new Student();
				System.out.println("Enter student details");
				bd.acceptStudent();
				map.put(bd.getRollno(), bd);
				
				bd = new Student();
				System.out.println("Enter student details");
				bd.acceptStudent();
				map.put(bd.getRollno(), bd);
				
				bd = new Student();
				System.out.println("Enter student details");
				bd.acceptStudent();
				map.put(bd.getRollno(), bd);
				
				bd = new Student ();
				System.out.println("Enter student details");
				bd.acceptStudent();
				map.put(bd.getRollno(), bd);
				
				bd = new Student();
				System.out.println("Enter student details");
				bd.acceptStudent();
				map.put(bd.getRollno(), bd);
				
			break;
			case 2:
				System.out.println("Enter rollno to search ");
				Integer rollno = sc1.nextInt();
				Student find = map.get(rollno);
				if(find==null)
				{
					System.out.println("Student not found");
				}
				else
				{
					System.out.println("Student found: " + find);
				}
			break;
			case 3:
				Set<Entry<Integer,Student>> entries = map.entrySet();
				for(Entry<Integer,Student> entry : entries)
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
