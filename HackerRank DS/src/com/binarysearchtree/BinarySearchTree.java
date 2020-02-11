package com.binarysearchtree;

import java.util.Scanner;

class BinarySearchTree { 

	static BSTNode root; 
	BinarySearchTree() { 
		root = null; 
	} 

	public void insert(int key) { 
		root = insertRec(root, key); 
	} 

	public BSTNode insertRec(BSTNode root, int data) { 

		if (root == null) { 
			root = new BSTNode(data); 
			return root; 
		} 

		/* Otherwise, recur down the tree */
		if (data < root.data) {
			root.left = insertRec(root.left, data); 
			//return root;
		}
		else if (data > root.data) { 
			root.right = insertRec(root.right, data); 
			//return root;
		}
		/* return the (unchanged) node pointer */
		return root; 
	} 
	public static BSTNode insertIterative(int data) {  

		if(root == null) {
			root = new BSTNode(data);
			return root;
		}
		BSTNode current = root;
		while (current != null)
		{
			if(data < current.data)  {   

				if(current.left == null) { 
					current.left = new BSTNode(data); 
					return root; 
				}
				else {
					current = current.left;  
				}
			}
			else {
				if(current.right == null) { 
					current.right = new BSTNode(data);
					return root; 
				}
				else {
					current = current.right; 
				}
			}
		}
		return root;

	}
	void preOrder() { 
		preOrder(root); 
	} 
	
	void preOrder(BSTNode root) { 

		if (root != null) { 
			//System.out.print(root.data+" "); 
			preOrder(root.left); 
			preOrder(root.right); 
			System.out.print(root.data+" ");
		} 
	} 

	public static void main(String[] args) { 

		BinarySearchTree tree = new BinarySearchTree(); 

		/* Let us create following BST 
		   50 
		/	   \ 
	  30	    70 
	 /   \      /  \ 
	20   40    60   80 */
		/*tree.insert(4); 
		tree.insert(2); 
		tree.insert(3); 
		tree.insert(1); 
		tree.insert(7); 
		tree.insert(6); */
		//
		Scanner scan = new Scanner(System.in);
		System.out.println("How many elements");
		int t = scan.nextInt();
		System.out.println("Ok insert");
		for(int i = 0;i<t;i++) {
			int data = scan.nextInt();
			insertIterative(data);
		}
	
		// print inorder traversal of the BST 
		System.out.println("pre-order travarsel");
		tree.preOrder(); 
		System.out.println();
		
		
		scan.close();
	} 
} 
