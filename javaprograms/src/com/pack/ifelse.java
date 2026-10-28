package com.pack;

import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks : ");
		double markp = sc.nextDouble();
		if(markp<0 || markp > 100) {
			System.out.println("invailed marks,please may enter the marks again");
		} 
		else if(markp >= 90 ) {
			System.out.println("Grade A");
		}else if(markp >= 80 ) {
			System.out.println("Grade B");
		}else if(markp >= 70 ) {
			System.out.println("Grade C");
			
		}else if(markp >= 60 ) {
			System.out.println("Grade D");
		}else if(markp >= 35 || markp< 60 ) {
			System.out.println("Grade E");
		
		}else if(markp < 35 ) {
			System.out.println("FAILED");
		}
	}

	}


