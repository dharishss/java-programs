package com.arrays;

public class Duplicatenumber {

	public static void main(String[] args) {
//find the duplicate number in the given integer number
		int[] arr = {0,2,3,6,7,8,3,59};
		for(int i=0, j=0;i<arr.length;i++)
		{
			int first = arr[j];
			if(first==arr[i+1])
			{
				System.out.println(first);
			}
		}
	}

}
