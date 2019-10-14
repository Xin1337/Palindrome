package com.xin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //stores the incrementing number
        int incrementingNumber = 1;

        //Enter the string value to validate if it is palindrome or not.
        System.out.print("Enter string: ");
        Scanner sc = new Scanner(System.in);
        String x = sc.next(); //stores string
        String reverse = "";
        for (int i = x.length() - 1; i >= 0; i--){
            reverse = reverse + x.charAt(i);
        }

        if (x.equals(reverse)){
            System.out.println(x + " is Palindrome");
        } else {
            System.out.println(x + " is not Palindrome");
        }

        System.out.print("Enter a number: ");
        int test = sc.nextInt();


        for (int i = 1; i <= test; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print(incrementingNumber + " ");
                incrementingNumber++;
            }
            System.out.println();
        }
    }
}
