import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tester {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Madhur");
		list.add("Abhay");
		list.add("Yash");
		list.add("Vidit");
		list.add("Ayush");
		
		String c = Collections.max(list);
		String d = Collections.min(list);
		System.out.println(c);
		System.out.println(d);
		
		

	}

}
