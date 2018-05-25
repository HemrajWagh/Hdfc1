package org.alchemy.pages;

import org.alchemy.Utility.Utility;
import org.alchemy.base.TestBase;
import org.alchemy.testcases.HomePageTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KCIMasterPage extends TestBase {
	
//	@FindBy(xpath="//span[@class='dx-vam dx-wrap' and contains(text(),'KCI Master')]")
//	WebElement KCIMaster;
	
	@FindBy(xpath="//span[@class='dx-vam dx-wrap' and contains(text(),'KCI Master')]")
	public static
	WebElement KCIMaster;
	
	@FindBy(xpath=".//*[@id='ctl00_ASPxNavBar1_GHC1']/a/span")
	public static
	WebElement MastersLink;
	
	@FindBy(xpath="//div[@id='ctl00_divnav']")
	WebElement MouseHover;
	
	HomePage homePage;
	
	public KCIMasterPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public static void verifyKCIMasterLink() throws InterruptedException 
	{
		
		Actions action = new Actions(driver);
		action.moveToElement(HomePage.MouseHover).build().perform();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		
		String newwindowhandle = driver.getWindowHandle();
		Thread.sleep(2000);
		HomePage.MastersLink.click();
		Thread.sleep(2000);
 		HomePage.KCIMaster.click();
 		Utility.captureScreenshot(driver, "KCiMasterLinkClicked");
 		
	}

}
