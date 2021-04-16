package com.test;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Example10 {
public static void main(String[] args) {
	String s= "hai how are hai hai";
	int c;
	s = s.toLowerCase();
	String words[] = s.split(" ");
	//System.out.println("Duplicate word");
	Map<String, Integer> word_map= new HashMap<>();
	for(String word : words) {
		if(word_map.get(word)!=null) {
			word_map.put(word,word_map.get(word)+1);
		}else {
			word_map.put(word, 1);
		}
	}
	System.out.println("Duplicate word");
	Set<String> set = word_map.keySet();
	for(String word : set){
	if(word_map.get(word)>1)
		System.out.println(word);
	}
}
}
//	for(int i=0;i<words.length;i++) {
//		c =1;
//		for(int j=i+1;j<words.length;j++) {
//			if(words[i].equals(words[j])) {
//				c++;
//				words[j]="0";
//			}
//		}
//		if(c>1 && words[i]!="0")
//			System.out.println(words[i]);
//	}

