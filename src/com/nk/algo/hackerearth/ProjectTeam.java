package com.nk.algo.hackerearth;

import java.util.Arrays;
import java.util.Scanner;

public class ProjectTeam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int n = sc.nextInt();
			int[] power = new int[n];
			for (int j = 0; j < n; j++) {
				power[j] = sc.nextInt();
			}
			solve(power);
		}
	}

	private static void solve(int[] power) {
		Arrays.sort(power);
		int max = -1;
		int min = Integer.MAX_VALUE;
		int total = power.length;
		for (int i = 0; i < power.length;) {
			int sum = power[i] + power[total - 1 - i];
			if (sum > max)
				max = sum;
			else if (sum < min)
				min = sum;
			i = i + 2;
		}
		System.out.println(max - min);
	}
}
