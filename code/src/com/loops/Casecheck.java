package com.loops;

import java.util.Scanner;

public class Casecheck {

	public static void main(String[] args) {
     Scanner i = new Scanner(System.in);
     char c = i.next().trim().charAt(0);
     if(c>='a' && c<='z')
     {
    	 System.out.println("lower case");
     }
     else
     {
    	 System.out.println("upper case");
     }
	}

}
