package com.pack;

import java.util.Scanner;

public class reverseloop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  System.out.println("enter a num");
		  int n = sc.nextInt();
		   int r=0;
		    int reverse = 0;
		    
		    while (n > 0) {
		    	r = n % 10;
		    	n = n / 10;
		    	reverse = reverse * 10 + r;
		    }
		    
		      System.out.println( + reverse);
	}

}
