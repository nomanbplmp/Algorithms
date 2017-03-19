package com.nk.algo.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DannyPassword {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line.trim());

		List<String> passwords = new ArrayList<String>();
		for (int i = 0; i < N; i++) {
			passwords.add(br.readLine().trim());
		}

		System.out.println(solve(passwords));

	}

	public static String solve(List<String> passwords) {
		HashMap<String, String> map = new HashMap<String, String>();
		for (String password : passwords) {
			if (map.containsKey(reverse(password))) {
				char[] pass = password.toCharArray();
				int midIndex = ((pass.length - 1) / 2);
				return pass.length + " " + pass[midIndex];
			} else {
				map.put(password, password);
			}
		}
		return null;
	}

	public static String reverse(String password) {
		StringBuilder sb = new StringBuilder(password);
		return sb.reverse().toString();

	}

}
