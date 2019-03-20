package com.anu.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Primusmethodstest 
{
	String res;
	public  String appLaunch(String url)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		
		if(driver.findElement(By.id("txtuId")).isDisplayed())
			
		{
			res="pass";
		}
		else
		{
			res="Fail";
		}
		return res;
	}
	

 
	public static void main(String[] args) {
		

	}

}
