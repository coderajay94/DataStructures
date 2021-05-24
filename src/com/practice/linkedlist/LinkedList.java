package com.practice.linkedlist;

import com.practice.linkedlist.LinkedList.Node;

public class LinkedList {

	Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

	public static void main(String args[]) {

		LinkedList obj = new LinkedList();
		obj.head = new Node(23);
		Node second = new Node(21);
		Node third = new Node(11);
		Node fourth = new Node(12);

		obj.head.next = second;
		second.next = third;
		third.next = fourth;

		// insert element and then print
		// obj.printElements();

		// insert elements in front
		// obj.insertAtStart();

		// insert at position
		Node node = new Node(3);
		// obj.insertAtPosition(3,node);

		// insert at the end
		obj.insertAtEnd(node);

		// delete the node with data
		// obj.deleteDataWithNodeData(3);

		// delete at the end and print
		// obj.printElements();

		// delete the node with position
		obj.deleteDataWithNodePosition(3);
		obj.printElements();
		
		obj.deleteLinkedList();
		
	}

	private void deleteLinkedList() {
		head = null;
		
	}

	private void deleteDataWithNodePosition(int i) {

		Node temp = head;

		if (head == null)
			return;

		int counter = 1;
		if (i == 1) {
			head = head.next;
		}

		while (temp != null && counter == i - 1) {
			temp = temp.next;
			counter++;
		}

		temp = temp.next;
		
		System.out.println("deleted the data at position:" + i);

	}

	private void deleteDataWithNodeData(int data) {
		System.out.println("deleting the data");
		Node temp = head, prev = null;

		if (data == head.data) {
			head = head.next;
			System.out.println("deleting the head node");
			return;
		}

		while (temp != null && temp.data != data) {
			prev = temp;
			temp = temp.next;
		}

		if (temp == null)
			return;

		prev.next = temp.next;

		System.out.println("got the data and deleted");
	}

	private void insertAtEnd(Node node) {

		if (head == null) {
			head = node;
			node.next = null;
		}

		Node last = head;
		while (last.next != null) {
			last = last.next;
		}

		last.next = node;
		node.next = null;

		// insert at the end and print
		printElements();
	}

	private void insertAtPosition(int i, Node nodeAtPos) {

		int count = 1;
		Node n = head;
		while (n != null) {

			if (count == i - 1) {
				nodeAtPos.next = n.next;
				n.next = nodeAtPos;
				break;
			} else {
				n = n.next;
			}
			count++;
		}

		// insert at ith and print
		printElements();
	}

	private void insertAtStart() {

		Node first = new Node(10);
		first.next = head;
		head = first;

		// insert at first and print
		printElements();

	}

	private void printElements() {

		Node n = head;

		while (n != null) {

			System.out.println("data is:" + n.data);
			n = n.next;
		}

	}
}