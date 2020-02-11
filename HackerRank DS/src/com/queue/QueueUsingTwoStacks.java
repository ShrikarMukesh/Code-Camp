package com.queue;

import java.util.Scanner;
import java.util.Stack;

public class QueueUsingTwoStacks {

	public static void main(String[] args) {

		MyQueue queue = new MyQueue();

		Scanner scan = new Scanner(System.in);
		System.out.println("How many u want to perform?");
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			int operation = scan.nextInt();
			if (operation == 1) { 
				// enqueue
				System.out.println("Ok Insert");
				queue.enqueue(scan.nextInt());
			} else if (operation == 2) { 
				// dequeue
				queue.dequeue();
				System.out.println("Peek element is popped");
			} else if (operation == 3) { 
				// print/peek
				System.out.println("The peek element");
				System.out.println(queue.peek());
			}
		}
		scan.close();
	}

	public static class MyQueue {

		private Stack<Integer> stack1 = new Stack<>();
		private Stack<Integer> stack2 = new Stack<>();

		public int size() {
			return stack1.size() + stack2.size();
		}
		public void enqueue(Integer num) {
			stack1.push(num);
		}

		public Integer dequeue() {
			if (size() == 0) {
				return null;
			}
			if (stack2.isEmpty()) {
				shiftStacks();
			}
			return stack2.pop();
		}

		public Integer peek() {
			if (size() == 0) {
				return null;
			}
			if (stack2.isEmpty()) {
				shiftStacks();
			}
			return stack2.peek();
		}

		/* Only shifts stacks if necessary */
		private void shiftStacks() {
			if (stack2.isEmpty()) { 
				// shifting items while stack2 contains items would mess up our queue's ordering
				while ( ! stack1.isEmpty()) {
					stack2.push(stack1.pop());
				}
			}
		}

		
	}

}
