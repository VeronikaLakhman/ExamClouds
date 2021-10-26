package com.examclouds.lesson7;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i = 1; i <= num; i++) {
            int stop = 1;
            for (int j = 1; j <= i; j++) {
                for (int k = 1; k <= j; k++) {
                    if (stop <= i) {
                        System.out.print(j);
                    }
                    if (stop < i) {
                        System.out.print(" ");
                    }
                    stop++;
                }
            }
            if (i < num) {
                System.out.println("");
            }
        }
    }
}
