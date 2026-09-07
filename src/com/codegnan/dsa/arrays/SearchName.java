package com.codegnan.dsa.arrays;

public class SearchName {

	public static void main(String[] args) {
		String [] name= {"sai","kiran","pavan","manish"};
		String target="sai";
		boolean found = false;
		
		for(String str :name) {
			if(str.equals(target)) {
				found = true;
				break;
			}
		}
		System.out.println(found ?"present":"Not present");

	}

}
