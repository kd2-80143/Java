package com.app.fruits;

public class Mango extends Fruit{
	
	public Mango()
	{
		this("",0.0,true);
	}
	
	public Mango(String color, double weight, boolean isFresh )
	{
		super("Mango",color,weight,isFresh);
		
	}
	@Override
	public void AcceptData() {
		System.out.println("Mango Details : ");
		super.AcceptData();
	}

	@Override
	public String taste() {
		return "sweet";
	}

	
}
