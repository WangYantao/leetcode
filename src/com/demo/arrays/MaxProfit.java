package com.demo.arrays;

/**
 * 买卖股票的最佳时机 II:
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 *
 * 示例1：
 * 输入: [7,1,5,3,6,4]
 * 输出: 7
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 3 天（股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5-1 = 4 。
 *      随后，在第 4 天（股票价格 = 3）的时候买入，在第 5 天（股票价格 = 6）的时候卖出, 这笔交易所能获得利润 = 6-3 = 3 。
 *
 * 示例2：
 * 输入: [1,2,3,4,5]
 * 输出: 4
 * 解释: 在第 1 天（股票价格 = 1）的时候买入，在第 5 天 （股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5-1 = 4 。
 *      注意你不能在第 1 天和第 2 天接连购买股票，之后再将它们卖出。
 *      因为这样属于同时参与了多笔交易，你必须在再次购买前出售掉之前的股票。
 *
 * 示例3：
 * 输入: [7,6,4,3,1]
 * 输出: 0
 * 解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
 *
 * 解题思路：
 * 1. 暴力法
 * 2. 峰谷法：将日期和价格看作一张折线图，遍历数组，在波谷的时候买进，波峰的时候卖出。
 * 3. 简单一次遍历：（可以看作贪心算法），每当明天比今天的价格高时，就今天买进明天卖出。
 */
public class MaxProfit {

    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};

        MaxProfit maxProfit = new MaxProfit();
        System.out.println(maxProfit.maxProfit(prices));
    }

    //自己第一次实现
    public int maxProfit(int[] prices){
        if (prices == null || prices.length <= 1){
            return 0;
        }

        int max = 0;
        for (int i = 0; i < prices.length - 1; i++){
            if (prices[i] < prices[i+1]){
                max += prices[i+1] - prices[i];
            }
        }

        return max;
    }
}
