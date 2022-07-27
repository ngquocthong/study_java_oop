//Write a program which allows to enter a string as input of which want to check the string follows the student id’s pattern – GCC20xxx
//Where:
//x is an integer from 1-9
package com.ex2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = "";
        boolean status = false;

        do {
            System.out.println("Enter a string: ");
            id = sc.nextLine();

            for (int i = 5; i < id.length(); i++) {
                int element = Character.getNumericValue(id.charAt(i));
                if (element > 0 && element < 10){
                    status = true;
                } else {
                    status = false;
                    break;
                }
            }
        } while (id.length()!=8 || !status);
        System.out.printf("Your id is: %s", id);



    }
}
//GCC20112
