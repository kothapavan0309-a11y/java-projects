package com.pack;

//write a Java program to swap two numbers with
//using a third variable and without using third variable ?.
public class swap {

	public static void main(String[] args) {
		int a =10;
		int b =20;
		int temp;
		
		temp =a;
		a = b;
		b = temp;
		System.out.println("a =" +a);
		System.out.println("b =" +b);
		
	}

}
