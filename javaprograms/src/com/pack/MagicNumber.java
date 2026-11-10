package com.pack;

import java.util.Scanner;

public class MagicNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int sum = 0;

        while (num > 9) {

            sum = 0;

            while (num > 0) {

                int rem = num % 10;

                sum = sum + rem;

                num = num / 10;
            }

            num = sum;
        }

        if (num == 1) {
            System.out.println("Magic Number");
        } else {
            System.out.println("Not a Magic Number");
        }
    }
}