 package com.pack;

import java.util.Scanner;

public class waterpark {

	public static void main(String[] args) {
     System.out.println("wellcome to the water park");
     
     Scanner sc = new Scanner(System.in);
     System.out.println("please enter your gender male or  female");
     String gender = sc.next();
 
	 if (gender.equals("male")) {
    	 System.out.println("Wellcome to king space");
    	 
     } else if (gender.equals("female") ){
    	 System.err.println("Wellcome to queen space");
     }
     else  {
    	 System.out.println("Invalide,please renter");
    	 return;
     }
	   System.out.println("Enter your name please");
	   String name = sc.next();
	   
    System.out .println( "Now enter your age:"   +  name);
    int age=sc.nextInt();
     
     if(age>=5 && age<=15) {
			System.out.println(name+":your ticket price is 250"); 
		} 
     else if(age>=16 && age<=50) {
			System.out.println(name+":your ticket price is 500");
		} 
     else {
    	 System.out.println("age is not allowed range, please wait in waiting hall ");
    	 return;
     }
     
     System.out.println("please enter your phone number");
     long number = sc.nextLong();
     
     
    	 System.out.println("thank you for booking your slot");
    	 System.out.println("Enjoy your day");

     
    
	}

}
