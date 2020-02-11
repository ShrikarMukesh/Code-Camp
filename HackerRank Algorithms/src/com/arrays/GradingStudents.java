package com.arrays;

import java.util.Scanner;

public class GradingStudents {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many elements?");
		int n = scanner.nextInt();
		int a[] = new int[n];
		System.out.println("Ok insert");
		for(int i =0;i<a.length;i++) {
			a[i] = scanner.nextInt();
		}
		gradingStudents(a);
		scanner.close();
	}
	static int[] gradingStudents(int[] a) {
		
		int counter;
		int finalgardes[] = new int[a.length];
		aa:
		for(int i=0;i<a.length;i++) {
		  int equalCondition = a[i];
		  int currentElement = a[i];
		  
		  counter = 0;
		  if(currentElement < 38) {
			  
			  finalgardes[i] = currentElement;
			  break aa;
		  }
		  while(currentElement % 5 != 0) {
			  currentElement++;
			  counter++;
		  }
		  if(counter < 3) {
			  finalgardes[i] = currentElement;
		  }
		  else if(counter == 3) {
			  finalgardes[i] = equalCondition;
		  }
		}
		return finalgardes;
	    
	}
}
