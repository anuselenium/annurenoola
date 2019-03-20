package com.renu.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annatations
{
	@Test
	public void method1()
	{
		System.out.println("Method1 Executed");
	}	
@BeforeMethod
public void beforeMethod()
{
	System.out.println("Before Method executed");
}
@AfterMethod
public void afterMethod()
{
	System.out.println("After method executed");
}
}
