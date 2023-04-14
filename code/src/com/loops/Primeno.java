package com.loops;

public class Primeno 
{
   public static void main(String[] args) {
	int n = 15;
	for (int i = 2; i <=n; i++)
	{
		if(n%i==0)
		{
			System.out.println("not a prime");
		}
	}
}
}
