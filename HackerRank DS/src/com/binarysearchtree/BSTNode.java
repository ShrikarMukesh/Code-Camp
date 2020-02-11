package com.binarysearchtree;
public class BSTNode {
	public BSTNode left;
	public BSTNode right;
	public int data;

	public BSTNode(int data) {
		this.data = data;
		left = null;
		right = null;
	}

	public BSTNode getLeft() {
		return left;
	}

	public void setLeft(BSTNode left) {
		this.left = left;
	}

	public BSTNode getRight() {
		return right;
	}

	public void setRight(BSTNode right) {
		this.right = right;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
}
