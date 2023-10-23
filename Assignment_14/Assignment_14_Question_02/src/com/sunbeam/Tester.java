package com.sunbeam;

import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

public class Tester {

	static Date parseDate(String str) {
		try
		{
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			java.util.Date uDate = sdf.parse(str);
			return new Date(uDate.getTime());
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		
	}
	static int menu() {
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("****************************************");
		System.out.println("0. Exit");
		System.out.println("1. Add New User");
		System.out.println("2. Delete Given User");
		System.out.println("3. Update User");
		System.out.println("4. Get All Candidates");
		System.out.println("****************************************");
		System.out.println("Enter your choice ");
		choice = sc.nextInt();
		return choice;
		
	}
	public static void main(String[] args) {
		int ch;
		Scanner sc = new Scanner(System.in);
		while((ch=menu())!=0)
		{
			switch(ch)
			{
			case 1:
				try(UserDAO dao = new UserDAO()) {
					System.out.println("Enter first name :");
					String firstname = sc.next();
					System.out.println("Enter last name :");
					String lastname = sc.next();
					System.out.println("Enter email :");
					String email = sc.next();
					System.out.println("Enter password :");
					String passwd = sc.next();
					System.out.println("Enter dob :");
					String dob = sc.next();
					int cnt = dao.addUser(new User(0,firstname,lastname,email,passwd,dob,false,""));
					System.out.println("Rows inserted : " + cnt);
				} 
				catch (Exception e) {
					e.printStackTrace();
				}
			break;
			case 2:
				try(UserDAO dao = new UserDAO()) {
					System.out.println("Enter User ID to delete");
					int userId = sc.nextInt();
					int cnt = dao.deleteById(userId);
					System.out.println("Rows deleted : " +cnt);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			break;
			case 3:
				try(UserDAO dao = new UserDAO()) {
					System.out.println("Enter user id to update");
					int id2 = sc.nextInt();
					System.out.println("Enter first name : ");
					String fname = sc.next();
					System.out.println("Enter last name : ");
					String lname = sc.next();
					System.out.println("Enter email : ");
					String email = sc.next();
					System.out.println("Enter password : ");
					String pass = sc.next();
					System.out.println("Enter dob :");
					String dob = sc.next();
					int cnt = dao.updateById(new User(id2,fname,lname,email,pass,dob,false,""));
					System.out.println("Rows Updated : " + cnt);
					
				} 
				catch (Exception e) {
					e.printStackTrace();
				}
			break;
			case 4:
				try(UserDAO dao = new UserDAO()) 
				{
					List<User> list = dao.displayAllUsers();
					list.forEach(s->System.out.println(s));
				} 
				catch (Exception e) {
					e.printStackTrace();
				}
			break;
			default:
				System.out.println("Enter correct choice");
			break;
			
			}
		}
		System.out.println("Thank you for using our application");
		
	}

}
