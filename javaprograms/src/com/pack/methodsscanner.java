package com.pack;
import java.util.Scanner;

public class methodsscanner {

	public static void main(String[] args) {
	 
		System.out.println("welcome to my world");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name");
		String name = sc.next();
		
		System.out.println("enter your age");
		String age = sc.next();
		
		System.out.println("enter your phone number");
		 long number = sc.nextLong();
		 
		yourname(name);
		yourage(age);
        yourphonenumber(number);
	}
	static void yourname(String name) {
		System.out.println("your name is=" +name);
	}

	static void yourage(String age) {
		System.out.println("your name is=" +age);
	}
	
	static void yourphonenumber(long number) {
		System.out.println("your phone number=" +number);
	}
}
