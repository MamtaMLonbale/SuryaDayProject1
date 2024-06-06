package com.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qa.utility.ScreenShot;
import com.qa.utility.WritingExcel;

import net.bytebuddy.asm.Advice.Argument;

public class HomePage {
	public WebDriver driver;
	Robot robot;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public String getSuryadayBankingText() throws IOException {
		WebElement suryaday = driver.findElement(By.xpath("//span[@class='highlight'][1]"));
		String suryadayText = suryaday.getText();
		ScreenShot.screenShot(
				"C:\\Users\\Mamta\\eclipse-workspace\\Suryaday\\test-output\\ScreenShot\\SuryaBankText.png", driver);
		return suryadayText;
	}

	public void clickOnCloseButtonOfRatePopup() {
		WebElement closeButton = driver.findElement(By.xpath("//button[@type='button'][1]"));
		closeButton.click();
	}

	public void closeWindowAlert() throws InterruptedException, AWTException {
		Thread.sleep(5000);
		robot = new Robot();
		robot.mouseMove(400, 160);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		System.out.println("clicked on block button");

		// return new AccountsAndCards(driver);
	}

	public CorporatePreLogin clickOnCorporateEBanking() throws InterruptedException, AWTException {
		Thread.sleep(5000);
		WebElement corporateBanking = driver.findElement(By.xpath("//a[@class='elogin-btn hidden-xs hidden-sm'][2]"));
		corporateBanking.click();

		return new CorporatePreLogin(driver);
	}

	public NewRetailsEBanking clickOnNewRetailsEBanking() throws InterruptedException, AWTException {
		Thread.sleep(5000);
		WebElement retailsBanking = driver.findElement(By.xpath("//a[@class='elogin-btn hidden-xs hidden-sm'][1]"));
		retailsBanking.click();

		// WebElement newRetailsEBanking=driver.findElement(By.xpath("//b[1]"));
		return new NewRetailsEBanking(driver);
	}

	public void clickOnAccountAndCards() throws InterruptedException, AWTException {
		Thread.sleep(5000);
		robot = new Robot();
		robot.mouseMove(300, 200);
		Thread.sleep(5000);
		// return new AccountsAndCards(driver);
	}
public String getAccountText() throws InterruptedException
{
	Thread.sleep(5000);
	WebElement accountWebelement=driver.findElement(By.xpath("//div[@class='accnt_dv'][1]"));
	String accountsText=accountWebelement.getText();
	return accountsText;
}
	
	public void getListOfFeatures() throws IOException {
		List accountAndCardsList = driver.findElements(By.xpath("//span[@class='li-name']"));
		Iterator<WebElement> itr = accountAndCardsList.iterator();
		while (itr.hasNext()) {
			WebElement element = itr.next();
			String droupDownListNames = element.getText();
			System.out.println(droupDownListNames);
			
			Map<Integer, String> suryaDayMainFunctionality = new HashMap<Integer, String>();
			//System.out.println("Created Map");
			
			Set<Integer> keyId = suryaDayMainFunctionality.keySet();
			//System.out.println("Created Set");
			WritingExcel.createWorkBook(driver);
			WritingExcel.createSheet(driver);
		
			for (Integer key : keyId) {
				System.out.println("I am for loop");
				WritingExcel.createRow();
				String objectArr =suryaDayMainFunctionality.get(key);
				//for(String str:objectArr)
				{
					WritingExcel.createCell();
					suryaDayMainFunctionality.put(1, droupDownListNames);
				}
				
			}
			WritingExcel.outPutFile(driver);
		}
		// WebElement
		// accountAndCards=driver.findElement(By.xpath("//span[@class='li-name'][14]"));
		// accountAndCards.click();
		// JavascriptExecutor javaScriptExcutor=(JavascriptExecutor) driver;
		// javaScriptExcutor.executeScript("arguments[0].click();", accountAndCards);
		// accountAndCards.click();
		// robot.mouseMove(400, 200);
		//
		// WebElement
		// accountAndcards=driver.findElement(By.xpath("//span[@class='dropdwn
		// ionicon'][1]"));
		// accountAndcards.click();
		// return new AccountsAndCards(driver);
	}

	public SavingAccountPage clickOnSavingAccount() throws AWTException, InterruptedException {
		Robot robot=new Robot();
		 robot.mouseMove(100,100);
		// WebElement
		// savingAccount=driver.findElement(By.xpath("//span[@class='li_txt'][1]"));
		WebElement savingAccount = driver
				.findElement(By.xpath("//a[@href='https://www.suryodaybank.com/accounts/savings'][1]"));
		JavascriptExecutor javaScriptExcutor = (JavascriptExecutor) driver;
		javaScriptExcutor.executeScript("arguments[0].click();", savingAccount);
		//Actions action=new Actions(driver);
		//driver.navigate().refresh();
		// Thread.sleep(4000);
		// robot=new Robot();
		// robot.mouseMove(100, 100);
		// robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		// robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		return new SavingAccountPage(driver);
	}
	public SmileSavingAccountPage clickOnShareYourSmileSavingAccount() throws AWTException
	{
		Robot robot=new Robot();
		robot.mouseMove(550, 270);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		return new SmileSavingAccountPage(driver);
		
	}
	public NextGenSavingPage clickOnNextGenSaving() throws AWTException
	{
		Robot robot=new Robot();
		robot.mouseMove(550, 320);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		return new NextGenSavingPage(driver);
		
	}
public BlossomWomenSavingsPage clickOnBlossomWomenSavings() throws AWTException
{
	Robot robot=new Robot();
	robot.mouseMove(550, 370);
	robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	return new BlossomWomenSavingsPage(driver);
}
public SalarySavingsAccountsPage clickOnSavingSalaryAccount() throws AWTException
{
	Robot robot=new Robot();
	robot.mouseMove(550, 390);
	robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	return new SalarySavingsAccountsPage(driver);
	
}
	public void clickOnSaving() {
		// WebElement
	}
	public void clickOnTermDeposite() throws InterruptedException
	{
		Thread.sleep(4000);
		robot.mouseMove(300, 300);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//		WebElement termDepositeElement=driver.findElement(By.xpath("//span[@class='inli-icon li-third'][2]"));
//		termDepositeElement.click();
	}
	public String getTermDepositeText() throws InterruptedException
	{
		Thread.sleep(5000);
		robot.mouseMove(600, 250);
		WebElement termDepositeElement=driver.findElement(By.xpath("//a[@href='https://www.suryodaybank.com/deposits/fixed-deposit'][1]"));
		return termDepositeElement.getText();
	}
	public DepositePage clickOnDomesticFixedDeposits() throws InterruptedException
	{
		Thread.sleep(4000);
	//	robot.mouseMove(300, 400);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		return new DepositePage(driver);
	}
	

}
