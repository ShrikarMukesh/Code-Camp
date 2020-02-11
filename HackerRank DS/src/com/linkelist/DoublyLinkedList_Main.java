package com.linkelist;

public class DoublyLinkedList_Main {
	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		/*dll.insertNode(12);
		  dll.insertNode(14);
		  dll.insertNode(15);
		  dll.insertNode(16);*/
		//dll.printDoublyLinkedList();
		dll.SortedInsert(220);
		dll.SortedInsert(21);
		dll.SortedInsert(288);
		dll.SortedInsert(1);
		System.out.println("After");
		dll.printDoublyLinkedList();
	}
}
