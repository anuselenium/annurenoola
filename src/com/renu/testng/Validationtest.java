package com.renu.testng;



import org.testng.Assert;
import org.testng.annotations.Test;


public class Validationtest
{
@Test
public void validation()
{
	String data= "Selenium Trainings";
	String data1="Selenium";
	Assert.assertEquals(data, data1);
}

}
