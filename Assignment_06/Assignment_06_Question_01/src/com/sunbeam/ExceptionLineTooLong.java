package com.sunbeam;

public class ExceptionLineTooLong extends Exception {

	private String st;
	public ExceptionLineTooLong(String st) {
		this.st = st;
	}
	@Override
	public String toString() {
		return "ExceptionLineTooLong [st=" + st + "]";
	}
	
	

}
