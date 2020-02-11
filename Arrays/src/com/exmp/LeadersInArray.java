package com.exmp;

import java.util.ArrayList;
import java.util.Arrays;

/*Given an integer array, you have to find all the leader elements in this array. 
         An element is said to be leader if all the elements on it’s right side are smaller than it. 
         Rightmost element is always a leader. For example, 
         if {14, 9, 11, 7, 8, 5, 3} is the given array then {14, 11, 8, 5, 3} are the leaders in this array.
*/

public class LeadersInArray {
	public static void main(String[] args) {
		
		int a[] = {14, 9, 11, 7, 8, 5, 3}; 
		int max = a[a.length-1];
	
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(max);
		
		for(int i=a.length-2; i>=0;i--) {
			
			if(a[i] > max) {
				max = a[i];
				arrayList.add(max);
			}
		
		}
		System.out.println(arrayList);
		//Second method 
		
		findTheLeaders(new int[] {12, 9, 7, 14, 8, 6, 3});
		findTheLeaders(new int[] {8, 23, 19, 21, 15, 6, 11});
        findTheLeaders(new int[] {55, 67, 71, 57, 51, 63, 38});
        findTheLeaders(new int[] {21, 58, 44, 14, 51, 36, 23});
        
        //Third way
        System.out.println("Next way");
        findTheLeaders2(new int[] {12, 9, 7, 14, 8, 6, 3});
	}
	
	private static void findTheLeaders(int[] inputArray) {
		
		 int max = inputArray[inputArray.length-1];
		 System.out.println("The leaders in "+Arrays.toString(inputArray)+" are : ");
		 System.out.println(max);
		 
		 for(int i =inputArray.length-2;i>=0;i--) {
			 if(inputArray[i] >max) {
				 
				 System.out.println(inputArray[i]);
				 max= inputArray[i];
			 }
		 }
	}
	
	private static void findTheLeaders2(int[] inputArray) {
		
		System.out.println("The leaders in "+Arrays.toString(inputArray)+" are :");
        for (int i = 0; i < inputArray.length; i++)
        {
            boolean flag = true;
            for (int j = i+1; j < inputArray.length; j++)
            {
                if (inputArray[j] > inputArray[i])
                {
                    flag = false;
                    break;
                }
            }
            if (flag)
            {
                System.out.println(inputArray[i]);
            }
        }
	}

}
