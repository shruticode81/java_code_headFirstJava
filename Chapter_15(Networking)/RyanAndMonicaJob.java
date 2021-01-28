//tHE rYAN AND MONICA EXAMPLE

class BankAccount{
	private int balance = 100; // the account starts with a balance of 100
	public int getBalance(){
		return balance;
	}
	public void withdraw(int amount){
		balance = balance-amount;
	}
}

public class RyanAndMonicaJob implements Runnable{
	private BankAccount account = new BankAccount(); //making instance of class bankaccount both thread will access same bankaccount
	public static void main(String[] args){
		RyanAndMonicaJob theJob = new RyanAndMonicaJob(); //instance of runnable (job)
		Thread one = new Thread(theJob); //make 2 threads giving each thread the same runnable job.that means both thread will access the one account instance variable in the runnable class.
		Thread two = new Thread(theJob);
		one.setName("Ryan");
		two.setName("Monica");
		one.start();
		two.start();
	}
	public void run(){
		for(int x = 0;x<10;x++){
			makeWithdrawal(10);
			if(account.getBalance()<0){
				System.out.println("Overdrawn!");
			}
		}
	}

	private void makeWithdrawal(int amount){
		if(account.getBalance()>=amount){
			System.out.println(Thread.currentThread().getName()+" is about to withdraw");
			try{
				System.out.println(Thread.currentThread().getName()+" is going to sleep");
				Thread.sleep(500); //in millisec

			}catch(InterruptedException ex){
				ex.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" woke up.");
			account.withdraw(amount);
			System.out.println(Thread.currentThread().getName()+" completes the withdrawl");
		}else{
			System.out.println("sorry not enough for "+ Thread.currentThread().getName());
		}
	} 

}