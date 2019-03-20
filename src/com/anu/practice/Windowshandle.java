package com.anu.practice;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowshandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		String homepage =driver.getWindowHandle();
		//System.out.println(homepage);
		
		driver.findElement(By.id("loginsubmit")).click();
		
		Set<String> windows = driver.getWindowHandles();
		
		for (String child : windows) {
			System.out.println(child);
			
		}
		
		
		

	}

}
