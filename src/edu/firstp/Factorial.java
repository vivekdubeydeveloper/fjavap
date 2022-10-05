package edu.firstp;

public class Factorial {

	public static void main(String[] args) {
		int x=6;
		
		//3!=1*2*3
		
		int result=1;
		
		while(x>1) {
			result=result*x;
			x--;
		}
		
		System.out.println("Result ="+result);
		
		int result1=1;
		 x=6;
		for(int y=x;y>1;y--) {
			result1=result1*y;
		}
		
		System.out.println("Result1 ="+result1);
	}
}
