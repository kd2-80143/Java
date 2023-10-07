import java.util.Scanner;

public class Restaurant {
	
	public static int menu()
	{
		int choice;
		System.out.println("**************************");
		System.out.println("0. EXIT");
		System.out.println("1. Dosa Price 20/-");
		System.out.println("2. Samosa Price 10/-");
		System.out.println("3. Idli Price 25/-");
		System.out.println("4. Dhokla Price 100/-");
		System.out.println("5. Burger Price 70/-");
		System.out.println("6. Pizza Price 250/-");
		System.out.println("7. Wada Pav Price 20/-");
		System.out.println("8. Chole Bhature Price 80/-");
		System.out.println("9. Raj Kachori Price 90/-");
		System.out.println("10. Generate Bill");
		System.out.println("**************************");
		System.out.print("Enter your choice ");
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		return choice;
	
		
	}

	public static void main(String[] args) {
		
		int ch;
		Scanner sc = new Scanner(System.in);
		
		int total_bill = 0;
		while((ch=menu())!=0)
		{
			
			switch(ch)
			{
				case 1:
				{	
					int ds_ct;
					int dosa_price = 20;
					System.out.print("Enter the quantity of Dosa : ");
					ds_ct = sc.nextInt(); 
					total_bill = ds_ct*dosa_price + total_bill;
				}
				break;
				case 2:
				{
					int sm_ct;
					int samosa_price = 10;
					System.out.print("Enter the quantity of Samosa : ");
					sm_ct = sc.nextInt(); 
					total_bill = sm_ct*samosa_price + total_bill;
				}
				break;
				case 3:
				{
					int id_ct;
					int idli_price = 25;
					System.out.print("Enter the quantity of Idli : ");
					id_ct = sc.nextInt(); 
					total_bill = id_ct*idli_price + total_bill;
				}
				break;
				case 4:
				{
					int dh_ct;
					int dhokla_price = 100;
					System.out.print("Enter the quantity of Dhokla : ");
					dh_ct = sc.nextInt(); 
					total_bill = dh_ct*dhokla_price + total_bill;
				}
				break;
				case 5:
				{
					int bu_ct;
					int burger_price = 70;
					System.out.print("Enter the quantity of Burger : ");
					bu_ct = sc.nextInt(); 
					total_bill = bu_ct*burger_price + total_bill;
				}
				break;
				case 6:
				{
					int pi_ct;
					int pizza_price = 250;
					System.out.print("Enter the quantity of Pizza : ");
					pi_ct = sc.nextInt(); 
					total_bill = pi_ct*pizza_price + total_bill;
				}
				break;
				case 7:
				{
					int wp_ct;
					int wadapav_price = 20;
					System.out.print("Enter the quantity of Wada Pav : ");
					wp_ct = sc.nextInt(); 
					total_bill = wp_ct*wadapav_price + total_bill;
				}
				break;
				case 8:
				{
					int cb_ct;
					int cholebhature_price = 80;
					System.out.print("Enter the quantity of Chole Bhature : ");
					cb_ct = sc.nextInt(); 
					total_bill = cb_ct*cholebhature_price + total_bill;
				}
				break;
				case 9:
				{
					int rj_ct;
					int rajkachori_price = 90;
					System.out.print("Enter the quantity of Raj Kachori : ");
					rj_ct = sc.nextInt(); 
					total_bill = rj_ct*rajkachori_price + total_bill;
				}
				break;
				case 10:
					System.out.println("Total Bill : " + total_bill);
				break;
				default:
					System.out.println("Enter correct choice ");
				break;
			
				
			}
		}
		System.out.println("Thank you for using our application");

		

	}

}
