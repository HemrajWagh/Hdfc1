package org.alchemy.testcases;

import org.alchemy.base.TestBase;
import org.alchemy.pages.HomePage;
import org.alchemy.pages.KCIMasterPage;
import org.alchemy.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KCIMasterPageTest extends TestBase {
	
	
	@FindBy(xpath="//div[@id='ctl00_divnav']")
	WebElement MouseHover;
	KCIMasterPage kciMasterPage; 
	HomePage homePage;
	LoginPage loginPage;
	public KCIMasterPageTest()	
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
	public void ClickOnKCIMasterLink() throws InterruptedException
	{
	  kciMasterPage.verifyKCIMasterLink();
	}
	
	

}
