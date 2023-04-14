package com.arrays;

import java.util.Arrays;

public class Arrayreverse {

	public static void main(String[] args) {
            int[] arr = {1,2,3,4,5,6,7};
             System.out.println(Arrays.toString(reverse(arr)));
			}
   public static int[] reverse(int[] arr )
   {
	   
	   int start = 0;
       int last = arr.length-1;
       while(last>start)
       {
       swap(arr, start, last);
       start++;
       last--;
       }
       return arr;

	   
   }
   
   public static  int[] swap(int[] arr,int index1, int index2)
   {
	   for (int i = 0; i < arr.length; i++) {
		  
			int temp = index2;
			index2 = index1;
			index1 = temp;
	   }
	   return arr;
			
   }
   
     
	   
            
            
            
            
            		
            
	}


