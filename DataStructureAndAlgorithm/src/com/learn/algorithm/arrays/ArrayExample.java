package com.learn.algorithm.arrays;

import java.util.Arrays;

public class ArrayExample {

	public static int[] getIntArray() {
		int[] intArray = new int[7];

		intArray[0] = 5;
		intArray[1] = 9;
		intArray[2] = 3;
		intArray[3] = 9;
		intArray[4] = 8;
		intArray[5] = 4;
		intArray[6] = 1;
		return intArray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = getIntArray();

		Arrays.stream(intArray).forEach((i) -> System.out.println(i + " "));
	}
}
