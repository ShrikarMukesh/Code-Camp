package com.exmp;

public class BubbleSort 
{
	public static void main(String[] args){
		
		int arr[]= {23,3,5,8,89,1,9}; 
		int n = arr.length;
		System.out.println("Length of the array is "+ n);
		int temp;
		System.out.println("sorting started.");
		
		for(int i=0;i<n-1;i++){
			
			for(int j=0;j<n-i-1;j++){
				
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			System.out.println("sorting array at phase = " + i);
			for(int k=0;k<n;k++) {
				System.out.print(arr[k]+" ");
			}
			System.out.println();
		}
		System.out.println("sorted array is:");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}		
	}
}