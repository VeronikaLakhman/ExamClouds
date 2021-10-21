package com.examclouds.lesson4.task3;

import java.io.IOException;

public class Garland {
    public static void main(String[] args) throws IOException {
        int garland = 78;
        System.out.println(Integer.toBinaryString(78));
        blink(garland);
        turnOnOff(garland);
        creepingLineMode(garland);
    }

    static void blink(int lamp){
        lamp = ~lamp;
        System.out.println(Integer.toBinaryString(lamp));
    }
    static void turnOnOff(int a){
        a = a & 1;  //x & 1 - проверяет чётность числа. Если число четное - результат 0, нечетное - 1.
        System.out.println(Integer.toBinaryString(a));
    }

    static void creepingLineMode(int g){
        g = g >> 4;
        System.out.println(Integer.toBinaryString(g));
    }
}
