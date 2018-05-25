package org.alchemy.testcases;

import org.alchemy.base.TestBase;
import org.alchemy.pages.HomePage;
import org.alchemy.pages.LoginPage;
import org.alchemy.pages.MastersPage;
import org.alchemy.pages.RiskMastersPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {
	
	LoginPage loginPage ;
	static HomePage homePage;
	MastersPage mastersPage;
	static HomePageTest homePageTest;
	RiskMastersPage riskMastersPage;
	public HomePageTest()	
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	

//	@Test(priority=1)
//	public void verifyHomePageTitleTest()
//	{
//		String homepagetitle=homePage.validateHomePageTitle();
//		Assert.assertEquals(homepagetitle, "Controls Manager");
//	}
//	
//	@Test(priority=2)
//	public void verifyCorrectUserNameTest()
//	{
//		boolean flag = homePage.verifyCorrectUserName();
//		Assert.assertTrue(flag);
//	}
	

//	@Test(priority=3)
//	public void verifyclickOnMastersLinkTest() throws InterruptedException
//	{
//		mastersPage=homePage.verifyclickOnMastersLink();
//	}
	
//	
	
//	@Test(priority=5)
//	public void addNewRecordRiskTest() throws InterruptedException
//	{		homePage.clickOnRiskMastersLink();
//	}
	
//	@Test(priority=6)
//	public void enterRiskId() throws InterruptedException
//	{
//		homePage.enterRiskId(prop.getProperty("NewRisk"));
//	}	
	
	@Test(priority=6)
	public static void VerifyKCIMasterLinkTest() throws InterruptedException
	{
		homePage.ClickOnKCIMasterLink();
	}
	
	
	
	@AfterMethod
	public void tearDown()	
	{
		driver.quit();
	}
}
