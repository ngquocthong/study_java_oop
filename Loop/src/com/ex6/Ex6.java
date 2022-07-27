package com.ex6;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        int count = 0;
        for (int i = 2; i < number / 2; i++) {
            if(number % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.printf("%d is Prime", number);
        } else  System.out.printf("%d is not Prime", number);
    }
}
