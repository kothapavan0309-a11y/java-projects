package com.pack;

import java.util.Scanner;

public class Loop1 {

	public static void main(String[] args) {
System.out.println("main mathod started");
   Scanner sc = new Scanner(System.in);
   System.out.println("enter a number");
   int n = sc.nextInt();
   
   findfactors(n);
   
	}
	static void findfactors(int n) {
		for(int i =1; i<=n;i++) {
			if(n%i==0) {
				System.out.print(i + " ");
			}
		}
	}

}
