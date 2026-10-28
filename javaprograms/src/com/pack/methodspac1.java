package com.pack;
import java.util.Scanner;
public class methodspac1 {

//ADDITION
	 void addition (int a ,int b) {
		int c= a+b ;
		System.out.println("sum of numbers="+c);
	
		substraction(c ,500);
	 }
	
// SUBTRACTION	
	
	void substraction (int a ,int c) {
		int d= a-c;
		System.out.println("difference  of numbers="+d);
		multilication(2,450);
	}
	
//MULTIPLICTION
void multilication (int a ,int d) {
		int e= a*d;
		System.out.println("product of numbers="+e);
		 division(3,600);
	}
// DIVISION
  void division(int a ,int e) {
	int f= a/e ;
		System.out.println("qouient of numbers="+f);
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		methodspac1 m1 = new methodspac1();
		m1.addition(100,100);
		
	}

}





