package com.lecture;

import java.util.Scanner;

public class Lecture { //Array Input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of value:");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i]=sc.nextInt();
        }
        System.out.println("The array is:");
        for(int element:array) {
           System.out.printf("%d ", element);
        }

    }
}
