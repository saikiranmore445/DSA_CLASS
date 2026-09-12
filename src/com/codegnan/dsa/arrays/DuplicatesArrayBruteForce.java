package com.codegnan.dsa.arrays;

public class DuplicatesArrayBruteForce {

	public static void main(String[] args) {
		int arr[]={10,20,40,40,30};
		boolean found = false;
		for(int i=0;i<arr.length;i++){
		    boolean duplicate=false;
		    for(int j=i+1;j<arr.length;j++){
		        if(arr[i]==arr[j]){
		            duplicate=true;
		            found = true;
		            
		             break;
		            
		        }
		        }
		           if(duplicate){
		            System.out.println("Found:"+arr[i]);
		      
		    }
		}
		if(!found){
		    System.out.println("not Found");
		}

	}

}
