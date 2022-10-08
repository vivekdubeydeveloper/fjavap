package edu.firstp;

public class MyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="This ";
		String s2=new String("is ");
		
		String s3=new String("a cat.");
		
		System.out.println(s1.charAt(0));
		
		String s4=s1.concat(" is cat.");
		
		System.out.println("s1="+s1);
		System.out.println("s4="+s4);
		
		System.out.println("s1="+s1.contains("cat"));
		
		System.out.println("s1="+s1.startsWith("This"));
		
		String s5="test";
		String s6=new String("Test");
		
		System.out.println(s5==s6);
		System.out.println(s5.equalsIgnoreCase(s6));
		
		String s21=s4.substring(0, 4);
		System.out.println(s21);
		
		System.out.println(s21.toUpperCase());
		

	}

}
