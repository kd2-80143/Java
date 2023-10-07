import java.util.Scanner;

public class IntegerConversion {

	public static void main(String[] args) {
		int num1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number ");
		num1 = sc.nextInt();
		System.out.println("Binary Equivalent " + Integer.toBinaryString(num1));
		System.out.println("Octal Equivalent " + Integer.toOctalString(num1));
		System.out.println("Hexadecimal Equivalent " + Integer.toHexString(num1));
		
		//System.out.println("Number : " + num1);
		sc.close();
	}

}