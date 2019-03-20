package com.renu.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AdminLoginTest
{
@Test
public void adminLogin()
{
	String userName="Admin";
	String Password="Admin";
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
    ChromeDriver driver=new ChromeDriver();
	driver.get("http://primusbank.qedgetech.com/admin_banker_master.aspx");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("txtuId")).sendKeys(userName);
	driver.findElement(By.id("txtPword")).sendKeys(Password);
	driver.findElement(By.id("login")).click();
}
}