package com.anu.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebookslider {

	public static void main(String[] args) {
		
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElement(By.xpath("///*[@id='content']/div/div")));
		WebElement sl =driver.findElement(By.xpath("//*[@id='facebook']"));
		Actions slider=new Actions(driver);
		
		slider.clickAndHold(sl).moveByOffset(0, 200).release(sl).build().perform();

	}

}
