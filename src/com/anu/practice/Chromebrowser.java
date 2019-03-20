package com.anu.practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chromebrowser
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");

	}

}
