package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchSite {
	public WebDriver driver=null;
	public HomePage suryaLaunch()
	{
		WebDriverManager.chromedriver().driverVersion("109").setup();
		driver=new ChromeDriver();
		driver.get("https://www.suryodaybank.com/");
		driver.manage().window().maximize();
		//driver.switchTo().alert().getText();
		//System.out.println("alert dismiss");
		//return new HomePage(driver);
		return new HomePage(driver);
		
	}

}
