package com.codegnan.dsa.arrays;

public class SquareRootOfElement {
	public static void main(String[] args) {
		int target=16;
		int arr[]= {1,2,3,4,5};
int start = 0;
int end = arr.length;;

while (start <= end) {

    int mid = (start + end) / 2;

    if (mid * mid == target) {
        System.out.println("Square root = " + mid);
        return;
    }
    else if (mid * mid > target) {
        end = mid - 1;
    }
    else {
        start = mid + 1;
    }
}
}}