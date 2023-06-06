package day6.MethodOverriding;

public class Demo {
	public static void main(String[] args) {
		
		RBI rbi;
		
		
		rbi = new SBI();
		System.out.println(rbi.getRateOfIntrest());
		
		rbi = new HDFC();
		System.out.println(rbi.getRateOfIntrest());
		
		rbi = new ICICI();
		System.out.println(rbi.getRateOfIntrest());
	}

}
