package com.leetcode.stitch;

public class No009PalindromeNumber {
    
    public static void main(String[] args) {
        
        System.out.println(121 >> 1); // 位运算 左移末尾添0 右移删除末位
        System.out.println(isPalindrome(123234));
    }
    
    
    // Determine whether an integer is a palindrome. Do this without extra space.
    
    public static boolean isPalindrome(int x) {
        
        if(x < 0 || (x % 10 == 0 && x != 0)) return false; // 如果小于0 或者非0的10的倍数 都不算回文
        
        int t = 0;                    // 初始化一个int 装载x从末位开始的回文数
        while(x > t) {                // 查找到x的一般位数就可以了 防止overflow
            t = 10*t + x % 10;        // x : 12321 t : 0 => x : 1232 t : 1 => x : 123 t : 12 => x : 12 t : 123 stop!
            x /= 10;
        }
        
        if(t == x || x == t/10) return true;  // 奇数位的时候 如上 x = t/10  偶数位的时候 x = t
        else return false;
    }
}
