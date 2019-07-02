package com.demo.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 有效的字母异位词
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 *
 * 示例 1:
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 *
 * 示例 2:
 * 输入: s = "rat", t = "car"
 * 输出: false
 *
 * 说明:
 * 你可以假设字符串只包含小写字母。
 *
 * 进阶:
 * 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
 */
public class Anagram {

    public static void main(String[] args){
        String s = "anagram", t = "nagaram";

        Anagram anagram = new Anagram();
        System.out.println(anagram.isAnagram(s, t));
    }

    /**
     * 借助java集合类方法
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.length() != t.length()){
            return false;
        }
        char[] strS = s.toCharArray();
        char[] strT = t.toCharArray();
        Arrays.sort(strS);
        Arrays.sort(strT);
        return Arrays.equals(strS, strT);
    }

    /**
     * 使用hashmap
     * @param s
     * @param t
     * @return
     */
//    public boolean isAnagram(String s, String t) {
//        if (s == null || t == null || s.length() != t.length()){
//            return false;
//        }
//        Map<Character, Integer> map = new HashMap<>();
//        for (int i = 0; i < s.length(); i++){
//            Integer tmpS = map.get(s.charAt(i));
//            map.put(s.charAt(i), tmpS == null ? 1 : tmpS + 1);
//            Integer tmpT = map.get(t.charAt(i));
//            map.put(t.charAt(i), tmpT == null ? -1 : tmpT - 1);
//        }
//        for (char c = 'a'; c <= 'z'; c++){
//            if (map.get(c) != null && map.get(c) != 0){
//                return false;
//            }
//        }
//        return true;
//    }
}
