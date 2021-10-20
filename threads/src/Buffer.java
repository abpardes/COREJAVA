
public class Buffer {
	private int data;
	private boolean flag = false;
	
	public synchronized int getData() {
		while(!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		flag = false;
		notify();
		return data;
	}
	
	public synchronized void setData(int data) {
		while(flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.data = data;
		flag = true;
		notify();
	}
	
	
}
