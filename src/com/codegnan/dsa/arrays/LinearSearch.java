package com.codegnan.dsa.arrays;

public class LinearSearch {
	public static int linearSearch(int num[],int key) {
		for(int i =0;i<num.length;i++) {
			if(num[i]==key) {
				return i;
			}
			
		}
		return -1;
	}

	public static void main(String[] args) {
		int num[] = {2,3,4,5,6};
		int key =4;
		int index=linearSearch(num,key);
	if(index ==-1) {
		System.out.println("Element Not Found");
	}
	else {
		System.out.println("Found at the Index" + " "+ index);
	}
		

	}

}
