package com.learn.algorithm.arrays;

import java.util.Arrays;

public class MergeSortExample {

	public static void main(String[] args) {
		int[] array = {20, 35, -15, 7, 55, 1, -22};
		mergeSort(array, 0, array.length);
		Arrays.stream(array).forEach((i) -> System.out.println(i));
	}

	public static void mergeSort(int[] intarray, int start, int end) {

		if (end - start < 2) {
			return;
		}
		int mid = (end + start) / 2;
		mergeSort(intarray, start, mid);
		mergeSort(intarray, mid, end);

		merge(intarray, start, mid, end);

	}

	private static void merge(int[] intarray, int start, int mid, int end) {

		// if left side of the partition is less than the right side, let it be
		// for e.g.
		// {-1}{32}
		
		if (intarray[mid - 1] <= intarray[mid]) {
			return;
		}
		int i = start;
		int j = mid;
		int tempIndex = 0;
		int[] temp = new int[end - start];
		// till the array size is covered
		while (i < mid && j < end) {
			// compare the elements in positions i and j, based on the criteria,
			// increment i if element at position i is less than
			// element at position j. or else increment j.
			// in the meantime, copy the lower value to the next value of the
			// temp array.
			temp[tempIndex++] = intarray[i] <= intarray[j]
					? intarray[i++]
					: intarray[j++];
		}
		// copy the largest element to the last position of the array
		System.arraycopy(intarray, i, intarray, start + tempIndex, mid - i);
		System.arraycopy(temp, 0, intarray, start, tempIndex);
	}

}
