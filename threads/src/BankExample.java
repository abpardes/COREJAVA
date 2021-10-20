
public class BankExample {

	public static void main(String[] args) {
		Account acc = new Account(5000);
		TransactionThread t1 = new TransactionThread(acc, "Sita", TransactionType.CREDIT, 2500);
		TransactionThread t2 = new TransactionThread(acc, "\tGeetha", TransactionType.DEBIT, 2000);
		TransactionThread t3 = new TransactionThread(acc, "\t\tRaj", TransactionType.CREDIT, 3000);
		
		t1.start();
		t2.start();
		t3.start();
		
		//Barrier ==> join() makes caller thread to wait for other threads to finish execution
		try {
			t1.join(5000);
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Balance : " + acc.getBalance()); // Final Balance
	}

}
