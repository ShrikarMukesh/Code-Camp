package com.exmp;

public class SpecificElement {

	public static void main(String[] args) {
	int arr[] = {1,2,3,4,5,6,7,8};
	System.out.println(contains(arr,5));
	System.out.println(contains(arr,10));
	
	}
	public static boolean contains(int arr[],int item)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==item){
				return true;
			}
		}
		return false;

		
	}

}
