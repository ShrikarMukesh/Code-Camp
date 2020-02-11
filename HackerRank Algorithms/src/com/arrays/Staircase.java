package com.arrays;

import java.util.Scanner;
public class Staircase {
	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much?");
        int n = scanner.nextInt();
        staircase(n);
        scanner.close();
	}
	static void staircase(int n) {
		int count = n-1;
        for(int i =0;i<n;i++) {
        	for(int j=0;j<n;j++) {
        		
        		if(j<count) {
        			System.out.print(" ");
        			//count--;
        		}else {
        			System.out.print("#");
        		}
        				
        	}
        	count--;
        	System.out.println();
        }
    }
}
