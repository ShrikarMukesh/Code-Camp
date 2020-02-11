package com.exmp;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CharOccurance {

	public static void main(String[] args) {
		String s = "Shivanand";
		displayDuplicates(s);

	}

	public static void displayDuplicates(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] arry = str.toCharArray();
		for (char ch : arry) {
			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			} else {
				map.put(ch, map.get(ch) + 1);
			}
		}

		Set<Map.Entry<Character, Integer>> entry = map.entrySet();

		for (Map.Entry<Character, Integer> entryset : entry) {
			if (entryset.getValue() > 1) {
				System.out.printf("%s,%d %n", entryset.getKey(), entryset.getValue());
			}
		}

	}

}
