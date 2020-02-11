package com.exmp;
public class ArraySpecificValue {

	public static void main(String[] args) {

		int arr[]= {1,88,7,9,4,5};
		System.out.println("array has:");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+" ");
		}
		System.out.println(contains(arr,5));
		System.out.println(contains(arr,90));
	}

	public static boolean contains(int[] arr, int item) {
		for(int arr1:arr){
			if(arr1==item){
				return true;
			}
		}
		return false;
	}

}
