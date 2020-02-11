package com.exmp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NonRepeatedChar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the String");
		String str = scan.nextLine();
		char ch = getNonRepeatedCharacter(str);
		System.out.println(ch);
		scan.close();
	}

	public static char getNonRepeatedCharacter(String str) {
		Map<Character,Integer> mapcount=new HashMap<Character,Integer>();
		char[] ch = str.toCharArray();
		for(char ch1:ch){
			mapcount.put(ch1,mapcount.containsKey(ch1)?mapcount.get(ch1)+1:1);
		}
		return 0;
	}
}
