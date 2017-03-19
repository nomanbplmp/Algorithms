package com.nk.algo.hackerearth;

import java.util.Scanner;

public class HandShake {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		for (int i = 0; i < N; i++) {

			long invited = Integer.parseInt(s.next());
			long attended = Integer.parseInt(s.next());
			System.out.println(((attended) * (attended + 1)) / 2);
		}

	}

}
