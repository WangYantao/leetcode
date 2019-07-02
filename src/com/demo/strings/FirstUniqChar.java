package com.demo.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * 字符串中的第一个唯一字符
 *
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 *
 * 案例:
 * s = "leetcode"
 * 返回 0.
 *
 * s = "loveleetcode",
 * 返回 2.
 *
 * 注意事项：您可以假定该字符串只包含小写字母。
 */
public class FirstUniqChar {

    public static void main(String[] args){
        String s = "loveleetcode";

        FirstUniqChar firstUniqChar = new FirstUniqChar();
        System.out.println(firstUniqChar.firstUniqChar(s));
    }

    /**
     * 通用方法：
     * 1. 遍历字符串，使用hashmap，key为字符，value为字符出现的次数
     * 2. 再次遍历字符串，返回hashmap中value为1时的位置
     * @param s
     * @return
     */
//    public int firstUniqChar(String s) {
//        if (s == null || s.length() == 0){
//            return -1;
//        }
//        Map<Character, Integer> map = new HashMap<>();
//        for (int i = 0; i < s.length(); i ++){
//            map.put(s.charAt(i), map.get(s.charAt(i)) == null ? 1 : map.get(s.charAt(i)) + 1);
//        }
//        for (int i = 0; i < s.length(); i++){
//            if (map.get(s.charAt(i)) == 1){
//                return i;
//            }
//        }
//        return -1;
//    }

    /**
     * 针对只有 a~z 的改进方法
     * 借助java String类的方法
     * @param s
     * @return
     */
    public int firstUniqChar(String s) {
        if (s == null || s.length() == 0){
            return -1;
        }
        int result  = -1;
        for(char c = 'a'; c < 'z'; c++){
            int indexOfC = s.indexOf(c);
            if (indexOfC != -1 && indexOfC == s.lastIndexOf(c)){
                result = (result == -1 || indexOfC < result ? indexOfC : result);
            }
        }
        return result;
    }
}
