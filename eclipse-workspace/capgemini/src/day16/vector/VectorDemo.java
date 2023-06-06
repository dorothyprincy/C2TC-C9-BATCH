package day16.vector;

import java.util.*;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<String> animals=new Vector<>();
		animals.add("Goat");
		animals.add("Dog");
		animals.add("Cow");
		animals.add("Cat");
		animals.add("Rat");
		
		System.out.println("Initial Vector:"+animals);
		
		// using get
		System.out.println("Element at index 2:"+animals.get(2));
		
		// using iterator
		Iterator<String> iterate= animals.iterator();
		while(iterate.hasNext()) {
			System.out.println(iterate.next());	
		}
		// using remove
		String element = animals.remove(1);
		System.out.println("Removed element is:"+element);
		
		System.out.println("new Vector is:"+animals);
		
		// using clear
		animals.clear();
		System.out.println(animals);
		
		
	}

}
