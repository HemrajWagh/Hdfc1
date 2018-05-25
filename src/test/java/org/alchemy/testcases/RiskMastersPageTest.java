package org.alchemy.testcases;

import org.alchemy.base.TestBase;
import org.alchemy.pages.HomePage;
import org.alchemy.pages.LoginPage;
import org.alchemy.pages.MastersPage;
import org.alchemy.pages.RiskMastersPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RiskMastersPageTest extends TestBase {

	
	LoginPage loginPage;
	HomePage homePage;
	MastersPage masterPage;
	RiskMastersPage riskmasterPage;
	
	public RiskMastersPageTest()	
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
//	public void addNewRiskMastersLinkTest() throws InterruptedException
//	{
//		riskmasterPage.addNewRiskMastersLink();
//	}
	
	@Test(priority=2)
	public void clickOnRiskMastersLinkTest() throws InterruptedException
	{
		riskmasterPage.clickOnRiskMastersLink();
	}
	
	@AfterMethod
	public void tearDown()	
	{
		driver.quit();
	}
	
	
}
