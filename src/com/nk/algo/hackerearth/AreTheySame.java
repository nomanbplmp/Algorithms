package com.nk.algo.hackerearth;

import java.util.Arrays;
import java.util.Scanner;
public class AreTheySame {
	public static void main(String[] args) throws Exception {
		Scanner br = new Scanner(System.in);String[] st = new String[2];for(int i=0;i<2;i++){st[i] = br.next();	}
		System.out.println(g(st[0]).equals(g(st[1])) ? "YES":"NO");
	}
	static String g(String s){
		char[] c = s.toCharArray(); Arrays.sort(c);return new String(c);
	}
}
