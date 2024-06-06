package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AccountsAndCards {
	public WebDriver driver=null;
	Actions action=new Actions(driver);
	public AccountsAndCards(WebDriver driver) {
		this.driver=driver;
	}
	public void account()
	{
		
		WebElement accountAndCards=driver.findElement(By.xpath("//span[contains(text(),'Accounts & Cards')][1]"));
		action.moveToElement(accountAndCards).build().perform();
	System.out.println("clicked on account tab");
	}

}
