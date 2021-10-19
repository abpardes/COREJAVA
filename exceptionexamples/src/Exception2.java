import java.lang.Thread.UncaughtExceptionHandler;

public class Exception2 {

	public static void main(String[] args) {
		
		Thread.setDefaultUncaughtExceptionHandler(new UncaughtExceptionHandler() {
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println("Boom :-( " + e.getMessage());
			}
		});
		
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
