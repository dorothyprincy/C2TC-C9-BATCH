package day12.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class UsingThrows2 {
	static String acceptText()throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Text:");
		String str = br.readLine();
		return str;
	}
	
	public static void main(String[] args) {
		
		try {
			String str = acceptText();
			System.out.println("Your String is :"+str);
		}catch(IOException e) {
			System.err.print(e.getMessage());
		}
	}
	}
