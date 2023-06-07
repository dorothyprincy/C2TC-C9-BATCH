package day14;

public class InterThreadCommunicationDemo {

	public static void main(String[] args) {
		Agent obj=new Agent();
		
		Producer p1=new Producer(obj);
		Consumer c1=new Consumer(obj);
		
		p1.start();
		c1.start();
	}

}
