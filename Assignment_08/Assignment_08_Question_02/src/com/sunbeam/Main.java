package com.sunbeam;

class Box<T> {
	private T obj;
	public T get()
	{
		return this.obj;
	}
	public void set(T val)
	{
		this.obj = val;
	}
}
public class Main {
	public static void printDisplayableBox(Box<? extends Displayable> b)
	{
		b.get().show();
	}
	public static void printAnyBox(Box<?> b) {
		System.out.println(b.get().toString());
	}
	public static void main(String[] args) {
		Box<Person> p1 = new Box<>();
		p1.set(new Person("Madhur", 27));
		printDisplayableBox(p1);
		
		Box<Date> d1 = new Box<>();
		d1.set(new Date(01,01,2023));
		printDisplayableBox(d1);
		
		Box<String> s1 = new Box<>();
		s1.set("Hello");
		//printDisplayableBox(s1); // compile time error
		
		printAnyBox(s1);
		printAnyBox(p1);
		printAnyBox(d1);
 	}

}
