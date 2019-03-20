package com.renu.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
	
public class Primusbank
{
	ChromeDriver driver;
	@BeforeSuite
	public void appLaunch()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://primusbank.qedgetech.com/");
	driver.manage().window().maximize();
	//validation
	
	Assert.assertTrue(driver.findElement(By.id("txtuId")).isDisplayed());
}

@BeforeTest
public void appLogin()
{
	driver.findElement(By.id("txtuId")).sendKeys("Admin");
	driver.findElement(By.id("txtPword")).sendKeys("Admin");
	driver.findElement(By.id("login")).click();
}
@AfterTest
public void appLogout()
{
	driver.findElement(By.xpath("//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
}
@AfterSuite
public void appClose()
{
	driver.close();
}

}



