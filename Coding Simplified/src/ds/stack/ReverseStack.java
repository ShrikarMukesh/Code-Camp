package ds.stack;

import java.util.Stack;

public class ReverseStack {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(10);
		s.push(22);
		s.push(89);
		s.push(2);
		System.out.println(s);
		System.out.println(s.peek());
		stackReversal(s);
	}

	private static void stackReversal(Stack<Integer> s) {
        
	}
}
