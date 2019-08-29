package com.demo.util;

public class ArrayUtil {
    public static void exchangeElement(int[] arr, int i1, int i2){
        int tmp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = tmp;
    }

    public static void printArr(int[] arr){
        if (arr == null || arr.length == 0) return;

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
