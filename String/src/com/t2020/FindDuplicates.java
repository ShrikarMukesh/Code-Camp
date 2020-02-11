package com.t2020;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

class FindDuplicates {	
	public static void main(String[] args) {

		String[] sArray = {"I","am","Indian","I","am","Shrikar","I","I","am"};

		Set<String> set = new TreeSet<>();
		Map<String,Integer> map = new HashMap<>();
		int count =0;
		for(int i=0;i<sArray.length;i++) {
			boolean flag = set.add(sArray[i]);

			if(flag==true) {
				map.put(sArray[i], 1);
			}else{
				count = map.get(sArray[i]);
				map.put(sArray[i], ++count);
			}
		}
		Collection<Integer> nums = map.values();
		System.out.println(nums);
		System.out.println(map);
	}
}
