package com.work;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LinkedList<Integer> linkedlist = new LinkedList<>();
       linkedlist.add(23);
       linkedlist.add(13);
       linkedlist.add(20);
       linkedlist.add(53);
       linkedlist.add(12);
       linkedlist.add(32);
       linkedlist.add(14);
       
       System.out.print("The size of the linked list is "+ linkedlist.size());
	}

}
