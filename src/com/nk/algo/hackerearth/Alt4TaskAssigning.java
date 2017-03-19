package com.nk.algo.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Alt4TaskAssigning {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < N; i++) {
			String[] nk = br.readLine().trim().split(" ");
			int n = Integer.parseInt(nk[0]);
			int surcharge = Integer.parseInt(nk[1]);
			int[] pricearr = new int[n];
			int[] taskarr = new int[n];
			int totaltask = 0;
			for (int j = 0; j < n; j++) {
				String[] nt = br.readLine().trim().split(" ");
				pricearr[j] = Integer.parseInt(nt[0]);
				taskarr[j] = Integer.parseInt(nt[1]);
				totaltask = totaltask + taskarr[j];

			}
			solve(pricearr, taskarr, totaltask, surcharge);
		}

	}

	private static void solve(int[] pricearr, int[] taskarr, int totaltask,
			int surcharge) {


		int[] solve = new int[taskarr.length];
		for (int i = 1; i < solve.length; i++)
			solve[i] = Integer.MAX_VALUE;

		for (int j = 1; j <= taskarr.length; j++) {
			for (int i = 0; i < pricearr.length; i++) {
				int cost = solve[j-1] + pricearr[i] * (taskarr[j-1] +  surcharge);
				if (solve[j] > cost) {
					solve[j] = cost;
				}
				
			}
		}
		System.out.println(solve[taskarr.length]);
	}
}
