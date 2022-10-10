package edu.firstp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CubeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Cube> cl=new ArrayList<>();
		cl.add(new Cube(11,5,10));
		cl.add(new Cube(10,5,10));
		cl.add(new Cube(9,6,12));
		
		System.out.println("Size="+cl.size());
		
		for(Cube c:cl) {
			System.out.println(c);
		}
		
		
List<Integer> al=new ArrayList<>();
		
		//add element
		
		al.add(1);
		al.add(5);
		al.add(3);
		al.add(7);
		al.add(2);
		
		Collections.sort(al);
		System.out.println("After sort");
		System.out.println(al);

		
		Collections.sort(cl,new CubeComparator());
		
		for(Cube c:cl) {
			System.out.println(c);
		}
	}
	
	
	

}
