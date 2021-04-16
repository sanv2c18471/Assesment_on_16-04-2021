package com.test;

import java.util.Scanner;

public class Example9 {
public static void main(String[] args) {
	int a,b;
	Scanner s= new Scanner(System.in);
	System.out.println("the numbers are");
	a=s.nextInt();
	b=s.nextInt();
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("Swapping number");
	System.out.println(a);
	System.out.println(b);
	
	String s1="hai";
	String s2="hello";
	System.out.println(s1+" "+s2);
	s1=s1+s2;
	s2=s1.substring(0, (s1.length()-s2.length()));
	s1=s1.substring(s2.length());
	System.out.println(s1+" "+s2);
	
}
}
