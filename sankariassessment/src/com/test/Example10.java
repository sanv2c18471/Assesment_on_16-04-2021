package com.test;

public class Example10 {
public static void main(String[] args) {
	String s= "hai how are hai";
	int c;
	s = s.toLowerCase();
	String words[] = s.split(" ");
	System.out.println("Duplicate word");
	for(int i=0;i<words.length;i++) {
		c =1;
		for(int j=i+1;j<words.length;j++) {
			if(words[i].equals(words[j])) {
				c++;
				words[j]="0";
			}
		}
		if(c>1 && words[i]!="0")
			System.out.println(words[i]);
	}
}
}
