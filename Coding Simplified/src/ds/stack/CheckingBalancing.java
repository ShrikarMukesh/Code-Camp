package ds.stack;

import java.util.Stack;

public class CheckingBalancing {
	public static void main(String[] args) {
		String s = "(A+B)+(C-D)";
		
		boolean b =  isValidSymbolPattern(s);
		if(b) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

	private static boolean isValidSymbolPattern(String s) {
		
		Stack<Character> stk = new Stack<Character>();
		if(s==null || s.length() == 0) {
			return true;
		}
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == ')') {
				if(!stk.isEmpty() && stk.peek() == '(') {
					stk.pop();
				}else {
					return false;
				}
				
			}else if(s.charAt(i) == ']') {
				if(!stk.isEmpty() && stk.peek() == '[') {
					stk.pop();
				}else {
					return false;
				}
				
			}else if(s.charAt(i) == '}') {
				
				if(!stk.isEmpty() && stk.peek() == '{') {
					stk.pop();
				}else {
					return false;
				}
				
			}else {
				stk.push(s.charAt(i));
			}
		}
		if(stk.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
}
