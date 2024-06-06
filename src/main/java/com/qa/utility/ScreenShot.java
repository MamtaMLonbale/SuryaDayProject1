package com.qa.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

 public class ScreenShot {
		
//	 public static void main(String args[]) throws IOException
//	 {
//	 WebDriverManager.chromedriver().driverVersion("109").setup();
//		driver=new ChromeDriver();
//		driver.get("https://www.suryodaybank.com/");
//		driver.manage().window().maximize();
//		 screenShot("C:\\Users\\Mamta\\eclipse-workspace\\Suryaday\\test-output\\lunchPage.png");
//	 }

	public static void screenShot(String fileWithPath,WebDriver driver) throws IOException
	{
		File srcFile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//File srcFile=screenShot.getScreenshotAs(OutputType.FILE);
		File destFile=new File(fileWithPath);
		FileUtils.copyFile(srcFile, destFile);
		System.out.println("captured Screen shot");
	}
	

}
