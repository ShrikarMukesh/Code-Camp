package com.exmp;

public class BinarySearch {

	public static void main(String[] args) {
		
		int arr[]= {2,5,6,7,8,12,23,34,56,67,78,89};
		int item=8;
		int first=0;
		int last=arr.length-1;
		System.out.println("Lenght of the array is = "+last);
		int mid=(first+last)/2;
		while(first<=last)
		{
			//System.out.println(mid);
			if(arr[mid]==item){
				System.out.println("element is present at " + mid + " index position ");
				break;
			}
			else if(arr[mid]<item)
			{
				first = mid+1;
			}
			else
			{
				last = mid-1;
			}
			mid=(first+last)/2;

		}
		if(first>last)
		{
			System.out.println("element not found.");
		}
	}

}
