package com.anu.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooktest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://Facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.className("inputtext")).sendKeys("Admin");
		driver.findElementByName("pass").sendKeys("password");
		driver.findElement(By.id("u_0_2")).click();

	}

}
