package com.leetcode.stitch;

public class No014LongestCommonPrefix {
    
    public static void main(String[] args) {
        
        String[] strs = {"quanheng","quanmanqi","quwanpu","quankuibin","quan"};
        String[] strs1 = {""};
        System.out.println(strs[0].indexOf("quanheng")); // 返回第一次出现的指定子字符串在此字符串中的索引
        System.out.println(longestCommonPrefix(strs));
    }
    
    public static String longestCommonPrefix(String[] strs) {
        
        if (strs.length == 0) return "";
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {

            while (strs[i].indexOf(prefix) != 0) {
                
                System.out.println(strs[i] + " " + prefix + " " + strs[i].indexOf(prefix));
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
