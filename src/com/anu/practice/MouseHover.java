package com.anu.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement signin= driver.findElement(By.id("nav-link-yourAccount"));
		WebElement ywl= driver.findElement(By.xpath("//*[@id='nav-flyout-yourAccount']/div[3]/a[3]/span"));
		Actions mouse = new Actions(driver);
		mouse.moveToElement(signin).build().perform();
		mouse.moveToElement(ywl).click().build().perform();
		
		
		
		
		
		
		
	}
	
}
