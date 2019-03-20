package com.anu.practice;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Preceedingxpath {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.quikr.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='searchedCat']/span")).click();
		Thread.sleep(2000);
		
		List<WebElement> list= driver.findElements(By.xpath(".//*[@id='category-dropdown']/ul/li/a"));
		System.out.println(list.size());
		
		for (WebElement element : list)
		{
		System.out.println(element.getText());	
		}

	}

}
