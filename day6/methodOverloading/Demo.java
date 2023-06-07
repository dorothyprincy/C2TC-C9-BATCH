package day6.methodOverloading;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Method Overloading");
		System.out.println("Addition of two integers"+Overloading.add(23, 57));
		System.out.println("Addition of two Float"+Overloading.add(11.5f, 3.7f));
		System.out.println("Addition of one integer and one float"+Overloading.add(5, 6.8));
		System.out.println("Addition of one float and one integer"+Overloading.add(1.0f, 24));
		System.out.println("Addition of two Strings"+Overloading.add("Rev", "enth"));
	
		
		System.out.println("Consructor Overloading");
		Point p = new Point();//default constructor will invoked
		System.out.println(p);
		
		Point p1 = new Point(35.7f);
		System.out.println(p1);

		Point p2 = new Point(35.7f, 63.1f);
		System.out.println(p2);
	}

}
