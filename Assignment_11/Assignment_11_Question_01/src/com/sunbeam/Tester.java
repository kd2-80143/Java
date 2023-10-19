package com.sunbeam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Tester {

	public static void main(String[] args) {
		Set<BookDetails> book = new HashSet<BookDetails>();
		book.add(new BookDetails("101",110.0,"Madhur",20));
		book.add(new BookDetails("210",90.0,"Yash",10));
		book.add(new BookDetails("110",120.0,"Abhay",15));
		book.add(new BookDetails("201",60.0,"Ayush",12));
		book.add(new BookDetails("305",50.0,"Vidit",5));
		book.add(new BookDetails("101",50.0,"Saurabh",10)); //book gets added (duplicate value as per isbn)
		//when there is no hashcode method over-ridden, duplicate values are allowed
		//right now the data is stored as per 	qhashcode (not random)
		
		//once hashcode is added in the class, duplicate values are gone.
		
		//traverse in forward order
		Iterator<BookDetails > itr = book.iterator();
		while(itr.hasNext())
		{
			BookDetails b1 = itr.next();
			System.out.println(b1);
		}

	}

}
