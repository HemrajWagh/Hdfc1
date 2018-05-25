package org.alchemy.pages;

import org.alchemy.Utility.Utility;
import org.alchemy.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RiskMastersPage extends TestBase {
	
	
	@FindBy(xpath="//span[@class='dx-vam dx-wrap' and  contains(text(),'Risk Master')]")
	WebElement RiskMaster;
	
	@FindBy(xpath=".//*[@id='ctl00_ASPxNavBar1_GHC1']/a/span")
	static
	WebElement MastersLink;
	
	@FindBy(xpath=".//*[@id='ctl00_ASPxNavBar1_I1i8_T']/span")
	static
	WebElement RiskMasterLink;
	
	@FindBy(xpath="//div[@id='ctl00_divnav']")
	static
	WebElement MouseHover;
	
	public RiskMastersPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public static RiskMastersPage addNewRiskMastersLink() throws InterruptedException
	{
		
		Thread.sleep(2000);
 		Actions action = new Actions(driver);
 		
 		action.moveToElement(HomePage.MouseHover).build().perform();
 		Utility.captureScreenshot(driver, "MouseHoverForRiskMasterPage");
 			Thread.sleep(3000);
 			String newwindowhandle = driver.getWindowHandle();
 			driver.switchTo().window(newwindowhandle);
 			HomePage.MastersLink.click();
 			Thread.sleep(2000);
 			HomePage.RiskMasterLink.click();
 			Thread.sleep(2000);
 			return new RiskMastersPage();
	}
	public static RiskMastersPage clickOnRiskMastersLink() throws InterruptedException
	{
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		Utility.captureScreenshot(driver, "MouseHoverInRiskMaster");
		action.moveToElement(HomePage.MouseHover).build().perform();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		
		String newwindowhandle = driver.getWindowHandle();
		HomePage.MastersLink.click();
		Thread.sleep(2000);
		HomePage.RiskMasterLink.click();
		Utility.captureScreenshot(driver, "RiskMasterLinkClicked");
		Thread.sleep(2000);
		
		return new RiskMastersPage();
	}

}
