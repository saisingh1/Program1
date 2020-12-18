package com.app;

public class Program3 {

	public static void main(String arg[])
	{
	long sum;
	Integer n=546729;
	for(sum=0 ;n!=0 ;n/=10)
	{
	sum+=n%10;
	}
	System.out.println("Sum of digits "+sum);
	}
	}
