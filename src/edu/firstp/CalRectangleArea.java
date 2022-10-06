package myproject;

public class CalRectangleArea {

	public static void main(String[] args) {
		
		int len=10,width=5;
		
		
		System.out.println("Area=="+area(len, width));
		
		
		//System.out.println("perimeter=="+perimeter);

	}
	
	public static int area(int len,int width) {
		return len*width;
	}
	
	public static int perimeter(int len,int width) {
		return 2*(len+width);
	}

}
