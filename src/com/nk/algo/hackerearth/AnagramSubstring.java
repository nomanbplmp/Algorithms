package com.nk.algo.hackerearth;

import java.util.Scanner;

public class AnagramSubstring {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		for (int i = 0; i < N; i++) {

			String text = s.next();

			int n = s.nextInt();
			String[] q = new String[n];
			for (int j = 0; j < n; j++) {
				q[j] = s.next();
			}
			System.out.println(solve(text, q));
		}

	}

	private static int solve(String text, String[] queries) {
		int count = 0;
		for (String q : queries) {
			int[] fr = new int[256];
			int[] frt = new int[256];
			for (char c : q.toCharArray()) {
				fr[c] = fr[c] + 1;
			}
			char[] tc = text.toCharArray();
			for (int i = 0; i < q.length(); i++) {
				frt[tc[i]] = frt[tc[i]] + 1;
			}
			for (int i = q.length()-1; i < text.length(); i++) {

				if (compare(q.toCharArray(),tc.length, fr, frt))
					count++;
				
				frt[tc[i]]++;

				// Remove the first character of previous window
				frt[tc[i - (q.length()-1)]]--;
			}

		
			System.out.println(count + ">>>");
		}
		

		return count;
	}

	private static boolean compare(char[] c,int m, int[] fr, int[] frt) {
		for (int i = 0; i < c.length; i++) {
			if (fr[i] != frt[c[i]])
				return false;
		}
		return true;
	}

}
