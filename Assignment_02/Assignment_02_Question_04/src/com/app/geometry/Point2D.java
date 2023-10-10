package com.app.geometry;

import java.util.Scanner;

import java.lang.Math;

public class Point2D {
	int x_axis;
	int y_axis;
	
	public Point2D(int x_axis, int y_axis, int p1, int p2)
	{
		this.x_axis = x_axis;
		this.y_axis = y_axis;
		
	}
	public Point2D()
	{
		this.x_axis = 0;
		this.y_axis = 0;
	}
	
	public String getDetails()
	{
		String s1 = Integer.toString(x_axis);
		String s2 = Integer.toString(y_axis);
		String result = "("+s1+","+s2+")";
		return result;
	}
	
	public boolean isEqual(Point2D point) 
	{
		if(this.x_axis==point.x_axis && this.y_axis==point.y_axis)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	Scanner sc = new Scanner(System.in);
	public void accept()
	{
		System.out.print("Enter x axis : ");
		x_axis = sc.nextInt();
		System.out.print("Enter y axis : ");
		y_axis = sc.nextInt();
	}
	
	public void calculateDistance(Point2D point)
	{
		double result;
		if(isEqual(point)==false)
		{
			result = Math.sqrt(Math.pow(point.x_axis - x_axis, 2) + Math.pow(point.y_axis - y_axis, 2));
			System.out.println("Distance between two points : " + result);
		}
	}
	
}
