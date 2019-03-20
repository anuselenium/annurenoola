package com.anu.practice;

import java.util.HashSet;
import java.util.Set;

public class Hashset {

	public static void main(String[] args) {
		
	Set<String> h = new  HashSet<>();
	h.add("anu");
	h.add("rohit");
	h.add("kohinoor");
	System.out.println(h.size());
	for (String list: h) 
	{
		System.out.println(list);
	}
		

	}

}
