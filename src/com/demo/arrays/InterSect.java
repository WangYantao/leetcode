package com.demo.arrays;

import java.util.*;

/**
 * 两个数组的交集 II
 * 给定两个数组，编写一个函数来计算它们的交集。
 * <p>
 * 示例 1:
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2,2]
 * <p>
 * 示例 2:
 * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出: [4,9]
 * <p>
 * 说明：
 * 输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。
 * 我们可以不考虑输出结果的顺序。
 * <p>
 * 进阶:
 * 如果给定的数组已经排好序呢？你将如何优化你的算法？
 * 如果 nums1 的大小比 nums2 小很多，哪种方法更优？
 * 如果 nums2 的元素存储在磁盘上，磁盘内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？
 */
public class InterSect {

    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};

        InterSect interSect = new InterSect();
        int[] result = interSect.intersect(nums1, nums2);

        if (result == null) {
            System.out.println("两数组交集为空集");
        } else {
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + ",");
            }
        }
    }


    /**
     * 方法一 暴力遍历
     *
     * 遍历较长数组Amax的元素，与较小数组Amin的元素逐一比较，k = A.lenth - 1
     * 如果两元素相同，则将Amin的该元素与 k-1 出元素交换，并将 k = k - 1，然后终止本次Amin元素遍历
     * 最后，如果 k < Amin.lenth - 1，则 k 至 Amin.lenth-1 的元素就是两数组交集
     * @param nums1
     * @param nums2
     * @return
     */
//    public int[] intersect(int[] nums1, int[] nums2) {
//        if (nums1 == null || nums2 == null
//        || nums1.length == 0 || nums2.length == 0){
//            return null;
//        }
//
//        int[] aMax, aMin;
//        if (nums1.length > nums2.length){
//            aMax = nums1;
//            aMin = nums2;
//        }else {
//            aMax = nums2;
//            aMin = nums1;
//        }
//        int k = aMin.length;
//
//        for (int i = 0; i < aMax.length; i++){
//
//            if ( k == 0) break;
//
//            for (int j = 0; j < k; j++){
//                if (aMax[i] == aMin[j]){
//                    int tmp = aMin[j];
//                    aMin[j] = aMin[k-1];
//                    aMin[k-1] = tmp;
//                    k--;
//                    break;
//                }
//            }
//        }
//
//        int[] result = null;
//        if (k < aMin.length){
//            int elementNums = aMin.length - k;
//            result = new int[elementNums];
//            for (int i = 0; i < elementNums; i ++){
//                result[i] = aMin[k + i];
//            }
//        }
//        return result;
//    }

    /**
     * 方法二 使用Map，数组作为键值key，计数器作为value
     * 如果 nums2 的元素存储在磁盘上，磁盘内存是有限的，并且你不能一次加载所有的元素到内存中，则可以用该方法，批次读取部分nums2元素到内存进行处理。
     * @param nums1
     * @param nums2
     * @return
     */
//    public int[] intersect(int[] nums1, int[] nums2) {
//        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//        for (int i = 0; i < nums1.length; i++) {
//            Integer value = map.get(nums1[i]);
//            map.put(nums1[i], (value == null) ? 1 : ++value);
//        }
//
//        List<Integer> list = new ArrayList<Integer>();
//        for (int i = 0, value; i < nums2.length; i++) {
//            if (map.containsKey(nums2[i]) && (value = map.get(nums2[i])) > 0) {
//                list.add(nums2[i]);
//                map.put(nums2[i], --value);
//            }
//        }
//
//        int[] result = new int[list.size()];
//        int i = 0;
//        for (int e : list)
//            result[i++] = e;
//        return result;
//    }


    /**
     * 排序数组使用两个指针，边比较边移动指针位置
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int len1 = nums1.length;
        int len2 = nums2.length;

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0, j = 0; i < len1 && j < len2; ) {
            if (nums1[i] == nums2[j]) {
                list.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                i++;
            }
        }

        int[] result = new int[list.size()];
        int i = 0;
        for (int e : list)
            result[i++] = e;
        return result;
    }
}
