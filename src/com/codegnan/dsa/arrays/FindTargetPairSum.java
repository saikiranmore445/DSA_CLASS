package com.codegnan.dsa.arrays;

public class FindTargetPairSum {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int target=10;
		boolean found =false;
		for(int i =0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
			if(arr[i]+arr[j]==target) {
				System.out.println("Found pair:"+arr[i]+" " +arr[j]);
				found =true;
			}
			}
		}
		if(!found) {
			System.out.println("Not found pairs");
		}
		


	}

}
