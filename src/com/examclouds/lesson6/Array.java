package com.examclouds.lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        int[][] array = {
                {2,4,8,7,6,7,8,5},
                {4,8,6,4,5,6,7,3},
                {3,4,7,6,3,4,5,6},
                {3,4,6,2,5,8,9,6},
                {3,2,4,5,7,2,4,5}
        };
        System.out.println("Array before sorting " + Arrays.deepToString(array));
        Arrays.sort(array[0]);
        Arrays.sort(array[1]);
        Arrays.sort(array[2]);
        Arrays.sort(array[3]);
        Arrays.sort(array[4]);
        System.out.println("Array after sorting" + Arrays.deepToString(array));

        int[][] newArrayMinMax = new int[5][2];

        System.arraycopy(array[0], 0, newArrayMinMax[0], 0, 1);
        System.arraycopy(array[0],7,newArrayMinMax[0], 1,1);
        System.arraycopy(array[1], 0, newArrayMinMax[1], 0, 1);
        System.arraycopy(array[1],7,newArrayMinMax[1], 1,1);
        System.arraycopy(array[2], 0, newArrayMinMax[2], 0, 1);
        System.arraycopy(array[2],7,newArrayMinMax[2], 1,1);
        System.arraycopy(array[3], 0, newArrayMinMax[3], 0, 1);
        System.arraycopy(array[3],7,newArrayMinMax[3], 1,1);
        System.arraycopy(array[4], 0, newArrayMinMax[4], 0, 1);
        System.arraycopy(array[4],7,newArrayMinMax[4], 1,1);

        System.out.println("New array " + Arrays.deepToString(newArrayMinMax));


    }
}

