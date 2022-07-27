package com.bai1;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Weights: ");
        int weight = sc.nextInt();
        System.out.println("Height: ");
        float height = sc.nextFloat();
        float BMI = weight/(height*height);
        if (BMI < 18.5)
            System.out.println("Underweight");
        else if (BMI > 18.5 && BMI < 25)
            System.out.println("Normal");
        else if (BMI >= 25 && BMI <= 30)
            System.out.println("Overweight");
        else System.out.println("You're so béo! You know");
    }
}
