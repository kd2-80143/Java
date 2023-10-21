package com.sunbeam;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Tester {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try(FileWriter fw = new FileWriter("file1.txt")) {
			try (BufferedWriter bw = new BufferedWriter(fw)) {
				System.out.println("Start entering sentences : ");
				for(int i = 1; i <= 4; i++)
				{
					String line = sc.nextLine();
					bw.write(line);
					bw.newLine(); // adds \n in file
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	
		System.out.println("File Saved");
	}

}
