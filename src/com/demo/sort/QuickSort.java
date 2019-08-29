package com.demo.sort;

import com.demo.util.ArrayUtil;

/**
 * 快速排序
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {3,9,1,0,4,2,8,5};

        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(arr, 0, arr.length - 1);

        ArrayUtil.printArr(arr);
    }

    /**
     * 递归的进行切分
     * @param arr
     * @param low
     * @param heigh
     */
    public void quickSort(int[] arr, int low, int heigh){
        if (arr == null || arr.length < 2) return;

        if (low >= heigh) return;
        int j = partition(arr, low, heigh);
        quickSort(arr, low, j - 1);
        quickSort(arr, j + 1, heigh);

    }

    /**
     * 对数组某部分进行切分，使得该部分内，左边都小于基准值，右边都大于基准值
     * @param arr 数组
     * @param low 开始位置
     * @param heigh 截至位置
     * @return 基准值所在位置
     */
    public int partition(int[] arr, int low, int heigh){
        int i = low, j = heigh + 1;
        int tmp = arr[low];
        while (true){
            while (arr[++i] < tmp) if (i == heigh) break;
            while (arr[--j] > tmp) if (j == low) break;
            if (i >= j) break;
            ArrayUtil.exchangeElement(arr, i, j);
        }
        ArrayUtil.exchangeElement(arr, low, j);
        return j;
    }
}
