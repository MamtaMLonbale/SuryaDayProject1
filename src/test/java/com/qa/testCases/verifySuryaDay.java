package com.qa.testCases;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.pages.AccountsAndCards;
import com.qa.pages.BlossomWomenSavingsPage;
import com.qa.pages.CorporatePreLogin;
import com.qa.pages.DepositePage;
import com.qa.pages.FixedDeposite;
import com.qa.pages.HomePage;
import com.qa.pages.LaunchSite;
import com.qa.pages.NewRetailsEBanking;
import com.qa.pages.NextGenSavingPage;
import com.qa.pages.RateofInterestPage;
import com.qa.pages.SalarySavingsAccountsPage;
import com.qa.pages.SavingAccountPage;
import com.qa.pages.SignUpPage;
import com.qa.pages.SmileSavingAccountPage;
import com.qa.utility.ScreenShot;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class verifySuryaDay {
	LaunchSite launchSite = new LaunchSite();
	HomePage homePage;
	CorporatePreLogin corporatePreLogin;
	AccountsAndCards accountAndCards;
	//SavingAccountPage savingAccountPage;
	NewRetailsEBanking newRetailsBanking;
	SavingAccountPage savingAccount;
	FixedDeposite fixedDeposite;
	RateofInterestPage rateOfInterest;
	SignUpPage signUp;
	DepositePage depositePage;
	SmileSavingAccountPage smileSavingAccount;
	NextGenSavingPage nextGenSaving;
	BlossomWomenSavingsPage blossomWomenSavings;
	SalarySavingsAccountsPage salarySavingsAccount;

	@BeforeTest
	public void verifyLaunchSite() throws InterruptedException, IOException {
		log.info("Test case 1");
		// launchSite.suryaLaunch();
		homePage = launchSite.suryaLaunch();
		// ScreenShot.screenShot("C:\\Users\\Mamta\\eclipse-workspace\\Suryaday\\test-output\\lunchPage.png",driver);

	}

	@Test(priority = 0)
	public void verifySuryaDayHeading() throws IOException {
		homePage.clickOnCloseButtonOfRatePopup();
		String actualSuryaText = homePage.getSuryadayBankingText();
		String expectedSuryaText = "Surya banking";
		Assert.assertEquals(actualSuryaText, expectedSuryaText, "Incorrect suryaday way of banking");
	}

	@Test(priority = 1)
	public void verifyGroupIdLable() throws InterruptedException, AWTException {
		homePage.clickOnCloseButtonOfRatePopup();
		homePage.closeWindowAlert();
		corporatePreLogin = homePage.clickOnCorporateEBanking();
		System.out.println("Clicked on corporate banking");
		log.trace("clicked on Corporate E-Baking");
		Thread.sleep(5000);
		String actualGroupIdLable = corporatePreLogin.getGroupIdLable();
		String expectedGroupIdLable = "group Id";
		Assert.assertEquals(actualGroupIdLable, expectedGroupIdLable, "Incorrect group id");
		// homePage.clickOnCloseButtonOfRatePopup();
		// homePage.clickOnSavingAccount();
	}

	@Test(priority = 2, alwaysRun = true)
	public void verifyLoginLable() throws InterruptedException, AWTException {
		homePage.clickOnCloseButtonOfRatePopup();
		homePage.closeWindowAlert();
		newRetailsBanking = homePage.clickOnNewRetailsEBanking();
		String expectedLoginText = newRetailsBanking.getLoginText();
		String actualLoginText = "Login";
		Assert.assertEquals(actualLoginText, expectedLoginText, "Incorrect Login Text");
		// homePage.clickOnAccountAndCards();
		// Thread.sleep(5000);
		// savingAccountPage=homePage.clickOnSavingAccount();
	}

	// @Test(priority = 3, dependsOnMethods = { "verifyLoginLable" }, alwaysRun =
	// true)
	// public void verifyOkButtonTextOnRIB() throws InterruptedException,
	// AWTException {
	// Thread.sleep(5000);
	// newRetailsBanking.getContinueToLoginText();
	// //newRetailsBanking.enterUserId();
	// // newRetailsBanking.getNewUserSignUpText();
	// // System.out.println("Clicked on new user signup");
	// // newRetailsBanking.getOKButtonText();
	// }

	@Test(priority = 3, alwaysRun = true)
	public void verifyAccountAndCardsHeading() throws InterruptedException, AWTException, IOException {
		Thread.sleep(3000);
		homePage.closeWindowAlert();
		homePage.clickOnCloseButtonOfRatePopup();
		homePage.clickOnAccountAndCards();
		String actualAccountsText = homePage.getAccountText();
		String expectedAccountText = "account";
		Assert.assertEquals(actualAccountsText, expectedAccountText, "Incorrect Account headding");
		// homePage.getListOfFeatures();
	}
	@Test(priority=4,dependsOnMethods= {"verifyAccountAndCardsHeading"},alwaysRun=true)
	public void verifyShareYourSmileSavingsAccountHeading() throws AWTException
	{
		smileSavingAccount=homePage.clickOnShareYourSmileSavingAccount();
		String actualSmileSavingText=smileSavingAccount.getSmileSavingAccountHeading();
		String expectedSmileSavingText="Smile saving";
		Assert.assertEquals(actualSmileSavingText, expectedSmileSavingText,"Incorrect Smile Saving Account");
		
	}

	@Test(priority=5,dependsOnMethods= {"verifyAccountAndCardsHeading"},alwaysRun=true)
	public void verifyNextGenSavingHeading() throws AWTException
	{
		nextGenSaving=homePage.clickOnNextGenSaving();
		String actualNextGenSaving=nextGenSaving.getNextGenSaving();
		String expectedNextGenSaving="next gen";
		Assert.assertEquals(actualNextGenSaving, expectedNextGenSaving,"Incorrect Next gen saving account");
	}
	@Test(priority=6,dependsOnMethods= {"verifyAccountAndCardsHeading"},alwaysRun=true)
	public void verifyBlossomWomenSavingsHeading() throws AWTException
	{
		blossomWomenSavings=homePage.clickOnBlossomWomenSavings();
		String expectedBlossamWomenSavingHeading=blossomWomenSavings.getBlossomWomenSavings();
		String actualBlossamWomenSavingHeading="Blossom Women";
		Assert.assertEquals(actualBlossamWomenSavingHeading, expectedBlossamWomenSavingHeading,"Incorrect blossom women saving");
		
	}
	@Test(priority=7,dependsOnMethods= {"verifyAccountAndCardsHeading"},alwaysRun=true)
	public void verifySavingSalaryAccountHeading() throws AWTException
	{
		salarySavingsAccount=homePage.clickOnSavingSalaryAccount();
		String actualSavingSalaryAccountHeading=salarySavingsAccount.getSalarySavingsAccountsHeading();
		String expectedSavingAccountHeading="Saving SalaryAccount";
		Assert.assertEquals(actualSavingSalaryAccountHeading, expectedSavingAccountHeading,"Incorrect Saving Salary Account heading");
		
	}
	
	@Test(priority = 5, dependsOnMethods = { "verifyAccountAndCardsHeading" }, alwaysRun = true)
	public void verifySavingAccountHeading() throws AWTException, InterruptedException, IOException {
		Thread.sleep(6000);
		homePage.getListOfFeatures();
		savingAccount = homePage.clickOnSavingAccount();
		String expectedSavingAccountHeading = "saving account";
		String actualSavingAccountHeading = savingAccount.getSavingAccountText();
		Assert.assertEquals(actualSavingAccountHeading, expectedSavingAccountHeading,
				"Incorrect saving accounts heading");
	}
	@Test(priority=6,dependsOnMethods= {"verifySavingAccountHeading"},alwaysRun=true)
	public void VerifyMinimumBalanceRequirement() throws InterruptedException
	{
		
		savingAccount.scrollPageUptoSavingsAccountVariants();
		savingAccount.clickOnSavingUjjwal();
		String actaulMinimumBalanceRequirement=savingAccount.getMinimumBalanceRequirementText();
		String expectedMinimumBalanceRequirement="minimum balance requirement";
		Assert.assertEquals(actaulMinimumBalanceRequirement, expectedMinimumBalanceRequirement);
	}
	

	@Test(priority = 7, dependsOnMethods = { "verifySavingAccountHeading" }, alwaysRun = true)
	public void verifySubmitButtonLable() throws InterruptedException, AWTException {
		signUp = savingAccount.clickOnApplyOfSavingUjjwal();

		String expectedSubmitButtonLable = "submit";
		String actualSubmitButtonLable = signUp.getSubmitLable();
		Assert.assertEquals(actualSubmitButtonLable, expectedSubmitButtonLable, "Incorrect Submit button lable");
	}



	@Test(priority = 8, dependsOnMethods = { "verifyAccountAndCardsHeading" }, alwaysRun = true)
	public void verifyTermDepositeText() throws AWTException, InterruptedException {
		Thread.sleep(5000);
		homePage.clickOnTermDeposite();
		String actualTermDepositeText = homePage.getTermDepositeText();
		String expectedTermDepositeText = "term Deposite";
		Assert.assertEquals(actualTermDepositeText, expectedTermDepositeText, "Incorrect Term deposite text");
	}

	@Test(priority = 9, dependsOnMethods = { "verifyTermDepositeText" }, alwaysRun = true)
	public void verifyStandardFixedDepositsHeading() throws InterruptedException {
		depositePage = homePage.clickOnDomesticFixedDeposits();
		String actualStandardFixedDepositsHeading = depositePage.getStandardFixedDepositsHeading();
		String expectedFixedDepositsHeading = "Standard Fixed Deposits";
		Assert.assertEquals(actualStandardFixedDepositsHeading, expectedFixedDepositsHeading,
				"Incorrect Standard Fixed Deposits heading");

	}
	@Test(priority=10,dependsOnMethods= {"verifyStandardFixedDepositsHeading"},alwaysRun=true)
	public void verifyAmountOfRegularfixedDeposite() throws InterruptedException
	{
		fixedDeposite=depositePage.clickOnRegularFixedDeposite();
		//fixedDeposite.scrollPage();
		String actualMinFDAmount=fixedDeposite.getMinFDAmountList();
		String expectedMinFDAmount="Amount=Minimum of Rs. 1,000 and thereafter in multiples of Rs. 1/-";
		Assert.assertEquals(actualMinFDAmount, expectedMinFDAmount,"Incorrect Minimum fixed deposite amount");
	}
	@Test(priority=11,dependsOnMethods= {"verifyAmountOfRegularfixedDeposite"},alwaysRun=true)
	public void verifyRateOfInterest() throws InterruptedException, AWTException
	{
		rateOfInterest=fixedDeposite.clickOnRateOfInterest();
		String actualRateForDomesticFDHeading=rateOfInterest.getRatesforDomesticFixedDepositsHeading();
		String expectedRateForDomesticFDHeading="Rates for Domestic Fixed Deposits";
	Assert.assertEquals(actualRateForDomesticFDHeading, expectedRateForDomesticFDHeading,"Incorrect DomesticFixedDeposits");
	}
	@Test(priority=12,dependsOnMethods= {"verifyRateOfInterest"},alwaysRun=true)
	public void verifyInterestRateof7daysto14days()
	{
		String actaualInterstRate=rateOfInterest.getInterestRateTable();
		String expectedInterstRate="5.00%";
		Assert.assertEquals(actaualInterstRate, expectedInterstRate,"Incorrect Interest Rate");
	}
	@Test(priority=13,dependsOnMethods= {"verifyInterestRateof7daysto14days"},alwaysRun=true)
	public void verifySubmitButtonText()
	{
		rateOfInterest.clickOnApplyNow();
	}
	

}
