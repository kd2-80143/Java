package com.sunbeam;

public class Program01 {

	public static void main(String[] args) {
		Readsu rs = new Readsu();
		
		try {
			rs.accept();
		} 
		catch (ExceptionLineTooLong e) {
			e.printStackTrace();
		}
		System.out.println(rs);
	}

}
