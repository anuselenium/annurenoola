package com.anu.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Primusbank 
{
	ChromeDriver driver;
	String res;
	public  String appLaunch(String url)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		
		if(driver.findElement(By.id("txtuId")).isDisplayed())
			
		{
			res="pass";
		}
		else
		{
			res="Fail";
		}
		return res;
	}
	//app login
	
	public String appLogin(String userName, String Password)
	{
		driver.findElement(By.id("txtuId")).sendKeys(userName);
		driver.findElement(By.id("txtPword")).sendKeys(Password);
		driver.findElement(By.id("login")).click();
		//validation
		if(driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).isDisplayed())
		{
			res="Pass";
		}
		else
		{
			res="Fail";
		}
		return res;
	}
	//branch creation
	public String  branchCreation(String branchName, String add1) throws Exception
	{
		driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		driver.findElement(By.id("BtnNewBR")).click();
		
		driver.findElement(By.id("txtbName")).sendKeys(branchName);
		driver.findElement(By.id("txtAdd1")).sendKeys(branchName);
		driver.findElement(By.id("txtZip")).sendKeys("44444");
		
		Select country = new Select(driver.findElement(By.id("lst_counrtyU")));
		country.selectByIndex(1);
		Thread.sleep(2000);
		Select state = new Select(driver.findElement(By.id("lst_stateI")));
		state.selectByIndex(1);
		Thread.sleep(2000);
		Select city = new Select(driver.findElement(By.id("lst_cityI")));
		city.selectByIndex(1);
		Thread.sleep(2000);
		
		driver.findElement(By.id("btn_insert")).click();
		
		Alert al =driver.switchTo().alert();
		String msg = al.getText();
		al.accept();
		
		//validation
		
		if(msg.contains("created Sucessfully"))
		{
			//System.out.println("pass");
			res="pass";
			
		}else if(msg.contains("already Exist"))
				
				{
			//System.out.println("Fail");
			res="Fail";
				}else if(msg.contains("Please fill in"))
					
				{
					//System.out.println("warning");
					res="warning";
					
				}
				
				driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();
				return res;


	}
	
	//appLogout
	public String appLout()
	{
		driver.findElement(By.xpath("//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
if(driver.findElement(By.id("txtuId")).isDisplayed())
			
		{
			res="pass";
		}
		else
		{
			res="Fail";
		}
		return res;
	}
	
	//appClose
	
	public void appClose()
	{
		driver.close();
	}
	
	
	public static void main(String[] args) throws Exception 
	{
		Primusbank app = new Primusbank();
		//app.appLaunch("http://primusbank.qedgetech.com/");
		app.appLaunch("http://primusbank.qedgetech.com/");
		app.appClose();
		//app launch
		
		//appLogin
		app.appLaunch("http://primusbank.qedgetech.com/");
		app.appLogin("Admin", "Admin");
		app.appLout();
		app.appClose();
		
		//branchCreation
		app.appLaunch("http://primusbank.qedgetech.com/");
		app.appLogin("Admin", "Admin");
		app.branchCreation("askred", "ameerpet");
		app.appLout();
		app.appClose();
		
		
	}
	
}
		

	




	