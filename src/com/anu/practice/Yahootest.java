package com.anu.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahootest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
         ChromeDriver driver= new ChromeDriver();
         driver.navigate().to("http://yahoo.com");
         driver.manage().window().maximize();
         driver.findElement(By.id("uh-search-box")).sendKeys("Selenium");
         driver.findElement(By.id("uh-search-button")).click();
         
	}

}
