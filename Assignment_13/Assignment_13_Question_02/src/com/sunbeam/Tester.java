package com.sunbeam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Tester {
	
	static int menu()
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("****************************************************");
		System.out.println("1. Add new book in list if not present, if present increment it's quantity");
		System.out.println("2. Display all books in forward order using random access");
		System.out.println("3. Search a book with given isbn");
		System.out.println("4. Delete book at given index");
		System.out.println("5. Delete a book with given isbn");
		System.out.println("6. Reverse the list");
		System.out.println("7. Save books in file");
		System.out.println("8. Load books in file");
		System.out.println("****************************************************");
		System.out.print("Enter your choice : ");
		choice = sc.nextInt();
		return choice;
		
	}

	
	public static void main(String[] args) {
		List<Books> list = new ArrayList<Books>();
		int ch;
		int index;
		Books b=null;
		Scanner sc1 = new Scanner(System.in);
		
		while((ch=menu())!=0)
		{
			switch(ch)
			{
			case 1:
				if(b==null)
				{
					b = new Books();
					b.acceptData();
					list.add(b);
				}
				else
				{
					
					System.out.println("Enter isbn to check whether book is present or not : ");
					String isbn = sc1.nextLine();
					Books key = new Books();
					key.setIsbn(isbn);
					if(list.contains(key))
					{
						if(list.contains(b))
						{
///							int ind = b.getQuantity()+1;
///							b.setQuantity(ind);
							b.setQuantity(b.getQuantity()+1);
							System.out.println("Quantity increased");
						}
					}
					else
					{
						System.out.println("Adding book");
						b = new Books();
						b.acceptData();
						list.add(b);
					}
				}
				
			break;
			case 2:
				Iterator<Books> itr = list.iterator();
				while(itr.hasNext())
				{
					Books b1 =itr.next();
					System.out.println(b1);
				}
					
			break;
			case 3:
				System.out.println("Enter isbn to search :");
				String isbn3 = sc1.next();
				Books key3 = new Books();
				key3.setIsbn(isbn3);
				int index3 = list.indexOf(key3);
				if(index3==-1)
				{
					System.out.println("Book not found");
				}
				else
				{
					System.out.println("Book found");
				}
				
			break;
			case 4:
				System.out.println("Enter index ");
				index = sc1.nextInt();
				
				list.remove(index);
			break;
			case 5:
				System.out.println("Enter isbn to delete :");
				String isbn = sc1.next();
				Books key2 = new Books();
				key2.setIsbn(isbn);
				if(list.contains(key2))
				{
					list.remove(key2);
					System.out.println("Removed successfully");
				}
				
			break;
			case 6:
				Collections.reverse(list);
				for(Books bd : list)
				{
					bd.displayData();
				}
				
			break;
			case 7:
				try(FileOutputStream fout = new FileOutputStream("books03.txt")){
					try(ObjectOutputStream oout = new ObjectOutputStream(fout)) {
							oout.writeObject(list);
						
					} //oout.close
				} //fout.close
				catch(IOException e)
				{
					
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				System.out.println("Books Saved");
			break;
			case 8:
				List<Books> list1=new ArrayList<Books>() ;
				try(FileInputStream fin = new FileInputStream("books03.txt")) {
					try(ObjectInputStream oin = new ObjectInputStream(fin)) {
						System.out.println("Hello");
						list1 = (List <Books>) oin.readObject();
						System.out.println("Hello fegr");
						list1.forEach(bk -> System.out.println(bk));
						
					} //din.close()
				} //fin.close()
				catch(IOException e)
				{
					
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				System.out.println("Book loaded");
			break;
			default:
				System.out.println("Enter correct choice");
			}
		}
		System.out.println("Thank you for using our application");
	}

}
