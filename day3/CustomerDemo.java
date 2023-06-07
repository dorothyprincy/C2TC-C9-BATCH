package day3;

import java.util.Scanner;

public class CustomerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name, city; 
		int id;
		System.out.println("Enter Customer ID");
		id =sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Customer name");
		name = sc.nextLine();
		System.out.println("Enter Customer city");
		city = sc.nextLine();
		
		Customer obj = new Customer();
		obj.setCustomerName(name);
		obj.setCustomerId(id);
		obj.setCustomerCity(city);
		System.out.println(obj);
		
		
	}

}
