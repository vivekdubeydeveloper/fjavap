package edu.firstp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> al=new ArrayList<>();
		
		//add element
		
		al.add(1);
		al.add(5);
		al.add(3);
		al.add(7);
		al.add(2);
		
		//print element
		
		System.out.println(al.get(0));
		System.out.println(al.get(2));
		
		al.remove(0);
		System.out.println("Remove");
		System.out.println(al.get(0));
		
		System.out.println("Find");
		System.out.println(al.indexOf(7));
		
		System.out.println("Contains");
		System.out.println(al.contains(7));
		
		System.out.println("Print 1");
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		
       System.out.println("Print 2");
		
		for(Integer x:al) {
			System.out.println(x);
		}
		
		
		   System.out.println("universal print");
		   
		 Iterator<Integer> itr= al.iterator();
	     while(itr.hasNext()) {
	    	 System.out.println(itr.next());
	     }



	}

}
