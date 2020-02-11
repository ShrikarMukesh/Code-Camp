package bst;

class Node{

	int data;
	Node left;
	Node right;

}
class BST{


	public Node createNewNode(int val) {

		Node newNode = new Node();
		newNode.data=val;
		newNode.left=null;
		newNode.right =null;
		return newNode;
	}
	public Node insert(Node node,int val) {

		if(node == null) {
			return createNewNode(val);
		}
		if(val < node.data) {
			node.left = insert(node.left,val);
		}
		else if(val > node.data) {
			node.right = insert(node.right,val);
		}
		return node;	
	}
	
	public Node delete(Node node, int val) {
		if(node == null) {
			return node;
		}

		if(val < node.data) {
			node.left = delete(node.left, val);
		} else if(val > node.data) {
			node.right = delete(node.right, val);
		} else {
			if(node.left == null || node.right == null) {
				
				Node temp = node.left != null ? node.left : node.right;

				if(temp == null) {
					return null;
				} else {
					return temp;
				}
			} else {
				Node successor = getSuccessor(node);
				node.data = successor.data;

				node.right = delete(node.right, successor.data);
				return node;
			}
		}

		return node;
	}

	public Node getSuccessor(Node node) {
		if(node == null) {
			return null;
		}

		Node temp = node.right;

		while(temp.left != null) {
			temp = temp.left;
		}

		return temp;
	}
}
public class BSTApp {
	public static void main(String[] args) {
		BST bst = new BST();
		Node root = null;
		//8, 3, 6, 10, 4, 7, 1, 14, 13
		root = bst.insert(root,8);
		root = bst.insert(root,3);
		root = bst.insert(root,6);
		root = bst.insert(root,10);
		root = bst.insert(root,4);
		root = bst.insert(root,7);
		root = bst.insert(root,1);
		root = bst.insert(root,14);
		root = bst.insert(root,13);

		//root = bst.delete(root, 1);
		//root = bst.delete(root, 14);
		root = bst.delete(root, 3);
		
	}
}
