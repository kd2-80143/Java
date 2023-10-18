package com.sunbeam;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Tester {
	static int menu()
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("*****************************************************");
		System.out.println("0. Exit");
		System.out.println("1. Add Employee");
		System.out.println("2. Delete Employee");
		System.out.println("3. Find Employee");
		System.out.println("4. Sort Employee");
		System.out.println("5. Edit/Update Employee");
		System.out.println("*****************************************************");
		System.out.print("Enter your choice : ");
		choice = sc.nextInt();
		return choice;
		
	}
	public static void main(String[] args) {
		List<Employee> list = new LinkedList<>();
		Scanner sc1 = new Scanner(System.in);
		int ch;
		Employee emp=null;
		while((ch=menu())!=0)
		{
			switch(ch)
			{
			case 1:
				list.add(new Employee(101,1000,"Madhur"));
				list.add(new Employee(102,2000,"Yash"));
				list.add(new Employee(103,3000,"Abhay"));
				list.add(new Employee(104,4000,"Vidit"));
				list.add(new Employee(105,5000,"Ayush"));
			break;
			case 2:
				
				System.out.println("Enter empid to delete");
				int empno = sc1.nextInt();
				Employee key = new Employee();
				key.setEmpno(empno);
				if(list.contains(key))
				{
					list.remove(key);
					System.out.println("Employee removed at index");
				}
				else
				{
					System.out.println("No employee found");
				}
				
				
			break;
			case 3:

				System.out.println("Enter empid to search");
				int empid = sc1.nextInt();
				Employee key2 = new Employee();
				key2.setEmpno(empid);
				if(list.contains(key2))
				{
					int x=list.indexOf(key2);
					System.out.println(list.get(x));

//					if(list.contains(emp))
//					{
//						System.out.println(emp.toString());
//					}
				}
				else
				{
					System.out.println("Cannot find employee");
				}	
			break;
			case 4:
				class EmployeeSort implements Comparator<Employee>{

					@Override
					public int compare(Employee e1, Employee e2) {
						int diff = e1.getName().compareTo(e2.getName());
						return diff;
					}
					
				}
				EmployeeSort es = new EmployeeSort();
				list.sort(es);
				for(Employee e1:list)
				{
					System.out.println(e1.toString());
				}
			break;
			case 5:
				System.out.println("Enter emp id to be modified: ");
				int id = sc1.nextInt();
				Employee key3 = new Employee();
				key3.setEmpno(id);;
				int index = list.indexOf(key3);
				if(index == -1)
				    System.out.println("Employee not found.");
				else {
				    Employee oldEmp = list.get(index);
				    System.out.println("Employee Found: " + oldEmp);
				    System.out.println("Enter new information for the Employee");
				    Employee newEmp = new Employee();
				    newEmp.acceptData();
				    list.set(index, newEmp);
				}
			break;
			default:
				System.out.println("Enter correct choice");
			break;
			
			}
		}
		System.out.println("Thankyou for using our application");
	}

}
