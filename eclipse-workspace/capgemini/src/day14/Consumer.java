package day14;

public class Consumer extends Thread{
	Agent obj;

	public Consumer(Agent obj) {
		this.obj = obj;
	}
	public void run() {
		int i=0;
		while(true) {
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
			obj.get();
		}
	}
}
