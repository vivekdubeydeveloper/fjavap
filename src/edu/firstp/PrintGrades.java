package edu.firstp;

public class PrintGrades {

	public static void main(String[] args) {
		//Print Grades
		
		/*
		 * If any person get marks 60 % or more print First
		 * 
		 * If any person get marks between 45 % to 59% Second
		 * 
		 * If any person get marks between 33 % to 44% Third
		 * 
		 * less than 33 print fail
		 * 
		 */
		
		int total=500, marks=200*100;
		
		
		int per=marks/total;
		
		if(per>=60) {
			System.out.println("First");
		}else if(per>=45 && per<=59){
			System.out.println("Second");
		}else if(per>=33 && per<=44){
			System.out.println("Third");
		}else {
			System.out.println("Fail");
		}
		

	}

}
