package com.exmp;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList_exmp {	
	public static void main(String[] args) {

		ArrayList< String> ar = new ArrayList< String>();
		ar.add("ab");
		ar.add("bc");
		ar.add("cd");
		ar.add("de");
		ListIterator<String> litr = ar.listIterator();
		while(litr.hasNext())   //In forward direction
		{
			System.out.print(litr.next()+" ");
		}
		System.out.println();
		while(litr.hasPrevious())   //In backward direction
		{
			System.out.print(litr.previous()+" ");
		}
	}
}
