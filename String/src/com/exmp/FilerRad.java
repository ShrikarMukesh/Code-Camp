package com.exmp;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FilerRad {
	public static void main(String[] input) {
  
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter File Name to Open (with extension like file.txt) : ");
		String fname = scan.nextLine();
		String line = null;
		try {
			FileReader fr = new FileReader(fname);
			BufferedReader br = new BufferedReader(fr);
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
		} catch (IOException ex) {
			System.out.println("Error reading file named '" + fname + "'");
		}
		
		scan.close();
	}
}
