package com.app.fruits;

public class Apple extends Fruit{

	public Apple()
	{
		this("",0.0,true);
	}
	
	public Apple(String color, double weight, boolean isFresh )
	{
		super("Apple",color,weight,isFresh);
		
	}
	@Override
	public void AcceptData() {
		System.out.println("Apple Details : ");
		super.AcceptData();
	}

	@Override
	public String taste() {
		
		return "sweet n sour";
	}
	
	
	
	
	
}
