package com.nk.algo.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bulbs {

	public static void main(String args[]) throws Exception {
		int RED = 1, GREEN = 2, BLUE = 4, BLACK = 0, YELLOW = 3, CYAN = 6, MAGENTA = 5, WHITE = 7;
		boolean red = false;
		boolean green = false;
		boolean blue = false;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().split(" ");
		int t = Integer.parseInt(line[0]);
		int r = Integer.parseInt(line[1]);
		int g = Integer.parseInt(line[2]);
		int b = Integer.parseInt(line[3]);
		int[] nums = new int[t];
		fill(r, red,RED,  nums);
		fill(g, green,GREEN,  nums);
		fill(b, blue,BLUE,  nums);
		
		int[] count = new int[8];
		
		for(int i=0;i<nums.length;i++){
			count[nums[i]] = count[nums[i]] + 1; 
		}
		
		System.out.print(count[RED] + " ");
		System.out.print(count[GREEN] + " ");
		System.out.print(count[BLUE] + " ");
		System.out.print(count[YELLOW] + " ");
		System.out.print(count[CYAN] + " ");
		System.out.print(count[MAGENTA] + " ");
		System.out.print(count[WHITE] + " ");
		System.out.print(count[BLACK] );
	
	}

private static void fill(int time,boolean bool,int val,int[] nums){
	for (int i = time; i < nums.length;) {
		bool = !bool;
		if (bool) {
			for (int j = 0; j < time; j++) {
				if((i+j)<nums.length)
				nums[i+j] = nums[i+j] + val;
			}
		}
		i = i + time ;
		
	}

}
	
	
}
