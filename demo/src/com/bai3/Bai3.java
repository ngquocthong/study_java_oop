package com.bai3;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string 1: ");
        String a = sc.nextLine();
        System.out.println("Enter string 2: ");
        String b = sc.nextLine();
        System.out.println(a + " " + b);
        if (a.equals(b)) {
            System.out.println("The Same");
        } else System.out.println("Not Equal");

    }
}
