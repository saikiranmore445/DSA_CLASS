package com.codegnan.dsa.arrays;

public class PairSumTp {

	public static void pairsum(int arr[],int target) {
		int left=0;
		int right=arr.length-1;
		boolean found = false;;
		while(left<right) {
			int sum = arr[left]+arr[right];
			if(sum ==target) {
				System.out.println("Found pairs::" +arr[left]+" "+arr[right]);
				left++;
				right--;
				found =true;
			}
			else if(sum<target) {
				left++;
			}
			else {
				right--;
			}
		}
		if(!found) {
			System.out.println("Not Found");
		}
	}
			
	
	
			
			
		public static void main(String[] args) {
			int arr[]= {1,2,3,4,5};
		pairsum(arr,10);
			
		}
		

	

}
