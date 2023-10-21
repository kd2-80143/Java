import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Tester {

	public static void main(String[] args) {
		try(FileReader fr = new FileReader("file2.txt")) {
			try(BufferedReader br = new BufferedReader(fr)) {
				String line;
					while((line = br.readLine())!=null) {
						System.out.println(line);
					}		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		} 
		catch (FileNotFoundException e1) {
		} 
		catch (IOException e1) {
		}
	}
}
