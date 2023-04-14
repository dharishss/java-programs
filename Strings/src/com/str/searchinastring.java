package com.str;

public class searchinastring
{
	public static void main(String[] args) {
		
		  String s = "harish";
		  char target = 'r';
		  System.out.println(str(s, target));

   
	}
	static char str(String ss , char target)
	{
		     for (int i = 0; i < ss.length(); i++) {
				char c = ss.charAt(i);
				if(c==target);
				{
					return c;
				}
			}
		     return 'f';
	}
     
}
