package com.nk.algo.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CaptainChoosing {

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		String[] ar = br.readLine().split(" ");
		int val = Integer.MIN_VALUE;
		for (int i = 0; i < N; i++) {
			int temp = Integer.parseInt(ar[i]);
			if (temp > val)
				val = temp;
		}

		System.out.println(val);

	}

}
