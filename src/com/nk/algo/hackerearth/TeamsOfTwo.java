package com.nk.algo.hackerearth;

import java.util.Scanner;

public class TeamsOfTwo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		for (int i = 0; i < N; i++) {
			int n = s.nextInt();
			int[] stds = new int[n];
			for (int j = 0; j < n; j++) {
				stds[j] = s.nextInt();
			}
			solve(stds);
		}
	}

	private static void solve(int[] array) {

	}

}
