package site.competitiveexamsmaterial;

import java.util.Scanner;

public class NumberOfVowels {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = scan.next();
        char[] carr = s.toCharArray();
        int count =0;
        for(char c: carr) {
        	switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
			}
        }
        System.out.println("number of vowels in string = " + count);
        scan.close();
        
	}
}
