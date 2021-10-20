
public class Account {
	private double balance;

	public Account(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		try {
			Thread.sleep((long)(Math.random() * 2000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return balance;
	}

	private void setBalance(double balance) {
		try {
			Thread.sleep((long)(Math.random() * 2000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.balance = balance;
	}
	
	public synchronized void deposit(String name, double amt) {
		System.out.println(name + " trying to deposit");
		System.out.println(name  + " getting balance");
		double bal = getBalance();
		System.out.println(name + " got balance : " + bal);
		bal += amt;
		System.out.println(name + " setting balance : " + bal);
		setBalance(bal);
//		notifyAll();
	}
	
	public synchronized void withdraw(String name, double amt) {
		System.out.println(name + " trying to withdraw");
		int count = 0;
		while(getBalance() < amt) {
			if( count >= 2) {
				return;
			}
			count++;
			System.out.println("Insufficient Balance!!");
			try {
				wait(5000); // release a lock
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(name  + " getting balance");
		double bal = getBalance();
		System.out.println(name + " got balance : " + bal);
		bal -= amt;
		System.out.println(name + " setting balance : " + bal);
		setBalance(bal);
	}
	
}
