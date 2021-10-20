
public class ThreadExample {

	public static void main(String[] args) {
		System.out.println("Main starts !!!");
		NumberThread t1 = new NumberThread(1, 100);
		NumberThread t2 = new NumberThread(500, 800);
		NumberThread t3 = new NumberThread(1000, 1200);
		
		t1.start(); // Runnable or ready state
		t2.start();
		t3.start(); // main, t1, t2 and t3 are ready
		
		doTask();
		
		System.out.println("Main ends!!!");
	}

	private static void doTask() {
		Thread t = Thread.currentThread(); 
		System.out.println("Name : " + t.getName());
		System.out.println("Priority : " + t.getPriority()); // 1 [ LOW ] -- 10 [ HIGH ]
		System.out.println("Daemon :" + t.isDaemon());
		System.out.println("Group : " + t.getThreadGroup().getName()); // main and system [GC, ReferenceHandler, SignalDispatcher]
	}

}
