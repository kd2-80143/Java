package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPointArray1 {

	static int menu()
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("****************************");
		System.out.println("0. EXIT");
		System.out.println("1. Display details of specific point : ");
		System.out.println("2. Display x, y co-ordinates of all points : ");
		System.out.println("3. Input 2 indices, validate them");
		System.out.println("****************************");
		System.out.print("Enter your choice ");
		choice = sc.nextInt();
		//sc.close();
		return choice;
	
	}
	public static void main(String[] args) {
		int n;
		//int x,y;
		System.out.println("Enter the size : ");
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
	
		Point2D [] points = new Point2D[n];
		for(int i = 0; i < n; i++)
		{
			System.out.println("Input points for " +(i+1));
//2nd Way   System.out.println("Enter the co-ordinates for x_axis ");
//			x=sc1.nextInt();
//			System.out.println("Enter the co-ordinates for y_axis ");
//			y=sc1.nextInt();
			
			points[i] = new Point2D();
			points[i].accept();
		}
		int ch;
		
		while((ch=menu())!=0)
		{
			switch(ch)
			{
				case 1:
					int choice1;
					System.out.println("Enter the index ");
					choice1 = scanner.nextInt();
					if(choice1>=0 && choice1<points.length)
					{
						System.out.println("Display x and y co-ordinates : " +points[choice1].getDetails());
					}
					else
					{
						System.out.println("Invalid Index, Please retry ");
					}
				break;
				case 2:
					for(Point2D point:points)
						System.out.println("All co-ordinates at" +point.getDetails());	
				break;
				case 3:
					int index1;
					int index2;
					System.out.println("Enter first index : ");
					index1 = scanner.nextInt();
					System.out.println("Enter last index : ");
					index2 = scanner.nextInt();
					if((index1>=0 && index1<points.length) && (index2>=0 && index2<points.length))
					{
//						if(!points[index1].isEqual(points[index2]))
//						{
//							points[index1].calculateDistance(points[index2]);
//						}
						points[index1].calculateDistance(points[index2]);
					}
					
				break;
				default:
					System.out.println("Enter correct choice ");
				break;
			}
		}
		System.out.println("Thank you for using our application ");
		//sc1.close();
	}
	

}
