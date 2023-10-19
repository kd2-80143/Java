package com.sunbeam;
import java.util.Objects;
import java.util.Scanner;

public class BookDetails implements Comparable<BookDetails>{
	String isbn;
	double price;
	String authorName;
	int quantity;
	public BookDetails()
	{
		this("",0,"",0);
	}
	public BookDetails(String isbn, double price, String authorName, int quantity) {
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	Scanner sc = new Scanner(System.in);
	public void acceptData()
	{
		System.out.println("Enter isbn : ");
		isbn = sc.next();
		System.out.println("Enter price :");
		price = sc.nextDouble();
		System.out.println("Enter Author Name :");
		authorName = sc.next();
		System.out.println("Enter quantity :");
		quantity = sc.nextInt();
	}
	public void displayData()
	{
		System.out.println("isbn " + isbn);
		System.out.println("Price " + price);
		System.out.println("Author Name " + authorName);
		System.out.println("Quantity " + quantity);
		System.out.println();
	}
	
	public int hashCode()
	{
		int hash = Objects.hash(this.isbn) ;
		return hash;
		
	}
	
	
	
	
//	@Override
//	public int hashCode() {
//		return Objects.hash(authorName, isbn, price, quantity);
//	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (obj instanceof BookDetails)
		{
			BookDetails other = (BookDetails) obj;
			if(Objects.equals(this.isbn, other.isbn)) //this.isbn == other.isbn
			{
				return true;
			}
		}
		return false;
	}
	@Override
	public String toString() {
		return "BookDetails [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity="
				+ quantity + "]";
	}
	@Override
	public int compareTo(BookDetails b1) {
		int diff = this.isbn.compareTo(b1.isbn);
		return diff;
	}
	
	
}

