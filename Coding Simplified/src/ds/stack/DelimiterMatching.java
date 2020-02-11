package ds.stack;

import java.util.Stack;

public class DelimiterMatching {

	static void print(){
		System.out.println("======================");
	}
	public static void main(String[] args) {

		String s1 = "a[b+{c*(u-r)}]";
		System.out.println(checkCorrectBracket(s1));
		print();

		String s2 = "a[b+{c*(u-r)}}]";
		System.out.println(checkCorrectBracket(s2));
		print();

		String s3 = "a+b+c*u-r)}}]";
		System.out.println(checkCorrectBracket(s3));
		print();

		String s4 = "a[[b+{c*(u-r)}]";
		System.out.println(checkCorrectBracket(s4));
		print();
	}

	private static boolean checkCorrectBracket(String s) {

		Stack<Character> st = new Stack<Character>();
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			switch(c) {
			case '{':
			case '[':
			case '(':
				st.push(c);
				break;
			case '}':
			case ']':
			case ')':

				if(!st.isEmpty()) {
					char ch = st.pop();
					if(ch == '{' && c !='}' ||
							ch == '[' && c !=']' ||
							ch == '(' && c !=')') {

						System.out.println("Not valid bracket:" +c);
						return false;
					}

				}else {
					System.out.println("Not valid brackets");
					return false;

				}
				break;
			}
		}
		if(!st.isEmpty()) {
			System.out.println("Not valid bracket");
			return false;
		}
		return true;

	}
}
