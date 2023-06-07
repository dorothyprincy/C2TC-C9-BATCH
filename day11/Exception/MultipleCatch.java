package day11.Exception;

public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y=5, a[];
		a= new int[] {1,2,3,4};
		try {
			System.out.println(a[5]);
			x=y/4;
		}catch(ArrayIndexOutOfBoundsException |ArithmeticException e) {
			System.err.println("Error"+e.getMessage());
		}catch(Exception e) {
			System.err.println("Error"+e.getMessage());
		}
		System.out.println("After Exception");
	}
}
