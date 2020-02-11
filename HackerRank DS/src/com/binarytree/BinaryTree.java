package com.binarytree;

import java.util.*;
class BinaryTree {
	static Node root;
	
	private static  int heightOfBinaryTree(Node root) {

		int leftHeight, rightHeight;
		if(null == root) {
			return 0;
		}
		if(null == root.getLeft() && null == root.getRight())
			return 0;
		else {

			leftHeight = heightOfBinaryTree(root.getLeft());

			rightHeight = heightOfBinaryTree(root.getRight());

			if(leftHeight > rightHeight) {
				return (leftHeight + 1);
			}
			else {
				return (rightHeight + 1);
			}
			//return (1+Math.max(leftHeight, rightHeight));
		}
	}

	public static Node binaryTreeinsertIterative(Node root,int data) {

		if(root == null) {
			root = new Node(data);
			return root;
		}
		Node current = root;
		while (current != null){
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

	public static Node insertRecursive(Node root,int data) {

		if (root == null) { 
			root = new Node(data); 
			return root; 
		}
		if (data < root.data) {
			root.left = insertRecursive(root.left, data); 
		}
		else if (data > root.data) { 
			root.right = insertRecursive(root.right, data); 
		}
		return root; 
	}	
	
	public static void levelOrder(Node root) {

		Node temp = root;
		if(null == temp) {
			System.out.println("No Elements in the Tree");
			return;
		}
		LinkedList<Node> queue = new LinkedList<Node>();
		queue.addLast(temp);
		while(!(queue.isEmpty())) {
			temp = queue.removeFirst();
			System.out.print(" " +temp.getData());
			if( temp.getLeft() != null) {
				queue.addLast(temp.getLeft());
			}
			if(temp.getRight() != null) {
				queue.addLast(temp.getRight());
			}			
		}
	}
	
	public static void preOrder(Node root) {
		if(root == null) {
			return;
		}else {
			System.out.println(root.data+" ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	static void topView(Node root){
       
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("How many elements");
		int t = scan.nextInt();
		System.out.println("Ok insert");
		Node root = null;
		while(t-- > 0) {
			int data = scan.nextInt();
			//root = binaryTreeinsertIterative(root, data);
			root = insertRecursive(root, data);
		}
		System.out.println("Height = "+heightOfBinaryTree(root));
		System.out.println("Level order traversal");
		levelOrder(root);
		System.out.println();
		System.out.println("Binary Search Tree : Lowest Common Ancestor");
        
		scan.close();
		//System.out.println("top view");
		//topView(root);

	}	
}