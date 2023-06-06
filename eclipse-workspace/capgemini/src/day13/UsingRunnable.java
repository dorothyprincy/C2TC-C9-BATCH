package day13;

public class UsingRunnable implements Runnable {
	Thread t;
	int h,l;
	String msg;
	public UsingRunnable(int h, int l, String msg) {
		this.h = h;
		this.l = l;
		this.msg = msg;
		t = new Thread(this, "Child Thread");
		t.start();
	}
	public void run() {
		for(int i=h; i > l; i--) {
			System.out.println(msg+i);
		}
	}

}
