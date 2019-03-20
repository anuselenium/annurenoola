package com.anu.practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Naukriwindows {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='blobId']/div[2]")).click();
		
		Set<String> windows = driver.getWindowHandles();
		for (String child : windows)
		{
			//System.out.println(child);
			driver.switchTo().window(child);
			
			
			System.out.println(driver.getTitle());
		}		
		
		
		
		

	}

}
