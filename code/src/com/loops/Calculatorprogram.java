package com.loops;

import java.util.Scanner;

public class Calculatorprogram {

	public static void main(String[] args) 
	{
         Scanner s = new Scanner(System.in);
         int ans = 0;
         while(true)
         {
        	 //take operator as the input
        	 System.out.println("enter the operator");
        	 char c = s.next().trim().charAt(0);
        	 
        	 if(c == '+' || c =='-' || c =='%' || c =='/')
        	 {
        		 // input two number
        		 int num1 = s.nextInt();
        		 int num2 = s.nextInt();
        		 if(c == '+')
        		 {
        			 ans = num1 + num2;
        		 }
        		 if(c == '-')
        		 {
        			 ans = num1 - num2;
        		 }
        		 if(c == '/')
        		 {
        			 if(num2 !=0)
        			 {
        			 ans = num1 / num2;
        			 }
        		 }
        		 if(c == '%')
        		 {
        			 ans = num1 % num2;
        		 }
        		 
        		 
        	 }
        	 else if (c =='x' || c == 'X') 
        	 {
        		 break;
				
			 }
        	 else 
        	 {
				System.out.println("invalid char");
			 }
        	 System.out.println(ans);
        		 
        	 
         }
	}
	
	}
	


