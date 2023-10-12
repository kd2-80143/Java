package com.app.fruits;

public class Orange extends Fruit {

	public Orange()
	{
		this("",0.0,true);
	}
	
	public Orange(String color, double weight, boolean isFresh )
	{
		super("Orange",color,weight,isFresh);
		
	}
	@Override
	public void AcceptData() {
		System.out.println("Orange Details : ");
		super.AcceptData();
	}

	@Override
	public String taste() {
		return "sour";
	}
	
	

}
