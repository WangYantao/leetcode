package com.demo.sort;

import com.demo.util.ArrayUtil;

/**
 * 选择排序
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {3,9,1,0,4,2,8,5};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.selectionSort(arr);
        ArrayUtil.printArr(arr);
    }

    public void selectionSort(int[] arr){
        if (arr == null || arr.length == 0) return;

        for (int i = 0; i < arr.length; i++){
            int min = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            ArrayUtil.exchangeElement(arr, i, min);
        }
    }
}
