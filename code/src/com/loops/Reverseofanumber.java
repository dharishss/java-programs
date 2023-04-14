package com.loops;

public class Reverseofanumber {

	public static void main(String[] args) {
      int n = 54795;
      int ans =0;
      while(n>0)
      {
    	  int rem = n% 10;
    	  n = n/10;
    	  ans = ans * 10 + rem;
      }
      System.out.println(ans);
	}

}
