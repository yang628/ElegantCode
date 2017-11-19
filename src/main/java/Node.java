/*
 * Copyright (C) 2009-2016 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */

/**
 * Node
 *
 * @author cheqianzi.ygj
 * @email: cheqianzi@2dfire.com
 * @desc:
 * @since 2017-11-18
 */
public class Node {
	 String name;
	 Node next;

	public Node() {
	}

	public Node(String name, Node next) {
		this.name = name;
		this.next = next;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}


	public static void main(String[] args) {
		//链表数组
		Node[] newTable = new Node[12];
		//这是一个链表：e->next->nextNext->null
		Node nextNext = new Node("three",null);
		Node next = new Node("two",nextNext);
		Node e = new Node("one",next);

		e.next = newTable[0];
		newTable[0] = e;
		e = next;

		e.next = newTable[0];
		newTable[0] = e;
		e = nextNext;

		System.out.println(newTable[0].name);


	}

}