package com.company;

import java.util.Scanner;

/**
 * Created by HP on 11-Mar-18.
 */
public class maxage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Age");
        int a = scanner.nextInt();
        if (a > 18 && a < 30) {
            System.out.println("you are young");
        } else if (a > 35 && a < 55) {
            System.out.println("you are gentel ");
        } else if (a > 56 && a < 70) {
            System.out.println("you are old");
        }
    }
}
