package com.demo.strings;

/**
 * 整数反转
 *
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 * 输入: 123
 * 输出: 321
 *
 * 示例 2:
 * 输入: -123
 * 输出: -321
 *
 * 示例 3:
 * 输入: 120
 * 输出: 21
 *
 * 注意:
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2(31次方）,  2（31次方） − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 */
public class ReverseInteger {

    public static void main(String[] args){
        int x = 12345;

        ReverseInteger reverseInteger = new ReverseInteger();
        int result = reverseInteger.reverse(x);

        System.out.println(result);
    }

    /**
     * 从低位到高位遍历
     * 每次将 结果 * 10 加上原数当前位的数字，并判断是否溢出
     * @param x
     * @return
     */
    public int reverse(int x) {
        int result = 0;
        while (x != 0){
            int tmp = result * 10 + x % 10;
            if (tmp / 10 != result){//溢出
                return 0;
            }
            result = tmp;
            x /= 10;
        }
        return result;
    }
}
