package com.examclouds.epam.maxMethod;

import java.util.Arrays;

public class MaxMethod {
    public static void main(String[] args) {



        int[] array = new int[]{18, 1, 3, 6, 7, -5};  //очікуанний результат: [1, 3, 6, -5]
        int[] arrayWithoutMax = new int[array.length];

        int count =0;
        for (int i = 1, j =0; i < array.length-1; i++, j++) {
            if (array[i -1] < array[i]){
                arrayWithoutMax[j] = array[i -1];
                count++;
            } else if (array[array.length-1] < array[array.length-2]){
                arrayWithoutMax[arrayWithoutMax.length - 1] = array[array.length-1];
                count++;
            }else if (array[i] > array[i - 1] && array[i] > array[i + 1]){
                continue;
            } else {
                arrayWithoutMax[j+1] = array[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(arrayWithoutMax));
        int[] result = new int[count];

//            for (int i = 0, j = 0; i < arrayWithoutMax.length-1; i++, j++){
//                if (arrayWithoutMax[i] != 0){
//                    result[j] = arrayWithoutMax[i];
//                }
//            }
        System.arraycopy(arrayWithoutMax, 0, result,0, count);
        System.out.println(Arrays.toString(result));



    }
}
