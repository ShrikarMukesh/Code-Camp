package com.exmp;

import java.util.Arrays;

/*Java Program To Find All Pairs Of Elements In An Array Whose Sum Is Equal To A Given Number*/

public class PairsOfElementsInArray {

	public static void main(String[] args) {
		System.out.println("This is a kind of ananymous array cretation = "+new int[] {7,6,68,9,0}.length);

		findThePairs(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);

		//second method
        System.out.println("second method");
		findThePairs2(new int[] {4, -5, 9, 11, 25, 13, 12, 8}, 20);

	}

	private static void findThePairs2(int[] a, int inputNumber) {
		
		//Sorting the given array
        Arrays.sort(a);
        System.out.println("Pairs of elements whose sum is "+inputNumber+" are : ");
		int i = 0;
		int j = a.length-1;

		while(i<j) {
			if(a[i] + a[j]  == inputNumber) {

				System.out.println(a[i]+" + "+a[j]+" = "+inputNumber);
				i++;
				j--;
			}
			//If inputArray[i]+inputArray[j] is smaller than inputNumber
			else if (a[i]+a[j] < inputNumber){

				i++;
			}
			//If inputArray[i]+inputArray[j] is greater than inputNumber
			else if (a[i]+a[j] > inputNumber){

				j--;
			}
		}
	}

	private static void findThePairs(int[] a, int inputNumber) {
		for(int i=0;i<a.length;i++) {
			for (int j = i+1; j < a.length; j++){

				if(a[i] + a[j] == inputNumber) {
					System.out.println("PairsOfElementsInArray = "+a[i]+" " +a[j] );
				}
			}
		}
	}

}
