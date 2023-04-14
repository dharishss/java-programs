package com.arrays;

import java.util.Iterator;
import java.util.Vector;

public class Twosumandtarget {
	//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

			//You may assume that each input would have exactly one solution, and you may not use the same element twice.

		//	You can return the answer in any order.
	
	public static void check()
	{
		 int[] nums = {2,7,11,15};
         int target = 9;
         Vector<Integer> ans= new Vector<>();
         for(int i= 0;i<nums.length-1;i++)
         {
       	  for(int j = i+1 ; j<nums.length-1;j++)
       	  {
       		  if(nums[i]+nums[j]==target)
       		  {
       			//for (int j2 = 0; j2 < ans.length; j2++) {
       			  ans.add(i);
       			  ans.add(j);
       		  }
       	  }
         } 
       for (int i = 0; i < ans.size(); i++) 
         {
			System.out.println(ans.get(i));
		}
       
	}

			 

	public static void main(String[] args)
	
	{
		check();
}
}
