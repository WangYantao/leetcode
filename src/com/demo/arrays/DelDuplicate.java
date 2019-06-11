package com.demo.arrays;

/**
 * 从排序数组中删除重复项：
 * 1.给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 2.不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * <p>
 * 示例1：
 * 给定数组 nums = [1,1,2],
 * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
 * 你不需要考虑数组中超出新长度后面的元素。
 * <p>
 * 示例2：
 * 给定 nums = [0,0,1,1,1,2,2,3,3,4],
 * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
 * 你不需要考虑数组中超出新长度后面的元素。
 *
 * 解题思路：双指针法
 * 数组完成排序后，我们可以放置两个指针 i 和 j，其中 i 是慢指针，而 j 是快指针。
 * 只要 nums[i] == nums[j]，我们就增加 j 以跳过重复项。
 * 当我们遇到 nums[j] != nums[i]时，跳过重复项的运行已经结束，因此我们必须把 nums[j] 的值复制到 nums[i+1]。
 * 然后递增 i，接着我们将再次重复相同的过程，直到 j 到达数组的末尾为止。
 */
public class DelDuplicate {

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        DelDuplicate delDuplicate = new DelDuplicate();
        int length = delDuplicate.removeDuplicates(nums);
        for (int i = 0; i < length; i++) {
            System.out.println(nums[i]);
        }
    }

    //第一次自己实现的方法
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int length = 1;
        int currentNum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == currentNum) {
                continue;
            } else {
                length++;
                currentNum = nums[i];
                nums[length - 1] = currentNum;
            }
        }
        return length;
    }

    //官方代码(没有进行判空处理)
    public int removeDuplicates_leetcode(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
