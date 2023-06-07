package day12.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UsingThrows1 {
	static int acceptText()throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Text:");
		int str = br.read();
		return str;
	}
	
	public static void main(String[] args) {
		try {
			int str = acceptText();
			System.out.println("Your String is :"+str);
		}catch(IOException e) {
			System.err.print(e.getMessage());
		}
	}

}