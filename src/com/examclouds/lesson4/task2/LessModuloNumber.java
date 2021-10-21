package com.examclouds.lesson4.task2;
import java.util.Scanner;
public class LessModuloNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first real number");
        double first = scan.nextDouble();
        System.out.println("Enter the second real number");
        double second = scan.nextDouble();
        System.out.println("Enter the third real number");
        double third = scan.nextDouble();

        double firstModulo = Math.abs(first);
        double secondModulo = Math.abs(second);
        double thirdModulo = Math.abs(third);

        /* double firstModulo = first < 0 ? - first : first;   //Другий спосіб визначити модуль числа, за доп. тернарного оператора.
        double secondModulo = second < 0 ? - second : second;
        double thirdModulo = third < 0 ? - third : third;*/

        lessModuloNumber(firstModulo, secondModulo, thirdModulo);
    }

    static void lessModuloNumber(double a, double b, double c) {

        if (a < b & a < c) {
            System.out.println("Найменше по модулю число - " + a);
        } else if (b < a & b < c) {
            System.out.println("Найменше по модулю число - " + b);
        } else {
            System.out.println("Найменше по модулю число - " + c);
        }

    }

}
