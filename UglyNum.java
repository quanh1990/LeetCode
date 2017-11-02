package com.leetcode.stitch;

public class UglyNum {
	
	public static void main(String[] args) {
		
		for(int i = 0; i <= 100; i++) {
			if(IsUglyNum(i)) System.out.print(i + " ");
		}
		
		// 计算第N个丑数
		int i = 2;
		int index = 0;
		int N = 1500;
		while(true) {
			if(IsUglyNum(i)) index++;
			if(index == N) {
				System.out.println("第 " + N + " 个丑数为：" + i);
				break;
			}
			i++;
		}
	}
	
	public static boolean IsUglyNum(int N) {
		
		// 判断 N 是否为丑数（含因子2,3,5的正整数被称作丑数，比如4,10,12都是丑数，而7,23,111则不是丑数，另外1也不是丑数。）
		if(N % 2 == 0 || N % 3 == 0 || N % 5 == 0) return true;
		else return false;
		
	}
}

