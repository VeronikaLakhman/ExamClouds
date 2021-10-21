package com.examclouds.lesson4.task4;
import java.util.Scanner;

public class MeanValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        double a = scan.nextDouble();
        System.out.println("Enter second number");
        double b = scan.nextDouble();
        System.out.println("Enter third number");
        double c = scan.nextDouble();

        System.out.println(meanValue(a, b , c));
    }

    static double meanValue(double a, double b, double c){
        return  (a + b + c) / 3;

    }

}
