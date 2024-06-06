package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DepositePage {
	 WebDriver driver;

	public DepositePage(WebDriver driver) {
		this.driver=driver;
	}
	public String getStandardFixedDepositsHeading()
	{
		WebElement standardFixedDepositsWebelement=driver.findElement(By.xpath("//h1[1]"));
		return standardFixedDepositsWebelement.getText();
	}
public FixedDeposite clickOnRegularFixedDeposite()
{
	WebElement regularFixedDeposite=driver.findElement(By.xpath("//div[@class='savtabs mavactv '] "));
	regularFixedDeposite.click();
	return new FixedDeposite(driver);
	
	
}
}
