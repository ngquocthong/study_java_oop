/*
Enter an integer number (n) as input and take it as the size of a String array.
Now, copy all of the items into a new array, but in reverse order.
 */
package com.ex4;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int size = Integer.parseInt(sc.nextLine());
        String[] arr = new String[size];
        System.out.println("Enter the string:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextLine();
        }

        String[] reverse = new String[size];
        for (int i = 0; i < size; i++) {
            reverse[i] = arr[size-i-1];
        }

        for (int i = 0; i < size ; i++) {
            System.out.println(reverse[i]);
        }
    }
}
