package com.exmp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class WordsOccurance {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the input statement.");
		String s=scan.nextLine();
		Map<String,Integer> map = new HashMap<String,Integer>();
		String[]  s1=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			if(!map.containsKey(s1[i]))
			{
				map.put(s1[i], 1);
			}
			else
			{
				map.put(s1[i], map.get(s1[i])+1);
			}
		}

		Set<Map.Entry<String,Integer>> entry= map.entrySet();

		for(Map.Entry<String,Integer>  entryset: entry)
		{
			if(entryset.getValue()>1)
			{
				System.out.printf("%s,%d %n" ,entryset.getKey(),entryset.getValue());
			}
		}

       scan.close();
	}

}




