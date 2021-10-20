
public class Consumer extends Thread {
	Buffer buffer;

	public Consumer(Buffer buffer) {
		this.buffer = buffer;
	}
	
	@Override
	public void run() {
		for(int i = 1; i < 10; i++) {
			try {
				Thread.sleep((long)(Math.random() * 2000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Consumer : " + buffer.getData());
		}
	}
}
