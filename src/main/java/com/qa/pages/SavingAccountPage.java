package com.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Window;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SavingAccountPage extends HomePage {

	public SavingAccountPage(WebDriver driver) {

		super(driver);
	}

	public void clickOnSavingAcc() throws AWTException {

		WebElement savingAccount = driver.findElement(By.xpath("//h1[1]"));
		savingAccount.click();
	}

	public String getSavingAccountText() throws InterruptedException {
		Thread.sleep(5000);
		WebElement savingAccount = driver.findElement(By.xpath("//div[@class='main-title'][1]"));
		String savingAccountHeading = savingAccount.getText();
		System.out.println("Saving account Heading-----" + savingAccountHeading);
		return savingAccountHeading;

	}
	public void scrollPageUptoSavingsAccountVariants()
	{
		JavascriptExecutor javaScript=(JavascriptExecutor) driver;
		javaScript.executeScript("window.scrollBy(0,1000)");
	}
	public void clickOnSavingUjjwal() {
		WebElement savingUjjwal=driver.findElement(By.xpath("//div[@class='savtabs mavactv firrstfour']"));
		savingUjjwal.click();
	}

	public SignUpPage clickOnApplyOfSavingUjjwal() throws InterruptedException, AWTException {
		Robot robot = new Robot();
		JavascriptExecutor javaScript = (JavascriptExecutor) driver;
		javaScript.executeScript("window.scrollBy(0,800)");
		robot.mouseMove(600, 390);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		return new SignUpPage(driver);
	}

	public void getSubmitButtonText() {
		driver.findElement(By.id("submitt")).getText();
	}

	public void clickOnFeesAndCharges() throws InterruptedException {
		JavascriptExecutor javaScript = (JavascriptExecutor) driver;
		javaScript.executeScript("window.scrollBy(0,1600)");
		Thread.sleep(5000);
		WebElement feesAndCharges = driver
				.findElement(By.xpath("//a[@href='https://www.suryodaybank.com/schedule-of-charges'][5]"));
		javaScript.executeScript("arguments[0].click();", feesAndCharges);
		// feesAndCharges.click();
	}
	
	public String getMinimumBalanceRequirementText() throws InterruptedException
	{
		
		Thread.sleep(4000);
		WebElement avgMontlyBalance=driver.findElement(By.xpath("//li[@class='no_li_style fntbold'][1]"));
				return avgMontlyBalance.getText();
	}
	//li[@class='no_li_style fntbold']
}
