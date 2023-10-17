package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

class CompareStudent implements Comparator<Student>
{

	@Override
	public int compare(Student s1, Student s2) {
		int diff = - s1.getCity().compareTo(s2.getCity());
		if(diff == 0)
		{
			diff = - Double.compare(s1.getMarks(), s2.getMarks());
		}
		if(diff == 0)
		{
			diff = s1.getName().compareTo(s2.getName());
		}
			
		return diff;
		
	}
	
}
public class Tester {

	public static void main(String[] args) {
		Student[] student = new Student[10];
		student[0] = new Student(101,"Madhur","Noida",80);
		student[1] = new Student(102,"Yash","Noida",70);
		student[2] = new Student(103,"Vidit","Delhi",90);
		student[3] = new Student(104,"Sid","Noida",80);
		student[4] = new Student(105,"Abhay","Bengaluru",60);
		student[5] = new Student(106,"Saurabh","Noida",50);
		student[6] = new Student(107,"Madhur","Noida",80);
		student[7] = new Student(108,"Abhay","Bengaluru",60);
		student[8] = new Student(109,"Ayush","Ghaziabad",100);
		student[9] = new Student(110,"Vidit","Delhi",90);
		
		CompareStudent cs = new CompareStudent();
		Arrays.sort(student,cs);
		
		for(Student s :student)
		{
			System.out.println(s);
		}
		

	}

}
