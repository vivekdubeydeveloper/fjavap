package myproject;

public class Rectangle {

	int length;
	int width;
	
	public Rectangle(int len,int wid) {
		this.length=len;
		this.width=wid;
	}
	
	
	public int area() {
		return length*width;
	}
	
	public int perimeter() {
		return 2*(length+width);
	}
	
	
	
}
