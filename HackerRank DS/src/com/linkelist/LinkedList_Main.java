package com.linkelist;

public class LinkedList_Main {

	public static void main(String[] args) {
	
		LinkedList ll = new LinkedList();
		LinkedList ll1 = new LinkedList();
		LinkedList ll2 = new LinkedList();
		ll1.insertRear(1);
		ll1.insertRear(2);
		ll1.insertRear(3);
		ll1.insertRear(4);

		ll2.insertRear(1);
		ll2.insertRear(2);
		ll2.insertRear(3);
		ll2.insertRear(4);
		

		int  d = LinkedList.areIdentical(ll1.head,ll2.head);
		if(d == 1) {
			System.out.println("Identical");
		}else {
			System.out.println("Not identical");
		}

		System.out.println(ll.isEmpty());
		ll.insertRear(22);
		ll.insertRear(98);
		ll.insertRear(78);
		ll.insertRear(12);
		ll.traverse();
		ll.insertFront(19);
		ll.insertFront(54);
		System.out.println("After inserting front");
		ll.traverse();
		System.out.println("Node Value from tail");
		ll.GetNode(2);
		System.out.println(ll.isEmpty());
		System.out.println("*******************************");
		ll.delete(22);
		System.out.println("After deleting the node");
		ll.traverse();
		ll.insertFront(89);
		System.out.println("before getting middle element");
		ll.traverse();
		System.out.println("Middle element in the LinkedList = " + ll.getMiddleElement());
		System.out.println("***************Before reversing***************");
		ll.traverse();
		System.out.println("***************After reversing***************");
		ll.reverse();
		ll.traverse();
		System.out.println("***************Recursive reversing***************");
		ll.reverseRecursive();
		ll.traverse();
		System.out.println("***print reverse********");
		ll.printReverse();
		System.out.println(" \nMiddle element is \n"+ll.getMiddle().data);
		
		System.out.println("Delete duplicate-value nodes from a sorted linked list");
		LinkedList llR = new LinkedList();
		llR.insertRear(1);
		llR.insertRear(2);
		llR.insertRear(2);
		llR.insertRear(3);
		llR.insertRear(3);
		llR.insertRear(5);
		llR.insertRear(5);
		System.out.println("elements beforing removing");
		llR.traverse();
		System.out.println("After removing");
		llR.RemoveDuplicates();
		llR.traverse();
		System.out.println("Find Merge Point of Two Lists");
		LinkedList llM1 = new LinkedList();
		LinkedList llM2 = new LinkedList();
		llM1.insertRear(1);
		llM1.insertRear(2);
		llM1.insertRear(3);
		llM1.insertRear(4);
		llM2.insertRear(1);
		llM2.insertRear(3);
		llM2.insertRear(4);
		llM2.insertRear(5);
	    
	}	
}