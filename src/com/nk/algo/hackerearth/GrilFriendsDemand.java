package com.nk.algo.hackerearth;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class GrilFriendsDemand {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(
				"D:\\softwares\\workspaces\\workspace-1\\HackerEarthProblems\\src\\gfd_input1.txt")));
		BufferedReader ans = new BufferedReader(new InputStreamReader(new FileInputStream(
				"D:\\softwares\\workspaces\\workspace-1\\HackerEarthProblems\\src\\gfd_input1_ans.txt")));
		String demand = br.readLine();
		char[] chars = demand.toCharArray();
		String line = br.readLine();
		int N = Integer.parseInt(line.trim());
		long start = System.currentTimeMillis();
		for (int i = 0; i < N; i++) {
			String[] seq = br.readLine().trim().split(" ");

			System.out.println(
					solve(chars, Long.parseLong(seq[0]), Long.parseLong(seq[1])).equals(ans.readLine().trim()));
		}
		System.out.println(System.currentTimeMillis() - start);
	}

	private static String solve(char[] chars, long pos1, long pos2) {
		String answer = "No";
		int npos1 = -1;
		int npos2 = -1;

		int length = chars.length;

		npos1 = pos1 > length ? (int) (pos1 % (length)) : (int) pos1;
		npos2 = pos2 > length ? (int) (pos2 % (length)) : (int) pos2;

		answer = chars[npos1 == 0 ? length - 1 : npos1 - 1] == chars[npos2 == 0 ? length - 1 : npos2 - 1] ? "Yes"
				: "No";

		return answer;
	}

}
