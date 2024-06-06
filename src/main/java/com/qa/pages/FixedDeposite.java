package com.qa.pages;

import java.awt.AWTException;
import java.awt.Button;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FixedDeposite {
	static WebDriver driver;

	public FixedDeposite(WebDriver driver) {
		this.driver = driver;
	}

	static public void scrollPage() throws InterruptedException {
		Thread.sleep(5000);
		JavascriptExecutor javaScript = (JavascriptExecutor) driver;
		javaScript.executeScript("window.scrollBy(0,1000)");
	}

	public String getMinFDAmountList() {
		String minFDAmount=null;
		List<WebElement> listOfFixedDeposite = driver.findElements(By.xpath("//li"));
		for (WebElement listOfFeature : listOfFixedDeposite) {
			// System.out.println(listOfFeature.getText());
			minFDAmount = listOfFeature.getText();
			if (minFDAmount.equals("Amount: Minimum of Rs. 1,000 and thereafter in multiples of Rs. 1/-")) {
				System.out.println(listOfFeature.getText());
				return minFDAmount;
			}
		}
		return minFDAmount;
		

	}

	public RateofInterestPage clickOnRateOfInterest() throws InterruptedException, AWTException {
		scrollPage();
		Thread.sleep(5000);
		Robot robot=new Robot();
		robot.mouseMove(670, 270);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//		WebElement clickHere=driver.findElement(By.xpath("//div[@class='col-sm-8 col-md-8 col-lg-9 lstdv']//ul//li//b//a[@href='https://www.suryodaybank.com/deposits/fixed-deposit/rate-of-interest']"));
//		clickHere.click();
		return new RateofInterestPage(driver);
	}

}
