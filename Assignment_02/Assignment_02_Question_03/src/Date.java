import java.util.*;
public class Date 
{
	int month;
	int day;
	int year;
	
	public Date(int day, int month, int year)
	{
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	public Date()
	{
		this.month = 0;
		this.day = 0;
		this.year = 0;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void acceptDate()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter day : ");
		day = sc.nextInt();
		System.out.println("Enter month : ");
		month = sc.nextInt();
		System.out.println("Enter year : ");
		year = sc.nextInt();
	}
	
	public void displayDate()
	{
		System.out.println("Date : " + day + "/" + month + "/" + year);
	}
}
