package com.nk.algo.hackerearth;

import java.util.Scanner;

public class NCR {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		while (N > 0) {
			int a = sc.nextInt(), b = sc.nextInt();
			System.out.println(f(5));
			System.out.println(f(a));
			System.out.println(f(b));
			System.out.println(f(a - b));
			System.out.println(f(a) / (f(b) * (f(b - a))));
			N--;
		}
	}

	static long f(int N) {
		if (N == 1)
			return 1;
		return N * f(N - 1);
	}
}