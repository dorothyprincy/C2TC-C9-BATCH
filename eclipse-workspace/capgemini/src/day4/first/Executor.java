package day4.first;

public class Executor {

	public static void main(String[] args) {
		Base obj = new Base();
		obj.methodDefault();
		obj.methodPublic();
		obj.methodProtected();
		
		obj.varDefault = 4;
		obj.methodDefault();
		
		obj.varPublic = 9;
		obj.methodPublic();
		
		obj.varProtected = 8;
		obj.methodProtected();
	}

}
