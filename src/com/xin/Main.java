package com.xin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int incrementingNumber = 1;

        System.out.print("Enter value: ");
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        System.out.println("Enter string: ");
        String pal = sc.nextLine();

        for (int i = 1; i <= test; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print(incrementingNumber + " ");
                incrementingNumber++;
            }
            System.out.println();
        }
    }
}
