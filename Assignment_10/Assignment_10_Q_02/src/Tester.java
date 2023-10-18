import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Tester {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Madhur");
		list.add("Abhay");
		list.add("Yash");
		list.add("Vidit");
		list.add("Ayush");
		list.add("Swarnima");
		
		String c = Collections.max(list, Comparator.comparingInt(String::length));
		System.out.println("String with highest length : " + c);
		
		//String d = Collections.min(list, Comparator.comparingInt(String::length));
		//System.out.println(d);
		
		

	}

}
