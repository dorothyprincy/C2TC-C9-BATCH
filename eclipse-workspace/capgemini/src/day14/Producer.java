package day14;

public class Producer extends Thread{
	Agent obj;

	public Producer(Agent obj) {
		this.obj = obj;
	}
	public void run() {
		int i=0;
		while(true) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
			obj.set(i);
			i++;
		}
	}

}
