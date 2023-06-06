package day8.Interface;

public class Demo {

	public static void main(String[] args) {
		
		SavingAccount sa = new SavingAccount("Reven", "Chennai", 1234, 55000);
		System.out.println(sa);
		
		sa.deposit(23000);
		System.out.println(sa);
		
		sa.withdraw(15000);
		System.out.println(sa);
		
		sa.deposit(26000);
		System.out.println(sa);
	}

}
