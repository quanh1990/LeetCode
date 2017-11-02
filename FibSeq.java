package com.leetcode.stitch;

public class FibSeq {
	
	public static void main(String[] args) {
		
		System.out.println(FibSeq(1));
		System.out.println(FibSeq(2));
		System.out.println(FibSeq(3));
		System.out.println(FibSeq(4));
		System.out.println(FibSeq(5));
	}
	
	public static int FibSeq(int N) {
		
		// 求 f(n)
		if(N == 1) return 1;
		if(N == 2) return 1;
		
		int[] fib = new int[N+1]; // 数组的每一个元素存储fib数列的对应值
		fib[0] = 0;
		fib[1] = 1;
		fib[2] = 1;
		
		for(int i = 3; i <= N; i++) {
			fib[i] = fib[i-1] + fib[i-2]; // 每个值只需要计算一次存储到数组里，时间复杂度为O(n)，如果用递归的话会重复计算
		}
		
		return fib[N];
	}
}

