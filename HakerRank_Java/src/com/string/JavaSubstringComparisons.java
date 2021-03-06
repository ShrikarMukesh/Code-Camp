package com.string;

import java.util.Scanner;

public class JavaSubstringComparisons {
	
	public static String getSmallestAndLargest(String s, int k) {
		
		/* Create smallest and largest strings and initialize them */
		String smallest = s.substring(0, k);
		String largest  = s.substring(0, k);

		for (int i = 0; i <= s.length() - k; i++) {
			
			String curr = s.substring(i, i + k);
			
			if (smallest.compareTo(curr) > 0){
				smallest = curr;
			}
			if (largest.compareTo(curr) < 0) {
				largest = curr;
			}
		}
		return smallest +" \n"+largest;
	}
	public static void main(String[] args) {
		System.out.println("Enter the main string");
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();
		System.out.println("smallest and largest sub strings");
		System.out.println(getSmallestAndLargest(s, k));
	}
}
