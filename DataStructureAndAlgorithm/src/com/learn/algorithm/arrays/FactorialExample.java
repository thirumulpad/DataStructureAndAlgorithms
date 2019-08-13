package com.learn.algorithm.arrays;

public class FactorialExample {

	public static int recursiveFactorial(int num) {
		if (num != 0) {
			return num * recursiveFactorial(num - 1);
		}
		return 1;
	}

	public static int iterativeFactorial(int num) {
		int factorial = 1;
		if (num != 0) {
			for (int i = 1; i <= num; i++) {
				factorial *= i;
			}
		}
		return factorial;

	}
	public static void main(String[] args) {
		System.out.println(recursiveFactorial(3));
		System.out.println(iterativeFactorial(3));
	}

}
