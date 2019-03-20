package com.anu.java;

public class Anu 
{
	int a=10;

	public void add()
	{
	   int a=30;
	   int b=40;
	   int sum=a+b;
	   System.out.println(sum);
	
	}
	public static void main(String[] args) 
	{
		Anu A= new Anu();
		A.add();
		System.out.println(A.a);
	}

}
