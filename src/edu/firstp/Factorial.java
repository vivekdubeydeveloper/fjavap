package edu.firstp;

public class Factorial {

	public static void main(String[] args) {
		int x=6;
		
		int result=1;
		
		while(x>1) {
			result=result*x;
			x--;
		}
		
		System.out.println("Result ="+result);
		
	}
}
