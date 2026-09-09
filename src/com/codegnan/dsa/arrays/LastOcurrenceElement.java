package com.codegnan.dsa.arrays;

public class LastOcurrenceElement {
	public static void main(String[] args) {
		int arr[]= {1,2,2,3,4};
		int index=-1;
		int target =2;
		int left=0,right=arr.length-1;
		while(left<=right) {
			int mid =(left+right)/2;
			if(arr[mid]==target) {
				index = mid;
				left=mid+1;
				
			}
			else if(arr[mid]>target) {
				right=mid-1;
			}
			else {
				left=mid+1;
			}
			
		}
		System.out.println("LastOccurenceElementIndex:"+index);

	}

}