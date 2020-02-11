package com.arrays;

import java.util.ArrayList;
import java.util.List;

public class ComparetheTriplets {
	public static void main(String[] args) {

		List<Integer> a = new ArrayList<Integer>();
		List<Integer> b = new ArrayList<Integer>();
		a.add(5);  b.add(3);
		a.add(6);  b.add(6);
		a.add(7);  b.add(10);
		System.out.println(a +" "+b);
		List<Integer> ir = compareTriplets(a,b);
		System.out.println(ir);
	}
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

		int countA = 0,countB =0;
		int i=0;
		for(Integer itr : a) {
			
			int d =i++;
			if(itr>b.get(d)) {
				countA++;
			}
			else if(itr < b.get(d)) {
				countB++;
			}else if (itr == b.get(d)) {

			}
		}
		List<Integer> re = new ArrayList<>();
		re.add(countA);
		re.add(countB);
		return re;
	}
}
