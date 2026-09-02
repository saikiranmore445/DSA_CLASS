package com.codegnan.dsa.arrays;

public class PositionInsert {

	public static void main(String[] args) {
		int arr[] = {12,14,16,19};
		int pos =2;
		int value=25;
		int arr1[]=new int[arr.length+1];
		for(int i =0;i<pos;i++) {
			arr1[i]=arr[i];
		}
		arr1[pos]=value;
		for(int i=pos ;i<arr.length;i++) {
			arr1[pos+1]=arr[i];
		
	}
		for(int i =0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
	}
}
}
	
	

