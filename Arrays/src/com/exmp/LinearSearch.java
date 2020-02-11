package com.exmp;

public class LinearSearch {

	public static void main(String[] args) {
		//int arr[]= {1,2,3,4,5,6};
		String [] str= {"pappa","mummy","anna","basu","vaishu","zabi sir","shashi anna"};
		String name="anna";
		
		//int item=4;
		int temp=0;
		
		//for(int i=0;i<arr.length;i++)
		for(int j=0;j<str.length;j++)
		{
			//if(arr[i]==item)
			if(str[j].equals(name)==true)	
				
			{
				System.out.println("element is present at " + j + " index position");
				temp=temp+1;
			}
		}
		if(temp==0)
		{
			System.out.println("element not found.");
		}

	}

}
