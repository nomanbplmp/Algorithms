package com.nk.algo.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class PrayasFund {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line.trim());
		Integer[] answers = new Integer[N];
		for (int i = 0; i < N; i++) {
			String[] swts = br.readLine().trim().split(" ");
			int[] wts = new int[2];
			wts[0] = Integer.parseInt(swts[0]);
			wts[1] = Integer.parseInt(swts[1]);
			int coinwt = wts[1] - wts[0];

			int coincount = Integer.parseInt(br.readLine().trim());
			Coin[] coins = new Coin[coincount];
			for (int j = 0; j < coincount; j++) {
				String[] cargs = br.readLine().trim().split(" ");
				coins[j] = new Coin(Integer.parseInt(cargs[0]), Integer.parseInt(cargs[1]));
			}

			answers[i] = solvedp(coins, coinwt);
		}

		for (Integer ans : answers) {
			if (ans == null || ans <= 0)
				System.out.println("Impossible.");
			else
				System.out.println(ans);
		}

	}

	public static Integer solve(Coin[] coins, int coinwt, int value, int[] cache) {
		if (coinwt < 0)
			return -1;
		if (coinwt == 0) {
			return value;
		}

		for (int j = 0; j < coinwt; j++) {
			int minvalue = Integer.MAX_VALUE;
			for (int i = 0; i < coins.length; i++) {

				Integer retVal = solve(coins, coinwt - coins[i].wt, value + coins[i].val, cache);

				System.out.println(retVal);
				if (i == 0)
					minvalue = retVal;
				else if (minvalue < 0 && retVal != null)
					minvalue = retVal;
				else if (retVal != null && retVal > 0) {
					minvalue = minvalue > retVal ? retVal : minvalue;
				}
			}
		}

		return cache[cache.length - 1];
	}

	public static Integer solved(Coin[] coins, int coinwt, int value, Map<Integer, Integer> cache) {
		if (coinwt < 0)
			return -1;
		if (coinwt == 0) {
			return value;
		}
		if (cache.get(coinwt) != null) {
			System.out.println("found");
			return cache.get(coinwt);
		}

		int minvalue = Integer.MAX_VALUE;
		for (int i = 0; i < coins.length; i++) {
			Integer retVal = 0;

			retVal = solved(coins, coinwt - coins[i].wt, value + coins[i].val, cache);

			if (i == 0)
				minvalue = retVal;
			else if (minvalue < 0 && retVal != null)
				minvalue = retVal;
			else if (retVal != null && retVal > 0) {
				minvalue = minvalue > retVal ? retVal : minvalue;
			}
			cache.put(coinwt, minvalue);
		}

		return minvalue;
	}

	public static int solvedp(Coin[] coins, int wt) {

		int[][] mat = new int[wt + 1][coins.length + 1];

		for (int i = 1; i <= wt; i++) {

			for (int j = 1; j <= coins.length; j++) {

				int val = 0;
				if (i < coins[j - 1].wt) {
					val = mat[i][j - 1];

				} else {
					int reminder = i - coins[j - 1].wt;
					if (reminder > 0) {
						if (mat[reminder][j] == 0) {
							val = mat[i][j - 1];
						} else {
							val = min(mat[i][j - 1], mat[reminder][j] + coins[j - 1].val);
						}
					} else {
						val = min(mat[i][j - 1], coins[j - 1].val);
					}

				}

				mat[i][j] = val;

			}

		}

		return mat[wt][coins.length];
	}

	private static int min(int a, int b) {
		if (a > 0)
			return a > b ? b : a;
		return b;
	}

	static class Coin {
		public int wt;
		public int val;

		Coin(int val, int wt) {
			this.val = val;
			this.wt = wt;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return " " + wt + "- " + val;
		}
	}
}
