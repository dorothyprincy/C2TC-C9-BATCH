package day16.queue;

import java.util.*;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<>();
		// add elements {0,1,2,3,4}
		for (int i=0;i<6;i++) {
			q.add(i);
		}
		System.out.println("Queue is:"+q);
		
		// remove
		int e=q.remove();
		System.out.println("Removed element is:"+e);
		
		//to display head element
		int head=q.peek();
		System.out.println("Head Element is:"+head);
		
	}

}
