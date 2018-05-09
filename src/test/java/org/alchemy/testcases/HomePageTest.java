package org.alchemy.testcases;

import org.alchemy.base.TestBase;
import org.alchemy.pages.HomePage;
import org.alchemy.pages.LoginPage;
import org.alchemy.pages.MastersPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {
	
	
	
	LoginPage loginPage ;
	HomePage homePage;
	MastersPage mastersPage;
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
//	}
//	

	@Test(priority=3)
	public void verifyclickOnMastersLinkTest()
	{
		homePage.verifyclickOnMastersLink();
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
}
