package com.nk.algo.hackerearth;

import java.util.*;
import java.math.*;
import java.io.*;
public class Altf4
{
    public static void main(String args[])throws Exception
    {
        Scanner in=new Scanner(System.in);
        PrintWriter out=new PrintWriter(System.out);
        int t = in.nextInt(), i, j, curNum;
        while(t-- > 0) {
            int n = in.nextInt(), k = in.nextInt();
            int price[] = new int[n], task[] = new int[n];
            for(i=0;i<n;i++) {
                price[i] = in.nextInt();
            }
            for(i=0;i<n;i++) {
                task[i] = in.nextInt();
            }
            for(i=0;i<n;i++) {
                int index = i, min = price[i], temp;
                for(j=i+1;j<n;j++) {
                    if(price[j] < min) {
                        min = price[j];
                        index = j;
                    }
                }
                if(index != i) {
                    temp = price[i];
                    price[i] = price[index];
                    price[index] = temp;
                    temp = task[i];
                    task[i] = task[index];
                    task[index] = temp;
                }
            }
            
            int cost[] = new int[n];
            cost[0] = (task[0] + k) * price[0];
            for(i=1;i<n;i++) {
                cost[i] = cost[i - 1] + (task[i] + k) * price[i];
                curNum = 0;
                for(j=i-1;j>=0;j--) {
                    curNum += task[j];
                    cost[i] = Math.min(cost[i], ((j >= 1) ? cost[j - 1] : 0) + (curNum + task[i] + k) * price[i]);
                }
            }
            out.println(cost[n - 1]);
        }
        out.flush();
    }
}