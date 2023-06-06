package day4.second;

import day4.first.Base;

public class Executor {

	public static void main(String[] args) {
		Base obj = new Base();
		obj.methodPublic();
		
		obj.varPublic=78;
		obj.methodPublic();
		
	}

}
