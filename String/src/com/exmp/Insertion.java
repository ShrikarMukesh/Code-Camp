package com.exmp;

import java.util.Scanner;

public class Insertion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int[] arr = new int[size];
		System.out.println("enter the elements");
	    for(int i=0;i<size;i++) 
	    {	
		   arr[i]=sc.nextInt();
	    }
	   System.out.println("enter the element to be inserted.");
	   int elem=sc.nextInt();
	   System.out.println("enter the position where element to be inserted.");
	   int pos=sc.nextInt();
	   for(int i=size;i>pos;i--)
	   {
		   arr[i]=arr[i-1];
	   }
	   arr[pos]=elem;
	   System.out.println("new array is:");
       for(int i=0;i<size+1;i++)
       {
    	   System.out.println(arr[i]+" ");
       }
       sc.close();
	}

}
