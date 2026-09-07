package com.codegnan.dsa.arrays;

public class FirstEvenNumber {

	public static void main(String[] args) {
		int arr[]= {1,2,4,6,8,9};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println("Found even num:" +arr[i]);
				return;
			}
		

	}
		System.out.println("Not found");

}
}
