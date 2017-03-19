package com.nk.algo.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Finding_pairs {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testcount; i++) {
			int nums = Integer.parseInt(br.readLine());
			String[] arr = br.readLine().split(" ");
			int[] iarr = new int[arr.length];
			for (int ii = 0; ii < iarr.length; ii++)
				iarr[ii] = Integer.parseInt(arr[ii]);
			solve(iarr);
		}
	}

	private static void solve(int[] iarr) {

	}

}
