package com.demo.lintcode;

/**
 * 1. A + B 问题
 *
 * 给出两个整数 aaa 和 bbb , 求他们的和。
 * 样例
 *
 * 样例 1:
 *
 * 输入:  a = 1, b = 2
 * 输出: 3
 * 样例解释: 返回a+b的结果.
 *
 * 样例 2:
 *
 * 输入:  a = -1, b = 1
 * 输出: 0
 * 样例解释: 返回a+b的结果.
 *
 * 挑战
 *
 * 显然你可以直接 return a + b，但是你是否可以挑战一下不这样做？（不使用+++等算数运算符）
 * 说明
 *
 * a和b都是 32位 整数么？
 *
 *     是的
 *
 * 我可以使用位运算符么？
 *
 *     当然可以
 *
 * 注意事项
 *
 * 你不需要从输入流读入数据，只需要根据aplusb的两个参数a和b，计算他们的和并返回就行。
 */
public class APlusB {

    public static void main(String[] args) {
        APlusB aPlusB = new APlusB();
        System.out.println("result = " + aPlusB.aplusb(7, 5));
    }

    public int aplusb(int a, int b) {
        System.out.println("a = " + Integer.toBinaryString(a) + "; b = " + Integer.toBinaryString(b));
        if (a == 0) return b;
        if (b == 0) return a;
        int c = a ^ b;//无进位加法
        int d = (a & b) << 1;//是否出现进位
        return aplusb(c, d);
    }
}
