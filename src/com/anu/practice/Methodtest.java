package com.anu.practice;

public class Methodtest 
{
	public int add(int a, int b)
	{
		int sum=a+b;
		return sum;
	}

	public static void main(String[] args) 
	{
		Methodtest v=new Methodtest();
		int res=v.add(50, 90);
		System.out.println(res);
		

	}

}
