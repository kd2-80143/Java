
public class Pattern02 {
	public static void main(String[] args) {
		for(int i=0; i < 5; i++)
		{
			for(int j=9-i; j > i ; j--)
			{
				System.out.print(" ");
			}
			for(int j = 0; j <2*i+1; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=4; i >= 1; i--)
		{
			for(int j=11-i; j > i ; j--)
			{
				System.out.print(" ");
			}
			for(int j = 0; j <2*i-1; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
