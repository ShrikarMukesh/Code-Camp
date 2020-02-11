package com.Search;

import java.util.Arrays;

public class MissingNumbers {
	public static void main(String[] args) {
        int a[] = {203,204,205,206,207,208,203,204,205,206};
        int b[] = {203,204,204,205,206,207,205,208,203,206,205,206,204};
        missingNumbers(a,b);
	}
	static int[] missingNumbers(int[] a, int[] b) {
		int n = Math.abs(a.length - b.length);
		System.out.println(n);
        int finalarr[] = new int[n];
        Arrays.sort(a);
        Arrays.sort(b);
       // int counter1 = 0;
       // int counter2 = 0;
        for(int i = 0;i<a.length;i++) {
        	for(int j =0;j<b.length;j++) {
        		if(a[i] == a[j]) {
        			
        		}
        	}
        }
        return finalarr;
    }
}
