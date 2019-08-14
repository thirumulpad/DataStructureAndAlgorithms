package com.learn.algorithm.arrays;

import java.util.Arrays;

public class QuickSortExample {

	public static void main(String[] args) {
		int[] array = {20, 35, -15, 7, 55, 1, -22};
		quickSort(array, 0, array.length);
		Arrays.stream(array).forEach((i) -> System.out.println(i));
	}

	public static void quickSort(int[] intArray, int start, int end) {
		if (end - start < 2) {
			return;
		}
		int pivotIndex = partition(intArray, start, end);
		quickSort(intArray, start, pivotIndex);
		quickSort(intArray, pivotIndex + 1, end);

	}

	private static int partition(int[] intArray, int start, int end) {
		int i = start;
		int j = end;
		int pivot = intArray[start];

		while (i < j) {
			// empty loop body to decrement end position to find a value less
			// than the pivot value
			while (i < j && intArray[--j] >= pivot);
			if (i < j) {
				intArray[i] = intArray[j];
			}
			// empty loop body to increment start position to find a value more
			// than the pivot value
			while (i < j && intArray[++i] <= pivot);
			if (i < j) {
				intArray[j] = intArray[i];
			}
		}
		// assign the value of pivot to position j and return the position.
		intArray[j] = pivot;
		return j;
	}

}
