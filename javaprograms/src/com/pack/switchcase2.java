package com.pack;

import java.util.Scanner;

public class switchcase2 {

	public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
     System.out.println("enter a day");
     String day =sc.next();
     
     
     switch(day) {
     case "monday"  -> System.out.println("fresh weekday");
     
     case "tuesday","wednesday","thursday" -> System.out.println("routine weekday");
     
     case "friday" ->System.out.println("last day of weekday");
     
     case "saturday" -> System.out.println("weakend day");
     
     case "sunday" -> System.out.println(" special weakend day");
     }
     
	}

}
