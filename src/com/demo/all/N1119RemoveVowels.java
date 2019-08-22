package com.demo.all;

/**
 * 给你一个字符串 S，请你删去其中的所有元音字母（ 'a'，'e'，'i'，'o'，'u'），并返回这个新字符串。
 *
 * 示例 1：
 *
 * 输入："leetcodeisacommunityforcoders"
 * 输出："ltcdscmmntyfrcdrs"
 *
 * 示例 2：
 *
 * 输入："aeiou"
 * 输出：""
 *
 * 提示：
 *
 *     S 仅由小写英文字母组成。
 *     1 <= S.length <= 1000
 */
public class N1119RemoveVowels {

    public static void main(String[] args) {
        N1119RemoveVowels n1119RemoveVowels = new N1119RemoveVowels();
        System.out.println(n1119RemoveVowels.removeVowels("leetcodeisacommunityforcoders"));
    }

    public String removeVowels(String s){
        if (s == null) return null;

        String result = "";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u'){
                result += c;
            }
        }

        return result;
    }
}
