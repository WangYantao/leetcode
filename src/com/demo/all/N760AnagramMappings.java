package com.demo.all;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定两个列表 Aand B，并且 B 是 A 的变位。B 是 A 的变位的意思是 B 由 A 中的元素随机排列生成。
 * 我们希望找出一个从 A 到 B 的索引映射 P 。一个映射 P[i] = j 的意思是 A 中的第 i 个元素出现于 B 中的第 j 个元素上。
 * 列表 A 和 B 可能出现重复元素。如果有多于一种答案，输出任意一种。
 *
 * 例如，给定
 * A = [12, 28, 46, 32, 50]
 * B = [50, 12, 32, 46, 28]
 * 需要返回
 * [1, 4, 3, 2, 0]
 * P[0] = 1 ，因为 A 中的第 0 个元素出现于 B[1]，而且 P[1] = 4 因为 A 中第 1个元素出现于 B[4]，以此类推。
 *
 * 注：
 *     A, B 有相同的长度，范围为 [1, 100]。
 *     A[i], B[i] 都是范围在 [0, 10^5] 的整数。
 */
public class N760AnagramMappings {

    public static void main(String[] args) {
        N760AnagramMappings n760AnagramMappings = new N760AnagramMappings();
        int[] A = {12, 28, 46, 32, 50};
        int[] B = {50, 12, 32, 46, 28};
        int[] result = n760AnagramMappings.anagramMapping(A, B);
        for (int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }

    public int[] anagramMapping(int[] A, int[] B){
        int[] result = new int[A.length];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < B.length; i++){
            map.put(B[i], i);
        }
        for (int i = 0; i < A.length; i++){
            result[i] = map.get(A[i]);
        }
        return result;
    }
}
