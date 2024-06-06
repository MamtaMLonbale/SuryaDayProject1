package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SalarySavingsAccountsPage {
	WebDriver driver;
	public SalarySavingsAccountsPage(WebDriver driver) {
		this.driver=driver;
	}
public String getSalarySavingsAccountsHeading()
{
	WebElement salarySavingAccount=driver.findElement(By.xpath("//h1[1]//preceding::div[@class='main-title'][1]"));
	return salarySavingAccount.getText();
}
}
