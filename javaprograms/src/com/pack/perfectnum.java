package com.pack;

import java.util.Scanner;

public class perfectnum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	System.out.println("enter the number");
		int n =sc.nextInt();
		
		 boolean result = isperfect(n);
		 if(result) {
			 System.out.println("given num is perfect");
		 } else {
			 System.out.println("given number is not perfect");
		 }
	}

	static boolean isperfect(int n) {
		boolean status = false;
		
		int sum=0;
		
		for(int i=1;i<=n / 2 ; i++) {
			if(n%i==0) {
				sum =sum + i;
			}
		}
		
		if (sum ==n) {
			status=true;
		}
		
		
		return status;
		
		
	}
}
