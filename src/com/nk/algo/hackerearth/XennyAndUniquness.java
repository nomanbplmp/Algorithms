package com.nk.algo.hackerearth;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class XennyAndUniquness {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String[] a = new String[n];
		Map<String, Integer> m = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String st = s.next();
			m.put(st, 1);
		}
		System.out.println(m.size());
	}
}
