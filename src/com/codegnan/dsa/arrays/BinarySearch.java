package com.codegnan.dsa.arrays;

public class BinarySearch {
	public static int binarySearch(int nums[] , int key) {
		int start =0;int end =nums.length-1;
		while(start<=end) {
		int mid =(start+end)/2;
		for(int i =0;i<nums.length;i++) {
			if(nums[mid]==key) {
				return mid;
			}
			if(nums[mid]<key) {
				start =mid+1;
			}
			else {
				end = mid-1;
			}
		}
		
	}
		return -1;
	}

	public static void main(String[] args) {
		int nums[] = {2,3,4,5,6,7};
		int key=7;
		int index = binarySearch(nums,key);
		if(index == -1) {
			System.out.println("Element Not found");
		}
		else {
			System.out.println("Found at the index:" + index);
		}
		

	}

}
