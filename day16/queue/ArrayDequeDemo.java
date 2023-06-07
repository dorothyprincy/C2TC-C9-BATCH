package day16.queue;

import java.util.*;

public class ArrayDequeDemo {
	public static void main(String[] args) {
		Deque<String> ad=new ArrayDeque<String>();
		ad.add("A");
		ad.add("B");
		ad.add("C");
		System.out.println("Array Deque is:"+ad);
		//add element front
		ad.offerFirst("D");
		System.out.println("Array Deque is:"+ad);
		ad.offerLast("E");
		
		Iterator<String> i=ad.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		// poll
		System.out.println("Before Poll is:"+ad);
		ad.poll();
		System.out.println("after Poll is:"+ad);

	}

}
