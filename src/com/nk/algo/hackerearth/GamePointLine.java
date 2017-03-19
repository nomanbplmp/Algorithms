package com.nk.algo.hackerearth;

import java.util.Arrays;

public class GamePointLine {

	private static int lSize = 2;
	private static int pCost = 3;
	private static int lCost = 4;

	public static void main(String[] args) {
		int[] arr = { 2, 3, 10, 3, 7, 15 };
		int[] result = new int[10];
		Arrays.fill(result, Integer.MAX_VALUE);

		System.out.println(eval(arr, result, 0));

	}

	private static int eval(int[] arr, int[] result, int index) {
		if (isEmpty(arr, index))
			return Integer.MAX_VALUE;
		/*
		 * if (index < lSize) { int val = pCost * index;
		 * 
		 * if (val < result[size]) { result[size] = val; }
		 * 
		 * return val; }
		 */
		int min1 = Integer.MAX_VALUE;
		int[] newArr1 = arr.clone();
		for (int i = index; i < newArr1.length; i++) {
			newArr1[i] = 0;
			printArray(newArr1);
			int val = pCost + eval(newArr1, result, index + 1);

			if (val < min1)
				min1 = val;
		}

		int min2 = Integer.MAX_VALUE;
		if (index > lSize) {
			int[] newArr = arr.clone();
			for (int i = 1; i < index; i++) {
				for (int j = 1; i < lSize; j++) {
					if (j + lSize > index)
						break;
					newArr[j] -= 1;
				}
				int val = lCost + eval(newArr, result, index);
				if (val < min1)
					min1 = val;

			}
		}
		return min1 < min2 ? min1 : min2;
	}

	private static boolean isEmpty(int[] arr, int size) {
		if (arr == null || arr.length < 1)
			return false;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > 0)
				return false;
		}
		return true;
	}

	private static void printArray(int[] arr) {
		System.out.print("[ ");
		for (int i : arr) {
			System.out.print(i + ", ");
		}
		System.out.print(" ]");
	}

}
