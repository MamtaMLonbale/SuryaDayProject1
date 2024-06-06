package com.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewRetailsEBanking {

	WebDriver driver;

	public NewRetailsEBanking(WebDriver driver) {
		this.driver = driver;
	}

	public String getLoginText() throws InterruptedException {
		Thread.sleep(4000);
		// WebElement signInText=driver.findElement(By.xpath("//p[@class='ett-para pri
		// fs26']"));
		// signInText.getText();
		// WebElement
		// signInText=driver.findElement(By.id("Login__Login__el_txt_3_txtcnt"));
		// //driver.findElement(By.xpath("//span[@id='Login__Login__el_txt_3_txtcnt']"));
		// JavascriptExecutor javaScriptExcutor=(JavascriptExecutor) driver;
		// javaScriptExcutor.executeScript("arguments[0].getText();", signInText);
		// String signinText=signInText.getText();
		// System.out.println("Sign In Text---"+signinText);
		// WebElement
		// loginButton=driver.findElement(By.id("Login__Login__loginButton"));
		// loginButton.getText();
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='button'][1]"));
		String loginText = loginButton.getText();
		return loginText;

	}

	public void enterUserId() {
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='button'][1]"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4000));
		wait.until(ExpectedConditions.visibilityOf(loginButton));
		WebElement userId = driver.findElement(By.id("Login__Login__username_web"));
		userId.sendKeys("Tom");
	}

//	public void clickOnNewUserSignUp() throws InterruptedException, AWTException {
//		Thread.sleep(5000);
////		WebElement loginButton = driver.findElement(By.xpath("//button[@type='button'][1]"));
////		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4000));
////		wait.until(ExpectedConditions.visibilityOf(loginButton));
////		WebElement newUserSign=driver.findElement(By.xpath("//button[@type='button'][1]//span[@id='Login__Login__el_btn_6_txtcnt']"));
////		newUserSign.click();
//		//WebElement newUserSignUpButton = driver.findElement(By.xpath("//button[@type='button'][2]"));
////		JavascriptExecutor javaScriptExcutor=(JavascriptExecutor) driver;
////		javaScriptExcutor.executeScript("arguments[0].click();", newUserSignUpButton);
//	//	newUserSignUpButton.click();
//		Robot robot=new Robot();
//		robot.mouseMove(600, 600);
//		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//	}
	public void getNewUserSignUpText() throws InterruptedException
	{
		Thread.sleep(4000);
		WebElement newUser=driver.findElement(By.xpath("//button[@id='Login__Login__el_btn_6']"));
		newUser.getText();
	}
	public void getContinueToLoginText()
	{
	
		WebElement continueToLogin=driver.findElement(By.xpath("//span[@id='Login__Login__el_txt_3_txtcnt']"));
		//WebElement continueToLogin=driver.findElement(By.xpath("//button[@id='Login__Login__loginButton']"));
		continueToLogin.getText();
	}
	public void getOKButtonText() throws InterruptedException
	{
		Thread.sleep(5000);
		WebElement okButton=driver.findElement(By.xpath("//span[@id='Regist__Registration__el_btn_34_txtcnt']"));
		String okButtonText=okButton.getText();
	}
}
