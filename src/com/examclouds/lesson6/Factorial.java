package com.examclouds.lesson6;

public class Factorial {
    public static void main(String[] args) {

       int fact6 = factorial(6);
        System.out.println("Factorial 6 =" + fact6);
       int fact4 = factorial(4);
        System.out.println("Factorial 4 =" + fact4);
       int dif = fact6 - fact4;
        System.out.println(dif);


    }

    private static int factorial(int rundom) {
        int firstnum = 1;
        int fukt = 1;

        for (int i = 0; i < rundom; i++){
            fukt *=firstnum;
            firstnum++;

        }
        return fukt;
    }
}
