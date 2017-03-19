package com.nk.algo.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenNumber {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long read = 0;
		while (true) {
			read = Long.parseLong(br.readLine().trim());
			if (read == -1 || read > 1000000000) {
				break;
			}
			if (read % 2 == 0) {
				System.out.println(read);
			}
		}

	}
}
