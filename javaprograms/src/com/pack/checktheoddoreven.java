package com.pack;

import java.util.Scanner;

public class checktheoddoreven {

	public static void main(String[] args) {
     
		Scanner sc = new Scanner(System.in);
		
		System.err.println("enter a number ");
		int number = sc.nextInt();
		if (number >0 && number % 2 == 0 ) {
			System.err.println(" postive even number");
		}else if (number >0 && number % 2 !=0){
				System.err.println("postive odd number");
			}
		
		if (number <0 && number % 2 == 0 ) {
			System.err.println(" negative even number");
		}else if (number <0 && number % 2 !=0){
				System.err.println(" negative odd number");
			}
		}
	
	}


