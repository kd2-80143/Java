package com.sunbeam;

import java.util.Scanner;

public class Readsu {
	Scanner sc = new Scanner(System.in);
	String xy;
	public void accept() throws ExceptionLineTooLong {
		System.out.println("Enter a string : ");
		xy = sc.nextLine();
		if(xy.length() > 80)
		{
			throw new ExceptionLineTooLong("The string is too long");
		}
	}
	@Override
	public String toString() {
		if(xy.length() < 80)
			return "Readsu [xy=" + xy + "]";
		return "";
	}
	
	
}
