package com.linkelist;

public class DoublyLinkedList {

	public DoublyLinkedListNode head;
	public DoublyLinkedListNode tail;

	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void insertNode(int nodeData) {

		DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);
		if (this.head == null) {
			this.head = node;
		} else {
			this.tail.next = node;
			node.prev = this.tail;
		}
		this.tail = node;
	}
	public  void printDoublyLinkedList() {
		DoublyLinkedListNode temp = head;
		while(temp != null) {
			System.out.println(temp.data + " ");
			temp = temp.next;
		}
	}
	public void SortedInsert(int data) {
		SortedInsert(head,data);
	}
	public DoublyLinkedListNode SortedInsert(DoublyLinkedListNode head, int data) {

		/* Create Node to insert */
		DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
		newNode.data = data;
		if (head == null) { // insert in empty list
			return newNode;
		} 
		else if (data < head.data) { // insert in front of list
			newNode.next = head;
			head.prev = newNode;
			return newNode;
		} 
		else {        
			
			DoublyLinkedListNode n1 = null;
			DoublyLinkedListNode n2 = head;
			while (n2 != null && n2.data < data) {
				n1 = n2;
				n2 = n2.next;
			}   
			if (n2 == null) { 
				// insert at end of list
				n1.next = newNode;
				newNode.prev = n1;
				
			} else { 
				// insert somewhere within the list
				n1.next = newNode;
				n2.prev = newNode;
				newNode.prev = n1;
				newNode.next = n2;
			}	
		}
		return head;
	}
}
