package com.examclouds.lesson7;

import java.util.Scanner;


public class Exponentiation {
    public static void main(String[] args) {

       /* На вход подаётся несколько целых чисел. Выведите эти числа, возведённые в степени от двух до пяти.
        Формат вывода: для каждого введённого числа степени выводятся в отдельной строке через пробел.
        Примечание. Каждая строка вывода оканчивается числом, а не пробелом.
        Sample Input:
        1 2 3
        Sample Output:
        1 1 1 1
        4 8 16 32
        9 27 81 243
        */

        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int num = scan.nextInt();
            int result = (int) Math.pow(num, 2);
            int result1 = (int) Math.pow(num, 3);
            int result2 = (int) Math.pow(num, 4);
            int result3 = (int) Math.pow(num, 5);
            System.out.println(result + " " + result1 + " " + result2 + " " + result3);
        }
    }
}
