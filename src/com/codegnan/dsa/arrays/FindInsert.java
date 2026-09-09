package com.codegnan.dsa.arrays;

public class FindInsert {
	public static void main(String[] args) {
		int arr[]= {1,3,4,5};
		int left=0;
		int right=arr.length-1;
		int target=2;
		while(left<=right) {
			int mid = (left+right)/2;
			if(arr[mid]<target) {
				left = mid+1;
				
			}
			else {
				right=mid-1;
				
			}
		}
		System.out.println(left);
		
	}

}
