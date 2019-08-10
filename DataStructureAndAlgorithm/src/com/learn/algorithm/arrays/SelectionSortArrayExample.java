package com.learn.algorithm.arrays;

import java.util.Arrays;

public class SelectionSortArrayExample {

	public static void main(String[] args) {
		int[] array = ArrayExample.getIntArray();
		System.out.println("After Sorting");
		Arrays.stream(array).forEach((i) -> System.out.print(i + " "));
		System.out.println("");
		for (int lastUnsortedIndex = array.length
				- 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			int largest = 0;
			for (int i = 1; i <= lastUnsortedIndex; i++) {
				if (array[i] > array[largest]) {
					largest = i;
				}

			}
			swap(array, largest, lastUnsortedIndex);

		}
		System.out.println("After Sorting");
		Arrays.stream(array).forEach((i) -> System.out.print(i + " "));
	}
	public static void swap(int[] intArray, int i, int j) {
		if (i == j) {
			return;
		}
		int temp = intArray[i];
		intArray[i] = intArray[j];
		intArray[j] = temp;

	}
}
