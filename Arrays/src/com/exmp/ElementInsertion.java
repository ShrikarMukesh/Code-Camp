package com.exmp;

public class ElementInsertion {

	public static void main(String[] args) {
		
		int a[] = {9,6,7,1,4};
		int insert = 23;
		int pos = 2;
		for(int i=0;i<a.length;i++) {
			if(i == pos) {
				a[i] = insert;
			}
		}
		
		System.out.println("final aray is");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+ " ");
		}
	}

}
