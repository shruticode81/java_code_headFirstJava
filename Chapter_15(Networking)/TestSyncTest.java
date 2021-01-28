//lost update problem we have two thead both trying to increment the balance

class TestSync implements Runnable{ 
	private int balance;
	public void run(){
		for(int i=0;i<50;i++){
			increment();
			System.out.println("balance is"+ balance);
		}
	}
	public synchronized void increment(){
		int i= balance;
		balance=i+1;
	}

}

public class TestSyncTest{
	public static void main(String[] args){
		TestSync job = new TestSync();
		Thread a = new Thread(job);
		Thread b = new Thread(job);
		a.start();
		b.start(); // it calls run() method to be implemented in runnable class
	}
}