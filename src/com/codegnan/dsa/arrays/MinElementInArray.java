package com.codegnan.dsa.arrays;

public class MinElementInArray {

	public static void main(String[] args) {
		int arr[]= {20,10,5,15,40};
		int min=arr[0];
		for(int i =1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println(min);

	}

}
