package com.sunbeam;

import java.util.Scanner;

public class Person {
	private String name;
	
	Scanner sc = new Scanner(System.in);
	public Person()
	{
		this("");
	}
	public Person(String name)
	{
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void acceptData()
	{
		System.out.println("Enter name : ");
		this.name = sc.next();
	}
	
	public void displayData()
	{
		System.out.println("Name : " + name);
	}
	
	
}
