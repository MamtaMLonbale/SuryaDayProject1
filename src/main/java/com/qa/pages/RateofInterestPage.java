package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RateofInterestPage {
	public WebDriver driver;

	public RateofInterestPage(WebDriver driver) {
		this.driver=driver;
	}
public String getRatesforDomesticFixedDepositsHeading()
{
	WebElement ratesForDomesticFDWebElement=driver.findElement(By.xpath("//div[@class='main-title']//h1"));
	String ratesForDomesticFDText=ratesForDomesticFDWebElement.getText();
	return ratesForDomesticFDText;
}
public String getInterestRateTable()
{
	String interestRate=null;
	List<WebElement> listOfTable=driver.findElements(By.xpath("//td[@class='custom_rate_of_interest_table1'][1]"));
	
	for(WebElement tableListWebElement:listOfTable)
	{
		interestRate=tableListWebElement.getText();
		
		if(interestRate.equals("4.00%"))
		{
			return interestRate;
		}
		
	}
	return interestRate;
}
public void clickOnApplyNow()
{
	JavascriptExecutor javaScript=(JavascriptExecutor)driver;
	javaScript.executeScript("window.scroollBy(0,1000)");
	WebElement applyNow=driver.findElement(By.xpath("//a[@href=\"https://www.suryodaybank.com/account/signup\"][5]"));
	applyNow.click();
}

}
