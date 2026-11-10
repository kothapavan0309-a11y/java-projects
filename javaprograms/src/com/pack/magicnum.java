package com.pack;

import java.util.Scanner;

public class magicnum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a num");
		int n = sc.nextInt();
		 boolean flag = isArmstrongnum(n);
		    
		 if(flag) {
			 System.out.println("given num is armstrong num");
		 }else {
			 System.err.println("given num is not a armstrong num");
		 }
		
		
	}
		static boolean isArmstrongnum(int n) {
			 boolean status = false;
			 int r = 0;
			 int sump = 0;
			 int digitcount = 0;
			 int n1 = n;
			 int temp = n; 
			 
			 while(n > 0) {
				 n = n / 10;
				 digitcount++;
			 }
			 
			 while(n1>0) {
				 r = n1 % 10;
				 n1 = n1 / 10;
				 sump = (int) (sump + Math.pow(r , digitcount));
			 }
			  
			 if(sump == temp) {
				 status= true;
			 }
				 
			 
			 
			 return status;
		}
		
		
	}
	
	