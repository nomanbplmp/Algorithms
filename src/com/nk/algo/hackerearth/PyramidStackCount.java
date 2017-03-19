package com.nk.algo.hackerearth;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class PyramidStackCount {
	public static void main(String[] args) throws Exception {
		Scanner br = new Scanner(new FileInputStream(new File("D:\\puzzle\\pyr.txt")));
		int N = br.nextInt();

		for (int i = 0; i < N; i++) {
			int n = br.nextInt();
			int[] ns = new int[n];

			int k = br.nextInt();
			for (int j = 0; j < n; j++) {
				ns[j] = br.nextInt();
			}

			int[] lis = new int[n];
			/*
			 * for(int j=0;j<n;j++){ if(j < k-1) { lis[j] = 0; continue; }
			 * if(ns[j] > ns[j-1]){ if(lis[j-1] < ((j+1)/k)){ lis[j] = lis[j-1]
			 * + 1; }else{ lis[j] = lis[j-1]; } }else{ lis[j] = lis[j-1]; } }
			 */
			Arrays.sort(ns);

			int j = ns.length - 1;
			int count = 1;
			while (j > 0) {
				if (ns[j] > ns[j - 1]) {
					count++;
				}
				if (count % k == 0)
					j--;
				j--;
			}
			System.out.print(count / k + " -- ");
			System.out.println(formPyramids(ns, k));
		}
	}

	private static int formPyramids(int array[], int height) {
		int answer = 0;

		int stackSize = array.length / height;
		Stack<Integer> stacks[] = new Stack[stackSize];

		for (int i = 0; i < stacks.length; i++) {
			stacks[i] = new Stack<Integer>();
		}
		Arrays.sort(array);

		int index = 0;

		for (int i = array.length - 1; i >= 0; i--) {
			// System.out.println(index%stackSize);

			if (!stacks[index % stackSize].isEmpty()) {
				if (stacks[index % stackSize].peek() > array[i]) {
					stacks[index % stackSize].push(array[i]);
					index++;
				}

			} else {
				stacks[index % stackSize].push(array[i]);// push 1st element
				index++;
			}

		}

		for (int i = 0; i < stacks.length; i++) {

			if (stacks[i].size() >= height)
				answer++;
		}

		return answer;
	}
}
