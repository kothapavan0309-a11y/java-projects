package com.pack;
/*
import java.util.Scanner;
public class TestMethods2 {

	static int balance = 1000;

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int amount = sc .nextInt();
		deposit(amount);
		withdraw(500);
	}

	static void deposit(int amount) {
		balance = balance + amount;
		System.out.println("balance amount="+balance);
	}

	static void withdraw(int amount) {
	balance = balance - amount;
		System.out.println("available amount="+balance);
	}
}
*/

public class TestMethods2 {
	
static  int balance = 1000 ;
    
    static void depoiste(int amount){
               balance = balance + amount;
        System.out.println("deposite amount=" + (amount));
    }
    
    static void withdraw(int amount){
        balance = balance-amount;
        System.out.println("withdraw amount=" +amount);
    }
    
    
	public static void main(String[] args) {
		depoiste(500);
		withdraw(300);
		
	}
}












