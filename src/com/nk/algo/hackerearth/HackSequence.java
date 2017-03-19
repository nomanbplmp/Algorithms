package com.nk.algo.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HackSequence {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine().trim());
		long M = 1000000007;
		for (int i = 0; i < N; i++) {
			long n = Long.parseLong(br.readLine().trim());
			if (n > 2) {
				long[][] Z = { { 2014, 69 }, { 1, 0 } }, r = new long[2][2];
				mp(Z, n - 2, r, M);
				System.out.println((r[0][0] + r[0][1]) % M);
			} else
				System.out.println(1 % M);
		}
	}

	static void mp(long[][] Z, long n, long[][] a, long M) {
		long[][] t = new long[2][2];
		a[0][0] = 1;
		a[1][0] = 0;
		a[0][1] = 0;
		a[1][1] = 1;
		int i, j;
		while (n > 0) {
			if ((n & 1) == 1) {
				mm(a, Z, t, M);
				for (i = 0; i < 2; i++)
					for (j = 0; j < 2; j++)
						a[i][j] = t[i][j];
			}
			mm(Z, Z, t, M);
			for (i = 0; i < 2; i++)
				for (j = 0; j < 2; j++)
					Z[i][j] = t[i][j];
			n = n / 2;
		}

	}

	static void mm(long[][] a, long[][] b, long[][] c, long M)// multiply matrix
																// a and b. put
																// result in c
	{
		int i, j, k;
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 2; j++) {
				c[i][j] = 0;
				for (k = 0; k < 2; k++) {
					c[i][j] += (a[i][k] * b[k][j]);
					c[i][j] = c[i][j] % M;
				}
			}
		}

	}

}
