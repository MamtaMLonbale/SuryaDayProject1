package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BlossomWomenSavingsPage {
	WebDriver driver;
	public BlossomWomenSavingsPage(WebDriver driver) {
	this.driver=driver;
	}
public String getBlossomWomenSavings()
{
	WebElement blossomWemenSaving=driver.findElement(By.xpath("//h1[1]//preceding::div[@class='main-title']"));
	return blossomWemenSaving.getText();
}


}
