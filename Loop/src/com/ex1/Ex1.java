//Write a program that enters any integer number as input of which you want multiplication table.
package com.ex1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Multiple table of:");
        int n = sc.nextInt();
        for(int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d \n", n, i, n * i);
        }
    }
}
