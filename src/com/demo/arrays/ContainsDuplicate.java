package com.demo.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个整数数组，判断是否存在重复元素。
 * 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
 */
public class ContainsDuplicate {

    public static void main(String[] args){
        int[] nums = {1,2,3,4};

        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        System.out.println(containsDuplicate.containsDuplicate(nums));
    }

    //自己实现 使用 Set 集合
//    public boolean containsDuplicate(int[] nums) {
//        Set<Integer> set = new HashSet<>();
//        for (int i = 0; i < nums.length; i++){
//            if (set.contains(nums[i])){
//                return true;
//            }
//            set.add(nums[i]);
//        }
//        return false;
//    }

    //先排序，然后判断最大值与最小值的差是否大于元素个数
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        if (nums[nums.length - 1] - nums[0] + 1 < nums.length){
            return true;
        }
        return false;
    }
}
