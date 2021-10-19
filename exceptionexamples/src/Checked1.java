import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Checked1 {

	public static void main(String[] args) {
		System.out.println("Hi!!!");
		doTask();
		System.out.println("Bye!!");
	}

	private static void doTask() {
		try {
			FileInputStream fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
