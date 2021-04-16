package com.test;
import java.util.ArrayList;
import java.util.Collections;
public class Example4comparable {
  public static void main(String[] args) {
	ArrayList<Student> al = new ArrayList<Student>();
	al.add(new Student(123,"Sankari",21));
	al.add(new Student(127,"Logehwari",23));
	al.add(new Student(121,"Kavya",20));
	al.add(new Student(125,"Yogeshwari",12));
	al.add(new Student(129,"Anupama",29));
	Collections.sort(al);
	for (Student s : al) {
		System.out.println("id: " + s.id + " " + "name: " + s.name + " " + "age: " + s.age);
	}
}
}
class Student implements Comparable<Student> {
	int id;
	String name;
	int age;
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if (id == o.id) {
			return 0;
		} else if (id > o.id) {
			return 1;
		} else {
			return -1;
		}
}
}