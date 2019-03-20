package com.anu.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.ca/");
		driver.manage().window().maximize();
		
		WebElement right =driver.findElement(By.linkText("Gmail"));
		
		Actions click = new Actions(driver);
		
	      click.contextClick(right).sendKeys("T").build().perform();
		

	}

}
