package com.codegnan.dsa.arrays;

public class MoveZeroesToEndTP {

	public static void main(String[] args) {
		int arr[] = {1,3,0,0,4,5};
		int slow=0;
		for(int fast=0;fast<arr.length;fast++) {
				if(arr[fast]!=0) {
					int temp= arr[slow];
					arr[slow]=arr[fast];
					arr[fast]=temp;
					slow++;
					
				}
					
				}
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}
			
		

	}

}
