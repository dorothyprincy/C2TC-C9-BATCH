package day5.hirarchical;

public class ChildB extends Parent{
	 void name() {
  	   System.out.println("Child B name");
     }
	public static void main(String[] args) {
		ChildB b= new ChildB();
		b.name();
		b.address();
		b.phno();
	}

}
