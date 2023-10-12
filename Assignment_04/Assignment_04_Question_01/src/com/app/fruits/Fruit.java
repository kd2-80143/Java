package com.app.fruits;

import java.util.Scanner;

public class Fruit {
	private String name;
	private String color;
	private double weight;
	private boolean isFresh;
	
	public Fruit() {
		this.name = "";
		this.color = "";
		this.weight = 0;
		this.isFresh = true;
	}
	
	public Fruit(String name, String color, double weight, boolean isFresh) {
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.isFresh = isFresh;
	}


	Scanner sc = new Scanner(System.in);
	public void AcceptData()
	{
		System.out.println("Enter the color of fruit : ");
		color = sc.next();
		System.out.println("Enter the weight of fruit : ");
		weight = sc.nextDouble();
		System.out.println("is the fruit fresh? :");
		isFresh = sc.nextBoolean();
	}
	
	public String taste()
	{
		return "no specific taste";
	}
	

	@Override
	public String toString() {
		String str; 
		if(isFresh)
			str="fresh";
		else
			str="stale";
		return "Fruit [name=" + name + ", color=" + color + ", weight=" + weight + ", Fruit is=" + str + "]";
	}

	public String getName() {
		return name;
	}
	

	public String getColor() {
		return color;
	}

	public double getWeight() {
		return weight;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	
	
//	public void setName(String name) {
//		this.name = name;
//	}
	
}
