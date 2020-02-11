package com.exmp;

import java.util.Scanner;

public class OneDArray {

	public static void main(String[] args) {
		int arr[]=new int[50];
		Scanner scan = new Scanner(System.in);
		System.out.println("how many elements do you want to store ?");
		int num = scan.nextInt();
		System.out.println("enter"+ num +"elements to an array.");
		for(int i=0;i<num;i++){
			arr[i]=scan.nextInt();
		}
       System.out.print("the elements are:"+" ");
       for(int i=0;i<num;i++){
    	   System.out.print(arr[i]+" ");
       }
       scan.close();
	}

}
