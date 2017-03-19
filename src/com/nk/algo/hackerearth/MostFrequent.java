package com.nk.algo.hackerearth;

import java.util.Arrays;
import java.util.Scanner;

public class MostFrequent {
	public static void main(String[] args) throws Exception {
		Scanner br = new Scanner(System.in);
		int N = br.nextInt();
		int[] ns = new int[N];
		for (int i = 0; i < N; i++) {
			ns[i] = br.nextInt();
		}
		Arrays.sort(ns);
		int a = -2147483648;
		int n = a, pn = a, c = 0, pc = 0;
		for (int i : ns) {
			if (!(i == n)) {
				if (c > pc) {
					pc = c;
					pn = n;
				}
				c = 1;
				n = i;
			} else {
				c++;
			}
		}
		System.out.println(c > pc ? n : pn);
	}

}
