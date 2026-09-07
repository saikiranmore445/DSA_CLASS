package com.codegnan.dsa.arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int[] arr = {2,4,6,8,10};
		int first=0,last=arr.length-1;
		while(first<last) {
			int temp=arr[last];
			arr[last]=arr[first];
			arr[first]=temp;
			first++;
			last--;
		
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
			
		}

	}
}