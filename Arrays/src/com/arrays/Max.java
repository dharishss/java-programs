package com.arrays;

public class Max 
{
   public static void main(String[] args) {
	   
	int[] arr = {1,2,3,4,5,6};
	int max = arr[0];
	for (int i = 0; i < arr.length; i++) {
		if(arr[0] < arr[i])
		{
			max = arr[i];
		}
	}
	System.out.println(max);
	
}
}
