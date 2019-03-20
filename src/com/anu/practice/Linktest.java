package com.anu.practice;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
	   List<WebElement> Links =driver.findElements(By.tagName("a"));
	   System.out.println(Links.size());
	   for(int i=0;i<Links.size();i++)
	   {
		  //System.out.println(Links.get(i).getText());
		   
		   if(!Links.get(i).getText().isEmpty())
		   {
			   System.out.println(Links.get(i).getText());
		   }
		  
		  
	   }
	   
	}

	
		
		
	}


