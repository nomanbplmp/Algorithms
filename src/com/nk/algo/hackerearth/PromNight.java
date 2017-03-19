package com.nk.algo.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PromNight {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line.trim());
		Integer[] answers = new Integer[N];
		for (int i = 0; i < N; i++) {
			String[] gbcount = br.readLine().trim().split(" ");
			int[] boysHeight = new int[Integer.parseInt(gbcount[0])];
			int[] girlsHeight = new int[Integer.parseInt(gbcount[1])];
			String[] str_boysHeight = br.readLine().trim().split(" ");
			for (int j = 0; j < boysHeight.length; j++) {
				boysHeight[j] = Integer.parseInt(str_boysHeight[j]);
			}

			String[] str_girlsHeight = br.readLine().trim().split(" ");

			for (int j = 0; j < girlsHeight.length; j++) {
				girlsHeight[j] = Integer.parseInt(str_girlsHeight[j]);
			}

			answers[i] = solve(boysHeight, girlsHeight);

		}
		long start = System.nanoTime();
		for (Integer ans : answers) {
			if (ans <= 0)
				System.out.println("NO");
			else
				System.out.println("YES");
		}
		System.out.println(System.nanoTime() - start);
	}

	private static Integer solve(int[] boysHeight, int[] girlsHeight) {

		if (girlsHeight.length < boysHeight.length)
			return 0;

		Arrays.sort(boysHeight);
		Arrays.sort(girlsHeight);

		int lastPosition = -1;
		for (int i = 0; i < boysHeight.length; i++) {

			if (boysHeight[i] <= girlsHeight[++lastPosition])
				return 0;

		}

		return 1;
	}

}
