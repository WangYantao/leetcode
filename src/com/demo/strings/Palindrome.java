package com.demo.strings;

/**
 * 验证回文字符串
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 *
 * 示例 1:
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 *
 * 示例 2:
 * 输入: "race a car"
 * 输出: false
 */
public class Palindrome {

    public static void main(String[] args){
//        String s = "A man, a plan, a canal: Panama";
        String s = "race a car";

        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome(s));
    }

    /**
     * 先转为小写，然后使用前、后双指针进行比较（跳过非数字和字母字符）
     * @param s
     * @return
     */
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0){
            return true;
        }

        String lowerS = s.toLowerCase();
        int startIndex = 0, endIndex = s.length() - 1;

        while (startIndex < endIndex){
            char startChar = lowerS.charAt(startIndex);
            char endChar = lowerS.charAt(endIndex);
            if (!isNumOrLetter(startChar)){
                startIndex++;
                continue;
            }
            if (!isNumOrLetter(endChar)){
                endIndex--;
                continue;
            }
            if (startChar != endChar){
                return false;
            }
            startIndex++;
            endIndex--;
        }

        return true;
    }

    public boolean isNumOrLetter(char c){
        return (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
    }
}
