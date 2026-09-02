package com.codegnan.dsa.arrays;

public class UpdateArray {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40};
		int newArr[]= {5,10,15,20};
		for(int i =0;i<arr.length;i++) {
			newArr[i]=arr[i];
			
		}
		System.out.println("Old Array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		System.out.println("New Array");
		for(int i =0;i<newArr.length;i++) {
			System.out.print(newArr[i]+ " ");
		}
		

	}

}
