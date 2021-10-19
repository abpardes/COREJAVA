//java.lang.StackOverflowError
public class Error1Example {

	public static void main(String[] args) {
		System.out.println("Start!!!");
			doTask();
		System.out.println("End!!!");
	}

	private static void doTask() {
		System.out.println("task done");
		doTask(); // recursive without exit condition
	}
	
	
}
