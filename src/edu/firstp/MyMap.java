package edu.firstp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MyMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> m=new HashMap<>();
		
		m.put(1, "Ravi");
		m.put(2, "Ram");
		m.put(3, "Mohan");
		m.put(4, "Pooja");
		
		System.out.println("name="+m.get(3));
		
		System.out.println("Key set");
	
		for(Integer i:m.keySet()) {
			System.out.println("name="+m.get(i));
		}
		
		System.out.println("Entry set");
		
		Iterator<Entry<Integer, String>> itr= m.entrySet().iterator();
		
		while(itr.hasNext()) {
			Entry<Integer, String> entry=itr.next();
			System.out.println("key="+entry.getKey()+" value="+entry.getValue());
		}

	}

}
