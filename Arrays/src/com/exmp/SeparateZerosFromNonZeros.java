package com.exmp;

import java.util.Arrays;
class SeparateZerosFromNonZeros {
	public static void main(String[] args) {
		int[] a = {12,0,0,5,56,0,9,0,19,0,1,0,0};
		int flag = 0;

		for(int i=0;i<a.length;i++) {
			if(a[i] != 0 ) {
				a[flag] = a[i];
				flag++;
			}
		}
		while(flag<a.length) {

			a[flag] = 0;
			flag++;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+ " ");
		}
		//second way
		System.out.println("");
		moveZerosToFront(new int[] {12, 0, 7, 0, 8, 0, 3});
	} 
	
	private static void moveZerosToFront(int inputArray[])
	{
		//Initializing counter to position of last element
		int counter = inputArray.length-1;
		//Traversing the inputArray from right to left
		for (int i = inputArray.length-1; i >= 0; i--)
		{
			//If inputArray[i] is non-zero
			if(inputArray[i] != 0)
			{
				//Assigning inputArray[i] to inputArray[counter]
				inputArray[counter] = inputArray[i];
				//Decrementing the counter by 1
				counter--;
			}
		}
		//Assigning 0 to remaining elements
		while (counter >= 0)
		{
			inputArray[counter] = 0;
			counter--;
		}
		System.out.println(Arrays.toString(inputArray));
	}
}
