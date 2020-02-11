package com.exmp;

public class LargeElement {

	public static void main(String[] args) {
		int i;
		int arr[] = {2,55,7,4,99,997,22};
		int large=arr[0];
		int small = arr[0];
		for(i=0;i<arr.length;i++){
			if(arr[i]>large)
			{
				large=arr[i];
			}else if(arr[i] <small) {
				small = arr[i];
			}
		}
		System.out.println("largest number is : "+large);
		System.out.println("smallest number is : " +small);
	}
}
