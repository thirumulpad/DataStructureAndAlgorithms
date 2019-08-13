package com.learn.algorithm.arrays;

import java.util.Arrays;

public class ShellSortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {20, 35, -15, 7, 55, 1, -22};

		for (int gap = array.length / 2; gap > 0; gap /= 2) {

			for (int i = gap; i < array.length; i++) {
				int newElement = array[i];
				int j = i;
				while (j >= gap && array[j - gap] > newElement) {
					array[j] = array[j - gap];
					j -= gap;
				}
				array[j] = newElement;
			}
		}
		Arrays.stream(array).forEach((i) -> System.out.println(i));
	}

}
