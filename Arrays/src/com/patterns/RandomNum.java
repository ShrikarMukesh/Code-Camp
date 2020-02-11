package com.patterns;

import java.util.Random;
import java.util.Scanner;

public class RandomNum {
	public static void main(String[] input) {
	    Random rn = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.print("How Many Random Numbers You want to Generate ? ");
		int rnum = scan.nextInt();
        System.out.print("\nGenerating " + rnum + " Random Numbers in the range 0...999 \n");
		for (int i = 0; i < rnum; i++) {
			int randnum = rn.nextInt(1000);
			System.out.print(randnum + "   ");
		}
		scan.close();
	}
}
