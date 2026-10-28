package com.pack;

import java.util.Scanner;

//wap to check the eligible for license
public class testifelse {

	public static void main(String[] args) {
		System.out.println("enter the main method" );

		Scanner sc = new Scanner(System.in);
		System.err.println("enter your name");
		String fname = sc.nextLine();
		
	
		System.err.println("enter your age");
		int age = sc.nextInt();
		
		if(age<18 ) {
			System.err.println("your not eligible for license");
		}else {
			System.err.println("your eligible for licensepavan");
		}
		
	}
	

}
