package com.pack;

import java.util.Scanner;

public class switchcase3 {

	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String yn ="";
        
         do {
          System.out.println("enter a number");
          int a =sc.nextInt();
          
          System.out.println("enter b number");
          int b =sc.nextInt();
          
          System.out.println("enter a symbol like + - * % /");
          char c = sc.next().charAt(0);
          int result =0;
          
          switch(c) {
          case '+' -> result = a+b;
          case '-' -> result = a-b;
          case '*' -> result = a*b;
          case '%' -> result = a%b;
          case '/' -> result = a/b;
          
          default -> System.out.println("invalid symbol !");
          }
          System.out.println( "resulted value is:" + result);
          System.out.println("do you want to continue ? click y for yes or n for no");
          yn = sc.next();
         }
         while(yn.equalsIgnoreCase("y"));
	
         System.out.println("claculation closed !");
	}

}
