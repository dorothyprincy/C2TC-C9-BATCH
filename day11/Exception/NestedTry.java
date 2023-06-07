package day11.Exception;

public class NestedTry {

	public static void main(String[] args) {
		int x,y=5;
		int a[];
		a= new int[] {1,2,3,4};
		try
		{
			x=y/5;
			try
			{
				System.out.println(a[6]);
	
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.err.println(e.getMessage());
			}
			}catch(ArithmeticException e) {
				System.err.println(e.getMessage());
			}
		}
	}
