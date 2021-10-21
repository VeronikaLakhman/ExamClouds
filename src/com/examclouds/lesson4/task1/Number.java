package com.examclouds.lesson4.task1;

import java.util.Scanner;

public class Number {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer and press <Enter>");

        if (scan.hasNextInt()) {
            int a = scan.nextInt();
            if (a % 2 == 0) {
                System.out.println("even number");
            } else {
                System.out.println("odd number");
            }
        } else {
            System.out.println("It's not an integer");
        }
    }
}
