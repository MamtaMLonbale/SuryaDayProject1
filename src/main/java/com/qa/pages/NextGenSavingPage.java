package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NextGenSavingPage {
	WebDriver driver;
	public NextGenSavingPage(WebDriver driver) {
		this.driver=driver;
	}
public String getNextGenSaving()
{
	WebElement nextGen=driver.findElement(By.xpath("//h1[1]//preceding::div[@class='main-title']"));
	String nextGenSavingHeading=nextGen.getText();
	return nextGenSavingHeading;
	
}
}
