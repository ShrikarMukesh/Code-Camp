package com.exmp;

import java.util.Scanner;

public class FrequencyOfCharacters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = scan.nextLine();
		int count;
		for(char ch='A';ch<='z';ch++){
			count=0;
			for(int i=0;i<str.length();i++){
				if(str.charAt(i)==ch){
					count++;
				}
			}
			if(count!=0)
			{
				System.out.println(ch+"="+count);
			}
		}
		scan.close();
	}
}