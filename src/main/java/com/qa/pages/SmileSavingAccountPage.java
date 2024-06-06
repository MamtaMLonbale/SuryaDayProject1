package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SmileSavingAccountPage {
	WebDriver driver;
	public SmileSavingAccountPage(WebDriver driver) {
		this.driver=driver;
	}
	public String getSmileSavingAccountHeading()
	{
		WebElement smileSaving=driver.findElement(By.xpath("//h1[1]//preceding::div[@class='main-title fntsize']"));
		return smileSaving.getText();
	}

}