package com.demo.arrays;

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 *
 * 示例1
 * 输入: [2,2,1]
 * 输出: 1
 *
 * 示例2：
 * 输入: [4,1,2,1,2]
 * 输出: 4
 */
public class SingleNumber {

    public static void main(String[] args){
        int[] nums = {4,1,2,1,2};

        SingleNumber singleNumber = new SingleNumber();
        System.out.println(singleNumber.singleNumber(nums));
    }

    //使用异或位运算
    public int singleNumber(int[] nums) {
        int num = 0;
        for (int i = 0; i < nums.length; i++){
            num ^= nums[i];
        }
        return num;
    }
}
