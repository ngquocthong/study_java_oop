/*
Write a program insert an input as an array of integers a0, a1, a2, …, an-1.
 Lists the number of occurrences of elements in a given array.
 */
package com.ex5;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Array lenth: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int count = 0;

        System.out.println("Enter array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter value you want to find the occurrences: ");
        int value = sc.nextInt();
        for (int element:arr) {
            if(element == value) {
                count++;
            }
        }
        System.out.printf("Value %d occur %d times", value, count);
    }
}
