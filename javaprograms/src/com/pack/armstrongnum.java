package com.pack;

import java.util.Scanner;

public class armstrongnum {
	
	static boolean isArmstrongNum(int n) {
		boolean status = false;
		int r = 0;
	   int sump = 0;
	   int temp = 0;
	    
	   
	   String str = Integer.toString(n);
	   int digitcount = str.length();
	   
	   while(n>0) {
		   r = n % 10;
		   n = n % 10;
		  // sump = sump + r * r * r;
		   sump = (int) (sump + Math.pow(r, digitcount));
		   
	   }
		
	   if (temp == sump) {
		   status = true;
	   }
		return status;
	}
	

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter a num ");
     int n = sc.nextInt();
     
		boolean flag = isArmstrongNum(n);
     
		if(flag){
			System.out.println("the given num is armstrong number");
		}else {
			System.out.println("the give num is not a armstrong number");
		}
	}

}
