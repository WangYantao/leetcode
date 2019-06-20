package com.demo.arrays;

/**
 * 移动零
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * <p>
 * 示例:
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * <p>
 * 说明:
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 */
public class MoveZeroes {

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        MoveZeroes moveZeroes = new MoveZeroes();
        moveZeroes.moveZeroes(nums);

        for (int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + ",");
        }
    }

    /**
     * 数组原地拷贝，零元素直接覆盖
     *
     * @param nums
     */
//    public void moveZeroes(int[] nums) {
//        int k = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != 0) {
//                nums[k] = nums[i];
//                k++;
//            }
//        }
//        for (int i = k; i < nums.length; i++) {
//            nums[i] = 0;
//        }
//    }

    /**
     * 快慢指针法
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        for(int slow = 0, cur = 0; cur < nums.length; cur++){
            if (nums[cur] != 0){
                int tmp = nums[slow];
                nums[slow] = nums[cur];
                nums[cur] = tmp;
                slow++;
            }
        }
    }

}
