package tester;
import com.app.geometry.Point2D;
public class TestPoint {

	public static void main(String[] args) {
		//accept function
		Point2D pd = new Point2D();
		pd.accept();
		Point2D pd2 = new Point2D();
		pd2.accept();
		
		//get details 
		String res = pd.getDetails();
		System.out.println(res);
		
		String res1 = pd2.getDetails();
		System.out.println(res1);
		
		//is equal
		boolean result = pd.isEqual(pd2);
		System.out.println(result);
		
		pd.calculateDistance(pd2);
	}

}
