package com.exmp;

import java.util.ArrayDeque;
import java.util.Iterator;
public class Iterator_Demo {
	public static void main(String[] args) {
		
		ArrayDeque<Integer> al = new ArrayDeque<>();
		al.add(23);
		al.add(25);
		al.add(2);
		al.add(33);
		al.add(12);
		System.out.println(al);
		@SuppressWarnings("rawtypes")
		Iterator itr = al.descendingIterator();
		while(itr.hasNext()==true) {
			System.out.println(itr.next());
		}
	}
} 