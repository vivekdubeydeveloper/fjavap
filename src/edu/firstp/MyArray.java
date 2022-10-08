package edu.firstp;

public class MyArray {

	public static void main(String[] args) {
		
		int [] x=new int [2];
		x[0]=12;
		x[1]=13;
		
		int [] y= {1,2,3,4,5};
		
		for(int i=0;i<y.length;i++) {
			System.out.println(y[i]);
		}
		
		
		int []marks= {30,40,30,20,40};
		
		int sum=0;
		
		for(int j=0;j<marks.length;j++) {
			sum=sum+marks[j];
		}
		
		System.out.println("Sum="+sum);
		
		int avg=sum/marks.length;
		
		System.out.println("Avg="+avg);
		

	}

}
