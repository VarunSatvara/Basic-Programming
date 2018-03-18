package com.company;

import java.util.Scanner;

/**
 * Created by HP on 11-Mar-18.
 */
public class daycount {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter day:");
        int day =scanner.nextInt() ;
        switch (day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Not selected day");
                break;
        }
    }
}
