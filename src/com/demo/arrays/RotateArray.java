package com.demo.arrays;

/**
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 * <p>
 * 示例1：
 * 输入: [1,2,3,4,5,6,7] 和 k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5]
 * 向右旋转 3 步: [5,6,7,1,2,3,4]
 * <p>
 * 示例 2:
 * 输入: [-1,-100,3,99] 和 k = 2
 * 输出: [3,99,-1,-100]
 * 解释:
 * 向右旋转 1 步: [99,-1,-100,3]
 * 向右旋转 2 步: [3,99,-1,-100]
 * <p>
 * 说明:
 * 1.尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
 * 2.要求使用空间复杂度为 O(1) 的原地算法。
 */
public class RotateArray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};

        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(nums, 3);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ",");
        }
    }

    //自己实现 1，每次移动1个元素，移动 k 次
//    public void rotate(int[] nums, int k){
//        if (nums == null || nums.length == 0){
//            return;
//        }
//        k = k % nums.length;
//        if (k == 0){
//            return;
//        }
//        for(int m = 0; m < k; m++) {
//            int lastNum = nums[nums.length - 1];
//            for (int i = nums.length - 1; i > 0; i--) {
//                nums[i] = nums[i - 1];
//            }
//            nums[0] = lastNum;
//        }
//    }

    //自己实现 2 后k位反转，前 nums.lenth - k 位反转，整体反转
//    public void rotate(int[] nums, int k) {
//        if (nums == null || nums.length == 0) {
//            return;
//        }
//        k = k % nums.length;
//        if (k == 0) {
//            return;
//        }
//        rotation(nums, nums.length - k, nums.length - 1);
//        rotation(nums, 0, nums.length - k - 1);
//        rotation(nums, 0, nums.length - 1);
//    }
//
//    public void rotation(int[] nums, int start, int end){
//        while (start <= end){
//            int tmp = nums[start];
//            nums[start] = nums[end];
//            nums[end] = tmp;
//            start++;
//            end--;
//        }
//    }

    //自己实现3 临时保留最后k位元素，前面元素向后移动k位，再将临时保留的k位元素赋值到前面k位
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return;
        }
        k = k % nums.length;
        if (k == 0) {
            return;
        }

        int length = nums.length;

        int[] tmpNums = new int[k];
        for (int i = 0; i < k; i++){
            tmpNums[i] = nums[length - k + i];
        }

        int index = 0;
        for (int i = length - k - 1; i >= 0; i--){
            nums[length - 1 - index] = nums[i];
            index++;
        }

        for (int i = 0; i < k; i++){
            nums[i] = tmpNums[i];
        }
    }
}
