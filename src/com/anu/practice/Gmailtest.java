package com.anu.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class Gmailtest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
	    ChromeDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("gb_P")).click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}
	
	

}
