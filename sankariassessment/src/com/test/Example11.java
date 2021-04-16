package com.test;

import java.util.Iterator;
import java.util.LinkedList;

public class Example11 {
	public static void main(String[] args) {
		LinkedList<String> al = new LinkedList<String>();
		al.add("Mango");
		al.add("Apple");
		al.add("Banana");
		al.add("Jackfruit");
		/*Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());*/
		for(String s1 : al) {
			System.out.println(s1);
		}

	}
}
