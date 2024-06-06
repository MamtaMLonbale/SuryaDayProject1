package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage extends HomePage{
	public SignUpPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public String getSubmitLable()
	{
		WebElement submitButton=driver.findElement(By.xpath("//input[@type='submit']"));
		String submitLable=submitButton.getText();
		return submitLable;
	}

}
