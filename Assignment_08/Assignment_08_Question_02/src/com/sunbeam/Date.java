package com.sunbeam;

import java.util.Scanner;

public class Date implements Displayable {
	private int day;
	private int month;
	private int year;
	Scanner sc = new Scanner(System.in);
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public void accept()
	{
		System.out.println("Enter day : ");
		this.day = sc.nextInt();
		System.out.println("Enter month : ");
		this.month = sc.nextInt();
		System.out.println("Enter year : ");
		this.year = sc.nextInt();
	}
	@Override
	public void show() {
		System.out.println("Date : " + day + "/" + month + "/" + year);
		
	}
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
	
	
}
