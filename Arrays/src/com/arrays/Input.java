package com.arrays;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         int[] arr = new int[6];
         System.out.println("your array input");
         for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
         
         for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
      
}
