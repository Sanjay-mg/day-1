package com.ibm.linkedlist;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String[] args) {
		List<String> names = new LinkedList<String>();
		for (int i = 0; i < 500 ; i++) {
			names.add("name"+i);
		}
		names.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return Integer.parseInt(o2.substring(4)) - Integer.parseInt(o1.substring(4));
			}
		});
		System.out.println(names);
	}
}
