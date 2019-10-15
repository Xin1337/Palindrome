package com.xin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // incrementing number
        int incrementingNumber = 1;

        // enters the string
        System.out.print("Enter string: ");
        Scanner sc = new Scanner(System.in);
        // stores string
        String x = sc.next();
        String reverse = "";
        for (int i = x.length() - 1; i >= 0; i--){
            // main
            reverse = reverse + x.charAt(i);
        }

        if (x.equals(reverse)){
            System.out.println(x + " is Palindrome");
        } else {
            System.out.println(x + " is not Palindrome");
        }

        System.out.print("Enter a number: ");
        int test = sc.nextInt();


        // adds new line
        for (int i = 1; i <= test; i++){
            // increments numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(incrementingNumber + " ");
                incrementingNumber++;
            }
            System.out.println();
        }
    }
}
