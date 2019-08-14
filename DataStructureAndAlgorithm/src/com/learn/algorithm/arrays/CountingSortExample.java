package com.learn.algorithm.arrays;

import java.util.Arrays;

public class CountingSortExample {

	public static void main(String[] args) {
		int[] array = {2, 5, 8, 9, 2, 8, 7, 10, 4, 3};
		countSort(array, 1, 10);
		Arrays.stream(array).forEach((i) -> System.out.println(i));

	}

	public static void countSort(int[] input, int min, int max) {
		int[] countArray = new int[(max - min) + 1];
		for (int i = 0; i < input.length; i++) {
			countArray[input[i] - min]++;
		}

		int j = 0;
		for (int i = min; i <= max; i++) {
			while (countArray[i - min] > 0) {
				input[j++] = i;
				countArray[i - min]--;
			}
		}
	}

}
