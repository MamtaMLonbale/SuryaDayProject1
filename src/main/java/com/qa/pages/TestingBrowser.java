package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingBrowser {
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().driverVersion("109").setup();
		driver=new ChromeDriver();
		driver.get("https://www.suryodaybank.com/");
		driver.manage().window().maximize();

	}

}
