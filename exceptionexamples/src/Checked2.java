import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Checked2 {

	public static void main(String[] args) {
		System.out.println("Hi!!!");
		
		try {
			doTask();
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		
		System.out.println("Bye!!");
	}

	private static void doTask() throws FileNotFoundException {
			FileInputStream fis = new FileInputStream("a.txt");
	}

}
