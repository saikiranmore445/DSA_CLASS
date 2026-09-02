package com.codegnan.dsa.arrays;

public class DeletePosition {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40};
		int newarr[] =new int[arr.length-1];
		int pos=2;
		for(int i =0;i<pos;i++) {
			newarr[i]=arr[i];
		}
	for(int i=pos;i<newarr.length;i++) {
		newarr[i]=arr[i+1];
	}
	for(int val : newarr) {
		System.out.println(val);
	}

	}

}
