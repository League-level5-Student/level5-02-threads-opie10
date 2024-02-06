package _03_Threaded_Greeting;

public class ThreadedGreeter implements Runnable{
int threadCount;
public ThreadedGreeter(int num ) {
	this.threadCount=num;
	run();
}
	@Override
	public void run() {
		System.out.println("Hello from thread "+ threadCount);
		// TODO Auto-generated method stub
		if(threadCount<50) {
			Thread thread = new Thread(()->new ThreadedGreeter(threadCount+1));
			thread.start();
			try {
				thread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
