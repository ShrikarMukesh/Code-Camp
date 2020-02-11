package com.exmp;

public class CharacterCount2 {

	public static void count(String str) {
		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			String temp = "";
			while (i < ch.length && ch[i] != ' ') {
				temp += ch[i];
				i++;
			}
			if (temp.length() > 0) {
				System.out.println(temp + "->" + temp.length());
			}
		}

	}

	public static void main(String[] args) {
		String str = "hello how are you??a ";
		count(str);
	}

}
