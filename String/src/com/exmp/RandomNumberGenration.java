package com.exmp;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenration {
	public static void main(String[] input){

		Scanner scan = new Scanner(System.in);
		System.out.print("How Many Random Numbers You want to Generate ? ");
		int num = scan.nextInt();
		Random rn = new Random();
		for(int i=0; i<num; i++){
			
			int  randnum = rn.nextInt(1000);
			System.out.print(randnum + "   ");
		}
		scan.close();
	}
}
