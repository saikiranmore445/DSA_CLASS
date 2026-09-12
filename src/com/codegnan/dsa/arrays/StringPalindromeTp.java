package com.codegnan.dsa.arrays;

public class StringPalindromeTp {

	public static void main(String[] args) {
		String name="madan";
		int left =0;
		int right=name.length()-1;
		while(left<right) {
			if(name.charAt(left)!=name.charAt(right)) {
				System.out.println("Not palindrome");
				return;
			}
				left++;
				right--;
			}
		System.out.println("Palindrome");
		}
	}

		
