package com.arrays;

public class Missingnumber {

	public static void main(String[] args) {
// find the issing number from 1 to 100
		int[] ar = {1,2,3,4,5,6,7,9,10,11,12};
		int sum =0;
		for(int i=1;i<=12;i++)
		{
			sum=sum+i;
		}
		System.out.println("sum of number from 1 to 12 is"+sum);
		int sum1=0;
		for(int i=0;i<ar.length;i++)
		{
			sum1=ar[i]+sum1;
		}
		System.out.println("sum of array is"+sum1);
		int misno=sum-sum1;
		System.out.println(misno);
	}

}
