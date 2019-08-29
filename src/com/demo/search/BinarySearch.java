package com.demo.search;

/**
 * 二分查找
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11,13,16};

        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.binarySearch(arr, 5));
    }

    /**
     * 二分查找
     * @param arr 数组
     * @param target 目标元素
     * @return 目标元素在数组中的位置，-1 表示没找到
     */
    public int binarySearch(int[] arr, int target){
        if (arr == null || arr.length == 0) return -1;

        int low = 0, heigh = arr.length - 1;
        while (low <= heigh){
            int mid = (low + heigh) / 2;
            if (arr[mid] == target){
                return mid;
            }else if (arr[mid] > target){
                heigh = mid - 1;
            }else if (arr[mid] < target){
                low =mid + 1;
            }
        }
        return -1;
    }
}
