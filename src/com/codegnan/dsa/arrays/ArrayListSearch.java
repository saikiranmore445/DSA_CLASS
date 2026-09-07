package com.codegnan.dsa.arrays;
import java.util.Arrays;
import java.util.List;

public class ArrayListSearch {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("pen","paper","book","pen");
	String target = "book";
	for(int i=0;i<list.size();i++) {
		if(list.get(i).equals(target)) {
			System.out.println("Found string" + " at " +i);
			
			return;
		}
	}
System.out.println("no element found");

	}

}
