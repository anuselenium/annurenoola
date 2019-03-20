package com.anu.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://ceoandhra.nic.in/home.aspx");
		driver.manage().window().maximize();
		WebElement reg= driver.findElement(By.xpath(".//*[@id='myjquerymenu']/ul/li[5]/a"));
		WebElement ac= driver.findElement(By.xpath("//*[@id='myjquerymenu']/ul/li[5]/ul/li[1]/a"));
		WebElement kyc= driver.findElement(By.xpath("//*[@id='myjquerymenu']/ul/li[5]/ul/li[1]/ul/li[7]/a"));
		
		Actions chain = new Actions(driver);
		chain.moveToElement(reg).moveToElement(ac).pause(2000).moveToElement(kyc).click(). build().perform();
		
		
		
		
		
		
		
		
		
		
		
	}

}
