package com.nk.algo.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArrivalOrderComplaints {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine().trim());
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			String[] stands = str.split(" ");
			int[] istands = new int[stands.length-1];
			for (int j = 1; j < stands.length; j++) {
				istands[j-1] = Integer.parseInt(stands[j]);
			}
			System.out.println(solve(istands));

		}
	}

	static int solve(int[] stands) {
	int[] com = new int[stands.length];
	int sum = 0;
    for(int i=1;i<stands.length;i++){		
    	
    		for(int j=0;j<=i-1;j++){
    			if(stands[j] > stands[i]){
    				com[i] = 1+com[i];
    			sum++;
    			}
    		}
    }
		return sum;
		}

}
