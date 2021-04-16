package com.test;

import java.util.ArrayList;
import java.util.Collections;

public class Example5 {
public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<String>();
	list.add("Java");   
	list.add("Spring Boot");   
	list.add("C Programming");   
	list.add("UML");   
	list.add("Rubby");   
	list.add("Data Science");   
	list.add("Computer Networks");  
	list.add("Python");  
	System.out.println("Before Sorting: "+ list);   
	Collections.sort(list, Collections.reverseOrder());   
	System.out.println("After Sorting: "+ list); 
	ArrayList<Integer> list1 = new ArrayList<Integer>();
	list1.add(456);   
	list1.add(322);   
	list1.add(121);   
	list1.add(223);   
	list1.add(789);   
	list1.add(296);   
	list1.add(961);  
	list1.add(234);  
	System.out.println("Before Sorting: "+ list1);   
	Collections.sort(list1, Collections.reverseOrder());   
	System.out.println("After Sorting: "+ list1); 
	
}
}
