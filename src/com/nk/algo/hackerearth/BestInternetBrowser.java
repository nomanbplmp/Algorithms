package com.nk.algo.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;


public class BestInternetBrowser {

public static void main(String[] args) throws IOException {
	Set<String> vwls = new HashSet<String>();
    vwls.add("a");
    vwls.add("e");
    vwls.add("i");
    vwls.add("o");
    vwls.add("u");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = br.readLine();
    int N = Integer.parseInt(line);
    String[] answers = new String[N];
    for (int i = 0; i < N; i++) {
    	
    	 answers[i] = answer(br.readLine(),vwls);
    }
    
  for(String ans  : answers){
	  System.out.println(ans);
  }
  
}	
	
public static String answer(String str,Set<String> vwls){

    int count=0;

    char[] carr = str.toCharArray();
	 for(int i=4;i<carr.length-4;i++){
		 if(!vwls.contains(carr[i]+"")){
			 count++;
		 }
	 }
	
	return count+4+"/"+carr.length;
}


}
