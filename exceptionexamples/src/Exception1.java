
public class Exception1 {

	public static void main(String[] args) {
		System.out.println("Hi");
			doTask();
		System.out.println("Bye!!!");
	}

	private static void doTask() {
		int x = 10;
		int y = 0;
		int result = x / y;
		System.out.println(result);
	}

}
