package com.examclouds.lesson7;

import java.util.Scanner;

public class PyramidOfNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int count = 1;

        for (int i = 0; i < num; i++) {
            for (int j = 1; j <= count; j++) {
                if (j != count) {
                    System.out.print(j + " ");
                } else
                    System.out.print(j);
            }
            System.out.println();
            count++;
        }
    }
}
