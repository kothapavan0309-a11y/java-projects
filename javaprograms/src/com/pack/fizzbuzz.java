package com.pack;

import java.util.Scanner;

public class fizzbuzz {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int n = sc.nextInt();
    int count=0;
    int count1=0;
    int count2=0;
    for(int i=1;i<=n;i++) {
    	if(i%3==0 && i%5==0) {
    		System.out.println("fizz buzz");
    		count++;
    	}
    	else if (i % 3 ==0) {
    		System.out.println("buzz");
    		count1++;
    		
    	}
    	else if (i % 5==0) {
    		System.out.println("fizz");
    		count2++;
    	}
    	
    }
 System.out.println("count of fizzbuzz:" +count);
 System.out.println("count of buzz:" +count1);
 System.out.println("count of fizz:" +count2);
	
	}

}
