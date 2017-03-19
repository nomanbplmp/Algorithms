package com.nk.algo.hackerearth;

class TreeCharacters {
	public static void main(String args[]) throws Exception {

		int[] ar = new int[] { 1, 2, 3, 4, 5, 5, 7, 8 };

		System.out.println("Hello World!");
		int xored = ar[0];
		int xored1 = ar[0];
		for (int i = 1; i < ar.length - 1; i++) {
			xored = xored ^ ar[i];
		}
		System.out.println(xored);
		for (int i = 1; i < ar.length; i++) {
			xored1 = xored1 ^ ar[i];
		}
		System.out.println(xored ^ xored1);

	}
}