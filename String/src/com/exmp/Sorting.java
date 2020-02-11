package com.exmp;

import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		String temp;
		Scanner scan = new Scanner(System.in);
		String [] names= new String[5];
		System.out.println("enter 5 names:");
		for(int i=0;i<5;i++)
		{
			names[i]=scan.nextLine();
		}
		System.out.println("sotring has started.....!!!!!!!!");
		for(int i=0;i<5;i++)
		{
		   for(int j=1;j<5;j++)
		   {
			   if(names[j-1].compareTo(names[j])>0)
			   {
			   temp=names[j-1];
			   names[j-1]=names[j];
			   names[j]=temp;
			   }
		   }
		}
		System.out.println("sorting is done successfully..");
		for(int i=0;i<5;i++)
		{
			System.out.println(names[i]);
		}
        scan.close();
	}

}
