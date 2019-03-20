package com.anu.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtablestest {

	public static void main(String[] args) throws Exception
	
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Employee List")).click();
		//System.out.println(driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr")).getText());
		
		List<WebElement>row= driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr"));
		//System.out.println(row.size());
		
		for(int i=0;i<row.size();i++)
		{
			List<WebElement> col =row.get(i).findElements(By.tagName("td"));
			
			//System.out.println(col.size());
			
			for(int j=0;j<col.size();j++)
			{
				System.out.println(col.get(2).getText());
				
			}
			
		}
		
		
		
			
		

	}

}
