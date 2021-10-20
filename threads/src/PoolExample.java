import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PoolExample {

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(2);
		service.submit(new NumberThread(1, 100));
		service.submit(new NumberThread(101, 300));
		service.submit(new NumberThread(301, 500));
		service.submit(new NumberThread(501, 1000));
		service.submit(new NumberThread(1000, 1200));
		
		
		service.shutdown(); // after this it can't take any new requests
	}

}
