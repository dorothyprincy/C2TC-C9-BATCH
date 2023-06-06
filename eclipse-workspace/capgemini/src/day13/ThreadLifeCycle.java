package day13;

public class ThreadLifeCycle extends Thread{
	public void run() {
		System.out.println("Inside run() Thread is alive or not?"+this.isAlive());
		int num=0;
		while(num<4) {
			num++;
			System.out.println("num="+num);
			try {
				sleep(1000);
				System.out.println("Inside Runnable() Thread is alive or not?"+this.isAlive());	
			}catch(InterruptedException e) {
				System.err.print(e.getMessage());
			}	
		}
	}

	public static void main(String[] args) {
		Thread myThread = new ThreadLifeCycle();
		System.out.println("Before Runnable() Thread is alive or not?"+myThread.isAlive());	
		myThread.start();
		
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			System.err.print(e.getMessage());
		}	System.out.println("After completion Thread is alive or not?"+ myThread.isAlive());

		}

}