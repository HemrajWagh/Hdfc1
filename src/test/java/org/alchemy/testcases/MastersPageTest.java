package org.alchemy.testcases;

import org.alchemy.base.TestBase;
import org.alchemy.pages.HomePage;
import org.alchemy.pages.LoginPage;
import org.alchemy.pages.MastersPage;
import org.alchemy.pages.ViewMasterPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sun.media.sound.SoftSynthesizer;

public class MastersPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	MastersPage masterPage;
	
	public MastersPageTest()	
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void clickOnViewDatailsOfRiskTest() throws InterruptedException
	{
		masterPage.clickOnViewDatailsOfMasters();
	}
	
	
	@AfterMethod
	public void tearDown()	
	{
		driver.quit();
	}
	
}