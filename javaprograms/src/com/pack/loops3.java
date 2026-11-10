package com.pack;

import java.util.Scanner;

public class loops3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a num");
		int n = sc.nextInt();

		int r = 0;
		int reverse = 0;

		while (n > 0) {
			r = n % 10;//1234=4
			n = n / 10;//1234=123
			reverse = reverse * 10 + r;
		}
		System.out.println("final answer:" + reverse);
	}
}