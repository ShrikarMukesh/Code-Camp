package com.exmp;

public class FindingIndex {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8};
		System.out.println("index of 4 is:"+findIndex(arr,4));
	   int a = 	findIndex(arr,10);
	   if(a==0) {
		   System.out.println("element is not found");
	   }
	
	}
	
	public static int findIndex(int arr[],int item)
	{
		if(arr== null){
			return -1;
		}

		for(int i=0;i<arr.length;i++){
			
			if(arr[i]==item){
				return i;
			}
		}
		return 0;
		
	}

}
