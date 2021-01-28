// to make a job for the thread implement runnable interface

class MyRunnable implements Runnable{ // this class contain the job which thread will eventually implements
	public void run(){
		go();
	}
	public void go(){
		doMore();
	} 
	public void doMore(){
		System.out.println("top of the stack");
	}

}

public class ThreadTester{
	public static void main(String[] args){
		Runnable threadJob = new MyRunnable();
		Thread myThread = new Thread(threadJob);
		myThread.start(); // the new thread of excutation will not start until we use start method
		System.out.println("back in pain");
	}

}