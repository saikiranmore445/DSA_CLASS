package com.codegnan.dsa.arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,4,5,6,7,4};
        int majority = -1;

        for(int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {  // fixed increment
                if(arr[i] == arr[j]) {
                    count++;
                }
            }
            if(count > arr.length / 2) {
                majority = arr[i];
                break;
            }
        }

        System.out.println("Majority element: " + majority);
    }
}

