package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by HP on 25-Feb-18.
 */
public class maxnum3 {
    public static void main(String[] args) {
        int a = 90, b = 20, c = 30, d = 70;
        if (a > b && a > c && a > d) {
            System.out.println("A is max");
        } else if (b > a && b > c && b > d) {
            System.out.println("B is max");
        } else if (c > a && c > b && c > d) {
            System.out.println("C is max");
        } else if (d > a && d > b && d > c) {
            System.out.println("D is max");
        }
    }
}
