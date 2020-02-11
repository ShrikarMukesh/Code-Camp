package com.string;

import java.util.Scanner;

public class Anagrams {
	static boolean isAnagram(String a, String b) {
		
		a = a.toLowerCase();
		b = b.toLowerCase();
		//char c1[] = a.toCharArray();
		//char c2[] = b.toCharArray();
		
        
        return false;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
