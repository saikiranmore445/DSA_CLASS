package com.codegnan.dsa.arrays;

public class DuplicatesInArray {

	public static void main(String[] args) {
		int arr[]= {1,1,2,3,4,4,5,5,6,7};
		for(int i=0;i<arr.length;i++) {	
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Found:"+arr[i]);
					break;
				}
				
			}
		}
	}}
//remove duplicates from the sorted array
//merge two sorted arraysa1={1,3,5} and a2={2,4,6};