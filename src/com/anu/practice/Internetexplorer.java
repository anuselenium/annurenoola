package com.anu.practice;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Internetexplorer
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.ie.driver", "C:/Users/Rohit/Downloads/IEDriverServer_x64_3.14.0/IEDriverServer.exe");
		InternetExplorerDriver driver= new InternetExplorerDriver();
		driver.get("http://amazon.ca");
	}

}
