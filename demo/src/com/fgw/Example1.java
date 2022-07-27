package com.fgw;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. EXIT PROGRAM");
            byte choice = sc.nextByte();
            int amount = 5000;


            switch (choice) {
                case 1:
                    System.out.println("1. How much: ");
                    int money = sc.nextInt();
                    withdrawals(money);
                    amount = amount - money;
                    break;
                case 2:

                case 3:
                    System.out.println("Check Balance");
                    System.out.println(amount);
                case 4:
            }
        }

    }
    public static void withdrawals(int money) {

        int[] unit = new int[] {50, 100, 200, 500};
        int[] numberofunits = new int[] {0, 0, 0, 0};

        while(money > 0) {
            //System.out.println(money);
            if (money - unit[3] >= 0) {
                money = money - unit[3];
                numberofunits[3]++;
            } else if (money - unit[2] >= 0) {
                money = money - unit[2];
                numberofunits[2]++;
            } else if (money - unit[1] >= 0) {
                money = money - unit[1];
                numberofunits[1]++;
            } else if (money - unit[0] >= 0) {
                money = money - unit[0];
                numberofunits[0]++;
            } else break;
        }

        for (int i = 3; i >= 0; i--) {
            System.out.println(unit[i] + "vnd " + numberofunits[i]);
        }

    }

}
