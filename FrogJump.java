package com.leetcode.stitch;

public class FrogJump {
	
	public static void main(String[] args) {
		
		int N = 3;
		System.out.println("青蛙跳上 " + N + " 级台阶有 " + FrogJump(N) + "种跳法。");
		System.out.println("超级青蛙跳上 " + N + " 级台阶有 " + SuperFrogJump(N) + "种跳法。");
	}
	
	public static int FrogJump(int N) {
		
		// 一只青蛙一次可以跳1级台阶或者2级台阶，问N级台阶一共有多少种跳法？
		if(N <= 0) System.exit(-1);
		if(N == 1) return 1;
		if(N == 2) return 2;
		
		return FrogJump(N-1) + FrogJump(N-2);
	}
	
	public static int SuperFrogJump(int n) {
		
		// 青蛙能耐了 一只青蛙一次可以跳1级台阶或者2级台阶...也可以跳上n级台阶，问n级台阶一共有多少种跳法？
		/*
		 * 🐸 
		 * 用Fib(n)表示青蛙跳上n阶台阶的跳法数，青蛙一次性跳上n阶台阶的跳法数1(n阶跳)，设定Fib(0) = 1；
         * 当n = 1 时， 只有一种跳法，即1阶跳：Fib(1) = 1;
         * 当n = 2 时， 有两种跳的方式，一阶跳和二阶跳：Fib(2) = Fib(1) + Fib(0) = 2;
         * 当n = 3 时，有三种跳的方式，第一次跳出一阶后，后面还有Fib(3-1)中跳法； 第一次跳出二阶后，后面还有Fib(3-2)中跳法；第一次跳出三阶后，后面还有Fib(3-3)中跳法
         * Fib(3) = Fib(2) + Fib(1)+Fib(0)=4;
         * 当n = n 时，共有n种跳的方式，第一次跳出一阶后，后面还有Fib(n-1)中跳法； 第一次跳出二阶后，后面还有Fib(n-2)中跳法..........................第一次跳出n阶后，后面还有 Fib(n-n)中跳法.
         * Fib(n) = Fib(n-1)+Fib(n-2)+Fib(n-3)+..........+Fib(n-n)=Fib(0)+Fib(1)+Fib(2)+.......+Fib(n-1)
         * 又因为Fib(n-1)=Fib(0)+Fib(1)+Fib(2)+.......+Fib(n-2)
         * 两式相减得：Fib(n)-Fib(n-1)=Fib(n-1)         =====》  Fib(n) = 2*Fib(n-1)     n >= 2
		 * */
		if(n == 1) return 1;
		if(n == 2) return 2;
		
		return 2*SuperFrogJump(n-1);
		
	}
}

