package com.sunbeam;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Tester {

	public static void main(String[] args) {
		Set<BookDetails> book = new TreeSet<BookDetails>();
		book.add(new BookDetails("101",110.0,"Madhur",20));
		book.add(new BookDetails("210",90.0,"Yash",10));
		book.add(new BookDetails("110",120.0,"Abhay",15));
		book.add(new BookDetails("201",60.0,"Ayush",12));
		book.add(new BookDetails("305",50.0,"Vidit",5));
		book.add(new BookDetails("101",50.0,"Saurabh",10));
		//we have used the natural ordering here comparable is used
		//TreeSet uses only comparable (not equals and hashcode) to sort 
		//sorting is done on comparable logic here it is isbn
		
		
		//traverse in forward order
		Iterator<BookDetails > itr = book.iterator();
		while(itr.hasNext())
		{
			BookDetails b1 = itr.next();
			System.out.println(b1);
		}

	}

}
