package day15.predefinedfunction;

import java.util.LinkedList;
import java.util.*;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList <Integer> ll=new LinkedList<Integer>();
		ll.add(40);
		ll.add(20);
		ll.add(70);
		ll.add(50);
		ll.add(10);
		ll.add(30);
		ll.addFirst(5);
		ll.addLast(80);
		
		System.out.println("List is:"+ll);
		ll.removeFirst();
		System.out.println("List is:"+ll);
		ll.removeLast();
		System.out.println("List is:"+ll);
		
		ListIterator<Integer> li=ll.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next()+"/t");
		}
		li=ll.listIterator(ll.size());
		while(li.hasPrevious()) {
			int n=li.previous();
			System.out.println(n+"/t");
		}
			
	}

}
