//making and starting two thread 

public class RunThreads implements Runnable{
	public static void main(String[] args){
		RunThreads runner = new RunThreads(); //make one instance of runnable run method is written in runnable implemented class
		Thread alpha = new Thread(runner);
		Thread beta = new Thread(runner); // make two threads with same runnable job 
		alpha.setName("alpha thread");
		beta.setName("Beta thread");
		alpha.start();
		beta.start(); //start the threads
	}
	public  void run(){
		for(int i=0;i<25;i++){
			String threadname = Thread.currentThread().getName();
			System.out.println(threadname+" is running");
		}
	}


}