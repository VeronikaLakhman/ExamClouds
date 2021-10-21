package com.examclouds.lesson5.task1;

import java.util.Scanner;

public class IfElseDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter integer");

        if (scan.hasNextInt()) {
            int number = scan.nextInt();
            compareNumber(number);
        } else {
            System.out.println("It's not integer");
        }

    }

    private static void compareNumber(int number) {
        if (number > 0 & number < 10){
            System.out.println("It's integer");
        } else{
            System.out.println("Положительное число больше 10 или отрицітельное число");
        }
    }
}
