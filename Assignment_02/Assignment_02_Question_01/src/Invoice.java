import java.util.*;
public class Invoice {

	String part_number;
	String part_desc;
	int quantity;
	double price_per_item;
	
	public Invoice() {
		this.part_number = "";
		this.part_desc= "";
		this.quantity= 0;
		this.price_per_item=0.0;
	}
	
	
	public Invoice(String part_number, String part_desc, int quantity, double price_per_item) {
		this.part_number = part_number;
		this.part_desc = part_desc;
		this.quantity = quantity;
		this.price_per_item = price_per_item;
	}


	public String getPart_number() {
		return part_number;
	}


	public void setPart_number(String part_number) {
		this.part_number = part_number;
	}


	public String getPart_desc() {
		return part_desc;
	}


	public void setPart_desc(String part_desc) {
		this.part_desc = part_desc;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public double getPrice_per_item() {
		return price_per_item;
	}


	public void setPrice_per_item(double price_per_item) {
		this.price_per_item = price_per_item;
	}
	
	Scanner sc = new Scanner(System.in);
	public void accept()
	{
		System.out.println("Enter part number ");
		part_number = sc.next();
		System.out.println("Enter part description ");
		part_desc = sc.next();
		System.out.println("Enter quantity ");
		quantity =  sc.nextInt();
		System.out.println("Enter Price of the item ");
		price_per_item = sc.nextDouble();
		
	}
	
	public double calculateInvoice()
	{
		double inv_amt = 0;
		if(quantity < 0)
		{
			this.setQuantity(0);
		}
		if(price_per_item < 0)
		{
			this.setPrice_per_item(0.0);
		}
		else
		{
			inv_amt = quantity*price_per_item;
		}
		return inv_amt;
	}
	public void display()
	{
		double result = calculateInvoice();
		System.out.println("Total Invoice : " + result);
	}
	
	

}
