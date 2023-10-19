package com.sunbeam;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Tester {

	public static void main(String[] args) {
		
		//we have used the natural ordering here comparable is used
		//TreeSet uses only comparable (not equals and hashcode) to sort 
		//sorting is done on comparable logic here it is isbn
		
		class PriceComparator implements Comparator<BookDetails>
		{

			@Override
			public int compare(BookDetails b1, BookDetails b2) {
				int diff = - Double.compare(b1.getPrice(), b2.getPrice()); 
				return diff;
			}
			
		}
		
		PriceComparator pc = new PriceComparator();
		
		TreeSet<BookDetails> book = new TreeSet<BookDetails>(pc);
		book.add(new BookDetails("101",110.0,"Madhur",20));
		book.add(new BookDetails("210",90.0,"Yash",10));
		book.add(new BookDetails("110",120.0,"Abhay",15));
		book.add(new BookDetails("201",60.0,"Ayush",12));
		book.add(new BookDetails("305",120.0,"Vidit",5));
		book.add(new BookDetails("101",50.0,"Saurabh",10));
		
		//traverse in forward order
		System.out.println("Traverse Set using Iterator");
		Iterator<BookDetails> itr = book.iterator();
		while(itr.hasNext())
		{
			BookDetails b3 = itr.next();
			System.out.println(b3);
		}

		System.out.println("Traverse Set using Descending Iterator");
		//descending Iterator is a method of Navigable Interface hence TreeSet reference is used
		Iterator<BookDetails> itr1 = book.descendingIterator();
		while(itr1.hasNext())
		{
			BookDetails b4 = itr1.next();
			System.out.println(b4);
		}
		
		
	}

}
