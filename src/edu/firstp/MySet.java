package edu.firstp;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> h=new HashSet<>();
		
		h.add(1);
		h.add(2);
		h.add(5);
		h.add(3);
		h.add(4);
		
		System.out.println(h.contains(4));
		
		System.out.println("Print for each");
		
		for (Integer i : h) {
			System.out.println(i);
		}
		
		System.out.println("Print iterator");
		
		Iterator<Integer> itr=h.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
