package day12.exception;

import java.util.*;
public class AgeTestDemo {
	static void validate (int age) throws InvalidAgeException { 
		if (age<18) {
			throw new InvalidAgeException("Invalid Age, You are not eligible to vote");
			
		}else {
			System.out.println("Welcome to vote");
		}
	}

	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your age:");
		age=sc.nextInt();
		try {
			validate(age);
		}catch(InvalidAgeException e) {
			System.err.println("Exception was caught: \n"+e.getMessage());
		}
		sc.close();
	}

}
