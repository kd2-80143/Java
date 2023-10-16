package com.sunbeam;

import java.util.Scanner;

public class Person implements Displayable{
	
	private String name;
	private int age;
	Scanner sc = new Scanner(System.in);
	
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void accept()
	{
		System.out.println("Enter your name : ");
		this.name = sc.next();
		System.out.println("Enter age : ");
		this.age = sc.nextInt();
	}
	
	@Override
	public void show() {
		System.out.println("Name : " + name);
		System.out.println("Age : " +age);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	

}
