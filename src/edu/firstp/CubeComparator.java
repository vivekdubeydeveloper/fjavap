package edu.firstp;

import java.util.Comparator;

public class CubeComparator implements Comparator<Cube> {

	@Override
	public int compare(Cube o1, Cube o2) {
		// TODO Auto-generated method stub
		return o1.l-o2.l;
	}

}
