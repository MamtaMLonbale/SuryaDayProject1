package com.qa.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CorporatePreLogin{
	WebDriver driver;
	public CorporatePreLogin(WebDriver driver) {
this.driver=driver;
	}
	
public String getGroupIdLable() throws InterruptedException
{ 
	Thread.sleep(4000);
//	WebElement loginButton=driver.findElement(By.xpath("//button"));
//	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5000));
//	wait.until(ExpectedConditions.visibilityOf(loginButton));
	//WebElement groupIdLable=driver.findElement(By.xpath("//div[@class='form-group has-feedback has-error']"));
	WebElement groupIdLable=driver.findElement(By.xpath("//label[1]"));
	String groupIdLableText=groupIdLable.getText();
	return groupIdLableText;
}
}
