package day16.userDefinedFunction;

import java.util.*;

public class ListDemo {
	public static void main(String[] args) {
		List<student> studentlist=new ArrayList<student>();
		
		student s1 = new student(11, "dorothy", 45);
		student s2 = new student(12, "princy", 55);
		student s3 = new student(13, "maria", 65);
		student s4 = new student(14, "raja", 75);
		
		studentlist.add(s1);
		studentlist.add(s2);
		studentlist.add(s3);
		studentlist.add(s4);
		 System.out.println("Student Details:"+studentlist);
		 
		 // using comparable interface
		 Collections.sort(studentlist);
		 System.out.println(studentlist);
		 
		 // adding user defined objects (Person)into ArrayList
	
		 List<Person> personlist=new ArrayList<Person>();
		 	Person p1 = new Person("chennai", "dorothy");
		 	Person p2 = new Person("MVP", "princy");
		 	Person p3 = new Person("ooty", "maria");
		 	Person p4 = new Person("Trichy", "raja");
			
		 	personlist.add(p1);
		 	personlist.add(p2);
		 	personlist.add(p3);
		 	personlist.add(p4);
		 	
			 System.out.println("-----------Before Storing---------");
			 System.out.println(personlist);
			 
			 // using comparable interface
			 Collections.sort(personlist, new SortByCity());
			 System.out.println("-----------After Storing---------");
			 System.out.println(personlist);
			 
	}

}
