package edu.firstp;

public class PrimeNumber {

	public static void main(String[] args) { 
		
		//7 
		
		int num=21;
		
		boolean prime=true;
		
		for(int i=2;i<num-1;i++) {
			if(num%i==0) {
				prime=false;
				break;
			}
		}

		
		if(prime) {
			System.out.println("Prime No");
		}else {
			System.out.println("Not A Prime No");
		}
	}

}
