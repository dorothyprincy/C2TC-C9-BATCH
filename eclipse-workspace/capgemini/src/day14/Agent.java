package day14;

public class Agent {
	int a;
	boolean b=false;
	public synchronized void set(int a1) {
		if(b) {
			try {
				wait();
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
		this.a=a1;
		b=true;
		System.out.println("Set:"+a);
		notify();
	}
	public synchronized void get() {
		if(!b) {
			try {
				wait();
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println("Getting Data:"+a);
		b=false;
		notify();
	}

}
