package com.nk.algo.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PizzaDrink {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine().trim());
		for (int j = 0; j < N; j++) {

			String[] str = br.readLine().trim().split(" ");
			int[] arr = new int[str.length];
			System.out.println(solve(arr) == 0 ? "Ashima" : "Aishwarya");

		}
	}

	private static int solve(int[] arr) {

		// TODO

		return 0;
	}
}
