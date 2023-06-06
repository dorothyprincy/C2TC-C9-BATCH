package annotations;

import java.util.ArrayList;

public class Sample {
	@SuppressWarnings("unchecked")
	public static void main(String args[]){

	ArrayList<String> list=new ArrayList<String>();
	list.add("dorothy");
	list.add("princy");
	list.add("jesus");

	for(Object obj:list)
	System.out.println(obj);

	}

}
