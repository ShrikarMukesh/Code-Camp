package com.linkelist;

public class LinkedList {
	Node head;
	int size=0;

	public boolean isEmpty() {

		return (head == null) ? true : false;

		/*if(head == null) {

			return true;
		}else {

			return false;
		}*/
	}

	public void insertRear(int data) {

		//create new node
		Node newNode = new Node(data);
		//If there is no new node in list
		if(head == null) {
			head = newNode;
		}
		else {
			Node temp = head;
			while(temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(newNode);
		}
		size++;
	}

	public void insertFront(int data) {

		Node insertableNode = new Node(data);
		if(head == null) {
			head = insertableNode;
		}else {
			insertableNode.setNext(head);
			head= insertableNode;
		}
	}

	public void delete(int data) {

		if(head.getData() == data) {

			@SuppressWarnings("unused")
			Node temp = head;
			head = head.getNext();
			temp = null;
			size--;
			return;
		}else {

			Node previous = head;
			Node current = head.getNext();
			while(current != null) {
				if(current.getData()== data) {
					previous.setNext(current.getNext());
					current.setNext(null);
					return;
				}
				previous = current;
				current = current.getNext();
			} 
			if(null == current) {
				System.out.println("element is not found");
			}
		}

	} 

	public void traverse() {

		if(head == null) {
			System.out.println("No Elements to display");
		}else {

			Node temp = head;
			while(temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.getNext();
			}
		}
		System.out.println();
	}

	public int getMiddleElement() {
		if(isEmpty() == true) {
			System.out.println("No elements exists");
		}
		else {
			Node p = head;
			Node c = head;
			while(c != null && c.getNext() !=null) {
				p = p.getNext();
				c = c.getNext().getNext();
			}
			return p.getData();
		}
		return 0;
	}

	public void reverse() {

		Node prev = null;
		Node current = head; 
		while(current != null) {

			Node temp = current.getNext();
			current.setNext(prev);
			prev = current;
			current = temp;

		}
		head = prev;
	}

	public void reverseRecursive() {
		Node prev = null;
		Node current = head;
		reverseRec(prev,current);
	}

	private void reverseRec(Node prev, Node current) {
		if(null == current) {
			head =prev;
			return;
		}
		else {
			Node temp = current.getNext();
			current.setNext(prev);
			reverseRec(current,temp);
		}	
	}

	public void printReverse() {
		printRev(head);
	}

	private void printRev(Node head) {

		if(null == head) {
			return;
		}else {

			printRev(head.getNext());
			System.out.print(head.data + " ");
		}
	}
	//Finding the middle element
	public Node getMiddle() {
		if(head == null) { 
			return head; 
		}
		Node slow, fast; 
		slow = fast = head;
		while(fast != null && fast.getNext() != null) {

			slow = slow.getNext(); 
			fast = fast.getNext().getNext();
		}
		return slow;
	}

	static Node findAtPosition(Node head,int data,int position) {

		Node n = new Node();
		n.data = data;
		if(head==null){
			head=n;
			return head;
		}
		if(position==0){
			n.next=head;
			return n;
		}
		else {
			int ctr=0;
			Node temp1 = head;
			while(ctr < position-1 && temp1.next!=null){
				temp1=temp1.next;
				ctr++;
			}
			Node temp2= temp1.next; 
			temp1.next=n; // better temp1's pointer is assinged n;
			n.next=temp2; // n's pointer is assinged temp2 
			return head;
		}
	}

	static int areIdentical(Node headA,Node headB ) 
	{ 
		while( headA != null && headB != null &&headA.data == headB.data){
			headA = headA.next;
			headB = headB.next;
		}
		//return (headA == headB)? 1 : 0;
		if(headA == headB) {
			return 1;
		}else {
			return 0;
		}
	} 
	public void GetNode(int k) {
		int result = GetNode(head, k);
		System.out.println(result);
	}
	int GetNode(Node head, int k) {
		Node curr   = head;
		Node runner = head;

		/* Move runner into the list by k elements */
		for (int i = 0; i < k; i++) {
			runner = runner.next;
		}

		/* Move both pointers */
		while (runner.next != null) {
			curr   = curr.next;
			runner = runner.next;
		}
		return curr.data;
	}
	//Delete duplicate-value nodes from a sorted linked list
	public void RemoveDuplicates() {
		RemoveDuplicates(head);
	}
	public void RemoveDuplicates(Node head) {

		if(head == null) {
			return ;
		}
		Node temp = head;
		while(temp.next != null) {
			if(temp.data == temp.next.data) {
				temp.next = temp.next.next;		
			}else {
				temp = temp.next;
			}
		}

	}
	//Find Merge Point of Two Lists
	int FindMergeNode(Node headA, Node headB) {
		Node currA = headA;
		Node currB = headB;

		while (currA != currB) {
			if (currA.next == null) {
				currA = headB;
			} else {
				currA = currA.next;
			}

			if (currB.next == null) {
				currB = headA;
			} else {
				currB = currB.next;
			}
		}
		return currA.data;
	}
}



















