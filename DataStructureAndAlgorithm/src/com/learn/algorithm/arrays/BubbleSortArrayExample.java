package com.learn.algorithm.arrays;

import java.util.Arrays;

public class BubbleSortArrayExample {

	public static void swap(int[] intArray, int i, int j) {
		if (i == j) {
			return;
		}
		int temp = intArray[i];
		intArray[i] = intArray[j];
		intArray[j] = temp;

	}

	public static void main(String[] args) {

		int[] intArray = ArrayExample.getIntArray();
		System.out.println("Before sorting");

		for (int lastUnsortedIndex = intArray.length
				- 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			for (int i = 0; i < lastUnsortedIndex; i++) {
				if (intArray[i] > intArray[i + 1]) {
					swap(intArray, i, i + 1);
				}
			}
		}
		System.out.println("After sorting");
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}

}
