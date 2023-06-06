package day14.synchronization;

public class SychronizationDemo {

	public static void main(String[] args) {
		Account a1 = new Account(15,"Dorothy",500000);
		System.out.println(a1);
		
		AccountThread t[]= new AccountThread[10];
		for(int i = 0;i < 10; i++) {
			t[i]=new AccountThread(a1,1000*(i+1));
		}
			try {
				for(int i=0; i<10;i++) {
					t[i].join();		
				}
			
			} catch (InterruptedException e) {
	
				System.err.println(e.getMessage());
			}
		
		System.out.println(a1);
	}
}
