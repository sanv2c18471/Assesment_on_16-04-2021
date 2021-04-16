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
}
}
