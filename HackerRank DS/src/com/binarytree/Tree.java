package com.binarytree;

import java.util.Scanner;

public class Tree {
	
	public static Node insert(Node root, int data) {

		if(root == null) {
			return new Node(data);
		} else {
			Node cur;
			if(data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static Node insertIterative(Node root,int data) {  

		if(root == null) {
			root = new Node(data);
			return root;
		}
		Node current = root;
		while (current != null)
		{
			if(data < current.data)  {   

				if(current.left == null) { 
					current.left = new Node(data); 
					return root; 
				}
				else {
					current = current.left;  
				}
			}
			else {
				if(current.right == null) { 
					current.right = new Node(data);
					return root; 
				}
				else {
					current = current.right; 
				}
			}
		}
		return root;
	}

	static void preOrder(Node root) {
		if(root ==null) {
			return;
		}else {
			System.out.println(root.data+" ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many elements");
		int t = scan.nextInt();
		System.out.println("Ok insert");
		Node root = null;
		while(t-- > 0) {
			int data = scan.nextInt();
			root = insertIterative(root, data);
		}
		System.out.println("preOrder traversal");
		preOrder(root);
		scan.close();
	}	
}
