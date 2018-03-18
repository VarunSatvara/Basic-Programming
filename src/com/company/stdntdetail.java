package com.company;

import java.util.Scanner;

/**
 * Created by HP on 11-Mar-18.
 */
public class stdntdetail {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name;
        String enrollment;
        int sub1, sub2, sub3, sub4, sub5;
        int total;
        float per;

        System.out.println("ENTER Your  name");
        name = scanner.nextLine();

        System.out.println("Enter Your Enrollment");
        enrollment = scanner.nextLine();

        System.out.println("Subject mark 1:");
        sub1 = scanner.nextInt();

        System.out.println("Subject mark 2:");
        sub2 = scanner.nextInt();

        System.out.println("Subject mark 3:");
        sub3 = scanner.nextInt();

        System.out.println("Subject mark 4:");
        sub4 = scanner.nextInt();

        System.out.println("Subject mark 5:");
        sub5 = scanner.nextInt();


        total = sub1 + sub2 + sub3 + sub4 + sub5;
        per = total / 5;

        System.out.println("Marksheet");
        System.out.println("Name is : " + name);
        System.out.println("Enrollment is : " + enrollment);
       // System.out.println("subject 1:" + sub1);
        System.out.println("subject 2:" + sub2);
        System.out.println("subject 3:" + sub3);
        System.out.println("subject 4:" + sub4);
        System.out.println("subject 5:" + sub5);
        System.out.println("Total:" + total);
        System.out.println("Percentage:" + per);

        per=35.45f;

        if (per>=60) {
            System.out.println(per);
            System.out.println("first class");
        } if (per>=40 && per <60) {
            System.out.println(per);
            System.out.println("second class");
        } else if (per < 40) {
            System.out.println(per);
            System.out.println("fail");
        }

    }
}
