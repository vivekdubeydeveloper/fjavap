package edu.firstp;

public class Cube {
	
	public int l;
	public int w;
	public int h;
	
	public Cube(int l, int w, int h) {
		this.l = l;
		this.w = w;
		this.h = h;
	}
	
	
	public int voulme() {
		return l*w*h;
	}
	
	public static void main(String[] args) {
		Cube c=new Cube(10,5,10);
		System.out.println("volume="+c.voulme());
		System.out.println("length="+c.l);
	}

}
